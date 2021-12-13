public class Koleso extends Suciastka {
    private int pocetDielovVAute ;

    /**
     *konstruktor pre vytvorenie objektu koleso
     @param vaha navrati hodnotu hmotnosti
      * @param id navrati hodnotu identifikacneho cisla
     * @param nazov navrati nazov objektu
     * @param pocetDielovVAute navrati hodnotu dielov v automobile
     */
    public Koleso(int vaha, int id, String nazov, int pocetDielovVAute) {
        super(vaha, id, nazov);
        this.pocetDielovVAute = pocetDielovVAute;
    }

    /**
     * metoda na vypisanie objektu
     */
    @Override
    public void vypisInfo() {
        System.out.println("trieda: " + this.getClass() +
                ", nazov: " +getNazov() +
                ", vaha: "+getVaha() +
                " ,id: " +getId() +
                " ,pocet kusov: " +pocetDielovVAute);
    }


}
