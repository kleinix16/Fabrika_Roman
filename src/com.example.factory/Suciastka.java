import java.io.Serializable;

/**
 * vseobecna trieda pre popisanie suciastky v automobile
 */
public abstract class Suciastka implements Serializable {

    private int vaha;
    private int id;
    private String nazov;

    /**
     * konstruktor pre vytvorenie objektu suciastka
     * @param vaha hmotnost suciastky
     * @param id identifikacne cislo suciastky
     * @param nazov nazov suciastky
     */
    public Suciastka(int vaha, int id, String nazov) {
        this.vaha = vaha;
        this.id = id;
        this.nazov = nazov;
    }

    public abstract void vypisInfo();

    /**
     *metoda pre premennu vaha
     * @return navrati vahu
     */

    public int getVaha() {
        return vaha;
    }

    /**
     * metoda vrati hodnotu pre premennu identifikacne cislo
     * @return navrati identifikacne cislo
     */
    public int getId() {
        return id;
    }

    /**
     * metoda vrati hodnotu  nazvu suciastky
     * @return navrati nazov
     */
    public String getNazov() {
        return nazov;
    }
}
