/** V triede Auto spocitavame vahu vsetkych suciastok
 * a vypisujeme informacie o automobile-jeho obsah
 * motor,svetlo,vyfuk,koleso
 */
public class Auto implements Vozidlo {
    private Motor motor;
    private Svetlo svetlo;
    private Vyfuk vyfuk;
    private Koleso koleso;

    /**
     * konstrukor pre vytvorenie objektu typu auto
     * @param motor suciastka typu motor
     * @param svetlo suciastka typu svetlo
     * @param vyfuk suciastka typu vyfuk
     * @param koleso suciastka typu koleso
     */
    public Auto(Motor motor, Svetlo svetlo, Vyfuk vyfuk, Koleso koleso) {
        this.motor = motor;
        this.svetlo = svetlo;
        this.vyfuk = vyfuk;
        this.koleso = koleso;
    }

    /**
     * metoda vrati celkovu vahu automobilu
     * pozostavajuca zo vsetkych komponentov
     * @return
     */
    public int getVaha(){
        return motor.getVaha() + svetlo.getVaha() + vyfuk.getVaha()+ koleso.getVaha();
    }

    /**
     * metoda vypise informacie o jednotlivych suciastkach
     */
    public void infoOAute(){
        System.out.println(motor);
        System.out.println(svetlo);
        System.out.println(vyfuk);
        System.out.println(koleso);
    }
}
