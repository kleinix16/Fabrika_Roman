import java.util.ArrayList;
import java.io.*;


public class Sklad {
    private ArrayList<Suciastka> sklad;
    private int velkostSkladu;

    public Sklad( int velkostSkladu) {
        this.sklad = new ArrayList<Suciastka>(velkostSkladu);
        this.velkostSkladu = velkostSkladu;
    }

    /**
     * Metoda sluyi na pridanie suciastkz do lokaleneho skladu
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
    public void zobrazZoznamSuciastok(){
       sklad.forEach((item)  ->
               item.vypisInfo()
       );
    }

    public void nacitajSkladzAdresaru(String path){
        File directoryPath = new File(path);
        String contents[] = directoryPath.list();
        for(int i=0; i<contents.length; i++) {
            if(contents[i].contains(".obj")){
                nacitajSuciastkuZoSuboru(path + "/"+contents[i] );
            }
        }
    }

    public boolean nacitajSuciastkuZoSuboru(String filepath){
        Suciastka s;
        ObjectInputStream in;
        try{
            //Creating stream to read the object
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

    public Suciastka findInStore(int id){
        for(int i = 0; i < sklad.size(); i++ ){
            if(sklad.get(i).getId() == id){
                return sklad.get(i);
            }
        }
        return null;
    }


}
