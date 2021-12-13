public class Motor extends Suciastka {
    private TypyMotora motorizacia;

    /**
     * konstruktor vytvori  objekt motor
     * @param vaha navrati hodnotu hmotnosti
     * @param id navrati hodnotu identifikacneho cisla
     * @param nazov navrati nazov objektu
     * @param motorizacia navrati druh motoru
     */
    public Motor(int vaha, int id, String nazov, TypyMotora motorizacia) {
        super(vaha, id, nazov);
        this.motorizacia = motorizacia;
    }
    /**
     * metoda na vypisanie objektu
     */
    @Override
    public void vypisInfo() {
        System.out.println("trieda: " + this.getClass() +
                ", nazov: " +getNazov() +
                ", vaha: "+getVaha() +
                " , id: " +getId() +
                ", motorizacia: " + motorizacia);
    }


}
