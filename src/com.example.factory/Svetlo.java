public class Svetlo extends Suciastka {
    private TypySvetiel svetla;

    public Svetlo(int vaha, int id, String nazov, TypySvetiel svetla){
    super(vaha,id,nazov);
    this.svetla=svetla;
    }

    @Override
    public void vypisInfo() {
        System.out.println("nazov: " +getNazov() +
                ", vaha: "+getVaha()+
                ", id: " +getId() +
                ", svetla: "+svetla);
    }
}


