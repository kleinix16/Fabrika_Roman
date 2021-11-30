import java.util.ArrayList;

public class Sklad {
    private ArrayList<Suciastka> sklad;
    private int velkostSkladu;

    public Sklad( int velkostSkladu) {
        this.sklad = new ArrayList<Suciastka>(velkostSkladu);
        this.velkostSkladu = velkostSkladu;
    }

    public boolean pridajSuciastku(Suciastka suciastka){
        if(sklad.size() == velkostSkladu){
            System.out.println("Suciastku sa nepodarilo pridat, sklad je plny");
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


}
