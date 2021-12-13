/**v Triede Motor sa odkazujeme na triedu suciastka
 * ktore sa sklada z vahy nazvu a identifikacneho cisla
 */
public class Svetlo extends Suciastka {
    private TypySvetiel svetla;

    public Svetlo(int vaha, int id, String nazov, TypySvetiel svetla){
    super(vaha,id,nazov);
    this.svetla=svetla;
    }

    @Override
    public void vypisInfo() {
        System.out.println(
                "trieda: " + this.getClass() +
                        ", nazov: " +getNazov() +
                ", vaha: "+getVaha()+
                ", id: " +getId() +
                ", svetla: "+svetla);
    }
}


