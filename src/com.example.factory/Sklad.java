import java.util.ArrayList;
import java.io.*;


public class Sklad {
    private ArrayList<Suciastka> sklad;
    private int velkostSkladu;

    /**sklad nam sluzi na urcenie si velkosti skladu
     * do ktoreho sa budu ukladat suciastky.
     */
    public Sklad( int velkostSkladu) {
        this.sklad = new ArrayList<Suciastka>(velkostSkladu);
        this.velkostSkladu = velkostSkladu;
    }

    /**
     * Metoda sluzi na pridanie suciastyz do lokaleneho skladu
     * @param suciastka Suciastka ktora sa ma pridat do skladu
     * @return Boolean hodnota, ci suciastka bola ulozena
     */
    public boolean pridajSuciastku(Suciastka suciastka){
        if(sklad.size() == velkostSkladu){
            System.out.println("Suciastku sa nepodarilo pridat, sklad je plny");
            return false;
        }

        if(findInStore(suciastka.getId()) != null){
            System.out.println("Suciastku nebola pridana - existuje uz v sklade.");
            return false;
        }
        sklad.add(suciastka);
        System.out.println("Suciastku bola pridana.");
        return true;
    }

    /** sluzi na zobrazenie suciastok,
     * ktore sme vytvorili v predchadzajucej metore
     */
    public void zobrazZoznamSuciastok(){
       sklad.forEach((item)  ->
               item.vypisInfo()
       );
    }

    /**nacitanie skladu z adresaru nam sluzi v subMenuSuciastok
     * kde nacitavame suciastu z prislusneho adresara (test)
     *v nom su ulozene objekty
     */
    public void nacitajSkladzAdresaru(String path){
        File directoryPath = new File(path);
        String contents[] = directoryPath.list();
        for(int i=0; i<contents.length; i++) {
            if(contents[i].contains(".obj")){
                nacitajSuciastkuZoSuboru(path + "/"+contents[i] );
            }
        }
    }

    /** v tejto metode nacitavame suciastku zo suboru,

     */
    public boolean nacitajSuciastkuZoSuboru(String filepath){
        Suciastka s;
        ObjectInputStream in;
        try{
            in=new ObjectInputStream(new FileInputStream(filepath));

            if(filepath.contains("Motor")){
               s = (Motor)in.readObject();
                System.out.println("Nacitana suciastka Motor:");
            } else if (filepath.contains("Svetlo")) {
                 s = (Svetlo) in.readObject();
                System.out.println("Nacitana suciastka Svetlo:");
            } else if (filepath.contains("Vyfuk")) {
                 s = (Vyfuk) in.readObject();
                System.out.println("Nacitana suciastka Vyfuk:");
            } else if (filepath.contains("Koleso")) {
                 s = (Koleso) in.readObject();
                System.out.println("Nacitana suciastka Koleso:");
            } else {
                System.out.println("Typ suciastky nebol rozoznany  :/");
                return false;
            }

            in.close();

            s.vypisInfo();
            pridajSuciastku(s);

        }catch(Exception e){System.out.println(e);}
        return true;
    }

    /**metoda sluzi na  ulozenie suciastky do suboru
     * v prislusnej zlozke test, pouzity cyklus for each
     */
    public void saveStoreToFile(String path){
        sklad.forEach((item)  ->{
            String filePath = path + "/" + item.getClass().toString().replace(" ", "_") + "_" + item.getId() + ".obj" ;

            try{
                //Creating stream and writing the object
                FileOutputStream fout=new FileOutputStream(filePath);
                ObjectOutputStream out=new ObjectOutputStream(fout);
                out.writeObject(item);
                out.flush();
                //closing the stream
                out.close();
                System.out.println("success");
            }catch(Exception e){
                System.out.println(e);
            }

             }
        );
    }

    /**metoda sluzi na vyhladanie suciastky pomocou
     * identifikacneho cisla ktore piseme do konzoly
     */
    public Suciastka findInStore(int id){
        for(int i = 0; i < sklad.size(); i++ ){
            if(sklad.get(i).getId() == id){
                return sklad.get(i);
            }
        }
        return null;
    }


}
