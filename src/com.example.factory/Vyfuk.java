/**v Triede vyfuk sa odkazujeme na triedu suciastka
 * ktory sa sklada z vahy nazvu a identifikacneho cisla
 */
public class Vyfuk extends Suciastka {
    private TypyVyfukov vyfuky;

    public Vyfuk(int vaha,int id, String nazov, TypyVyfukov vyfuky){
    super(vaha,id, nazov);
    this.vyfuky=vyfuky;
    }

    @Override
    public void vypisInfo() {
        System.out.println(
                "trieda: " + this.getClass() + ", nazov: " +getNazov() +
                ", vaha: "+getVaha()+
                ", id: " +getId() +
                ", vyfuk: "+vyfuky);
    };
}
