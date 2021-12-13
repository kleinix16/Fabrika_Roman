public class Vyfuk extends Suciastka {
    private TypyVyfukov vyfuky;

    /**
     * konstruktor pre vytvorenie objektu typu vyfuk
     * @param vaha navrati hodnotu hmotnosti
     * @param id navrati hodnotu identifikacneho cisla
     * @param nazov navrati nazov objektu
     * @param vyfuky  navrati druh vyfuku
     */
    public Vyfuk(int vaha,int id, String nazov, TypyVyfukov vyfuky){
    super(vaha,id, nazov);
    this.vyfuky=vyfuky;
    }

    /**
     * metoda na vypis
     */
    @Override
    public void vypisInfo() {
        System.out.println(
                "trieda: " + this.getClass() + ", nazov: " +getNazov() +
                ", vaha: "+getVaha()+
                ", id: " +getId() +
                ", vyfuk: "+vyfuky);
    };
}
