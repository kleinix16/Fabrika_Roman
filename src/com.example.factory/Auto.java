public class Auto {
    private Motor motor;
    private Svetlo svetlo;
    private Vyfuk vyfuk;
    private Koleso koleso;

    public Auto(Motor motor, Svetlo svetlo, Vyfuk vyfuk, Koleso koleso) {
        this.motor = motor;
        this.svetlo = svetlo;
        this.vyfuk = vyfuk;
        this.koleso = koleso;
    }

    public int getVaha(){
        return motor.getVaha() + svetlo.getVaha() + vyfuk.getVaha()+ koleso.getVaha();
    }

    public void infoOAute(){
        System.out.println(motor);
        System.out.println(svetlo);
        System.out.println(vyfuk);
        System.out.println(koleso);
    }
}
