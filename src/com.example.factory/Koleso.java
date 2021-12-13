/** v triede koleso sa odkazujeme na suciastku
 * v triede si urcujeme pocet dielov v aute ktory spolu s
 *  hodnotou vahy identifikacneho cisla a nazvu sklada koleso
 */

public class Koleso extends Suciastka {
    private int pocetDielovVAute ;

    public Koleso(int vaha, int id, String nazov, int pocetDielovVAute) {
        super(vaha, id, nazov);
        this.pocetDielovVAute = pocetDielovVAute;
    }


    @Override
    public void vypisInfo() {
        System.out.println("trieda: " + this.getClass() +
                ", nazov: " +getNazov() +
                ", vaha: "+getVaha() +
                " ,id: " +getId() +
                " ,pocet kusov: " +pocetDielovVAute);
    }


}
