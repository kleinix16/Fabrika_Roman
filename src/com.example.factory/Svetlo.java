/**v Triede Motor sa odkazujeme na triedu suciastka
 * ktore sa sklada z vahy nazvu a identifikacneho cisla
 */
public class Svetlo extends Suciastka {
    private TypySvetiel svetla;

    /**
     * konstruktor vytvori  objekt svetlo
     * @param vaha navrati hodnotu hmotnosti
     * @param id navrati hodnotu identifikacneho cisla
     * @param nazov navrati nazov objektu
     * @param svetla navrati druh svetla
     */
    public Svetlo(int vaha, int id, String nazov, TypySvetiel svetla){
    super(vaha,id,nazov);
    this.svetla=svetla;
    }

    /**
     * metoda pre vytvorenie vypisu
     */
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


