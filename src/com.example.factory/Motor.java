/**
 *v Triede Motor sa odkazujeme na triedu suciastka
 * v triede si urcujeme motorizaciu ktora sa sklada
 * z vahy identifikacneho cisla a nazvu nasledne
 */
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
