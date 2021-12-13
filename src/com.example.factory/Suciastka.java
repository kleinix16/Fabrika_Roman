import java.io.Serializable;

public abstract class Suciastka implements Serializable {

    private int vaha;
    private int id;
    private String nazov;

    /**
     *
     */
    public Suciastka(int vaha, int id, String nazov) {
        this.vaha = vaha;
        this.id = id;
        this.nazov = nazov;
    }

    public abstract void vypisInfo();

    public int getVaha() {
        return vaha;
    }

    public int getId() {
        return id;
    }

    public String getNazov() {
        return nazov;
    }
}
