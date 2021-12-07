public class Motor extends Suciastka {
    private TypyMotora motorizacia;

    public Motor(int vaha, int id, String nazov, TypyMotora motorizacia) {
        super(vaha, id, nazov);
        this.motorizacia = motorizacia;
    }

    @Override
    public void vypisInfo() {
        System.out.println("trieda: " + this.getClass() +
                ", nazov: " +getNazov() +
                ", vaha: "+getVaha() +
                " , id: " +getId() +
                ", motorizacia: " + motorizacia);
    }


}
