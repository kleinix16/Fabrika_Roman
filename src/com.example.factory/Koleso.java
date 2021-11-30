public class Koleso extends Suciastka {
    private int pocetDielovVAute ;

    public Koleso(int vaha, int id, String nazov, int pocetDielovVAute) {
        super(vaha, id, nazov);
        this.pocetDielovVAute = pocetDielovVAute;
    }


    @Override
    public void vypisInfo() {
        System.out.println("nazov: " +getNazov() +
                ", vaha: "+getVaha() +
                " ,id: " +getId() +
                " ,pocet kusov: " +pocetDielovVAute
        );
    }
}
