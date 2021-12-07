import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public abstract class Main {

    public static Sklad lokalnySklad;
    static Person zamestnanci;
    static Double Double;
    static ArrayList<Auto> skladAut;


//    public static void main(String[] args) {
//        System.out.println("Roman Mica");
//
//        lokalnySklad = new Sklad(30);
//
//        lokalnySklad.pridajSuciastku(new Motor(52, 25652, "Test", TypyMotora.BENZIN));
//        lokalnySklad.pridajSuciastku(new Motor(52, 2565862, "Test", TypyMotora.BENZIN));
//        lokalnySklad.pridajSuciastku(new Motor(52, 2568952, "Test", TypyMotora.BENZIN));
//
//        lokalnySklad.saveStoreToFile("./test");
//        lokalnySklad.nacitajSkladzAdresaru("D:\\TEMP\\Fabrika_Roman\\src\\test");
//
//    }

    public static void main(String[] args) {
        System.out.println("Roman Mica");

        VytvorZamestnancov();

        lokalnySklad = new Sklad(30);

        skladAut = new ArrayList<Auto>(100);

        while(true){
            vygenerujHlavneMenu();
        }

    }
public static void VytvorZamestnancov(){
        Riaditel= new Person(200000, TypeOfEmployee.RIADITEL);
}

    public static void vygenerujHlavneMenu(){
        int menuIndex = 0;
        try{
            System.out.println("=== HLAVNE MENU ===");
            System.out.println("1. spracovanie suciastok");
            System.out.println("2. Zamestnanci");
            // TODO: Dalsie menu položky

            Scanner input = new Scanner(System.in);
            menuIndex = input.nextInt();

            if(menuIndex > 2){
                System.out.println("Zadal neplatnu hodnotu v menu.");
                return;
            }
            System.out.println("Zvolil si polozku: " + menuIndex);

            switch(menuIndex){
                case 1:
                    suciastkoveSubMenu();
                    break;
                case 2:
                    zmaestnanciSubMenu();
                default:
                    return;
            }

        }catch(InputMismatchException e){
            System.out.println("Zadal si nenumericku hodnotu");
        }catch (Exception e){
            System.out.println("Nieco sa pokazilo: " + e.toString());
        }

    }

    public static void suciastkoveSubMenu(){
        int menuIndex = 0;
        try{
            System.out.println("");
            System.out.println("=== SUCIASTKOVE MENU ===");
            System.out.println("1. Pridat Suciasku");
            System.out.println("2. Zobrazit zoznam suciastok");
            System.out.println("3. Nacitaj zoznam suciastok zo suboru");
            System.out.println("4. Uloz zoznam suciastok do suboru");
            System.out.println("5. Najdi suciastku");


            Scanner input = new Scanner(System.in);
            menuIndex = input.nextInt();

            System.out.println("Zvolil si polozku: " + menuIndex);

            switch(menuIndex){
                case 0:
                    return;
                case 1:
                    pridanieSuciastkyMenu();
                    return;
                case 2:
                    lokalnySklad.zobrazZoznamSuciastok();
                    return;

                case 4:
                    System.out.println("Zacaj cestu do adresaru pre ulozenie skladu");
                    String cesta = input.next();
                    lokalnySklad.saveStoreToFile(cesta);
                    return;

                case 3:
                    System.out.println("Zacaj cestu do adresaru pre nacitanie skladu");
                    String path = input.next();
                    lokalnySklad.nacitajSkladzAdresaru(path);
                    return;
                case 5:
                    System.out.println("Yadaj hladane ID");
                    int id = input.nextInt();
                    Suciastka hladaneId = lokalnySklad.findInStore(id);

                    if(hladaneId == null) {
                        System.out.println("Suciastka s id " + id +" neexistuje.");
                    }
                    else{

                        hladaneId.vypisInfo();
                    }

                    return;
                default:
                    System.out.println("Zadal neplatnu hodnotu v menu.");
                    return;
            } 

        }catch(InputMismatchException e){
            System.out.println("Zadal si nenumericku hodnotu");
        }catch (Exception e){
            System.out.println("Nieco sa pokazilo: " + e.toString());
        }
    }
    public static void zmaestnanciSubMenu(){
        int menuIndex=0;
        try{
            System.out.println("");
            System.out.println("======ZAMESTŇANECKÉ MENU======");
            System.out.println("1. Riaditeľ");
            System.out.println("2. Sekretárka");
            System.out.println("3. Ekonómka");
            System.out.println("4. Robotníci");
            System.out.println("5. Strojníci");
            System.out.println("6. Brigádnici");

            Scanner input = new Scanner(System.in);
            menuIndex = input.nextInt();

            System.out.println("Zvolil si polozku: " + menuIndex);

            switch(menuIndex){
                case 0:
                    return;
                    case 1:
                        System.out.print(Riaditel.toString());
                    return;
                default:
                    System.out.println("Zadal neplatnu hodnotu v menu.");
                    return;
            }
        }catch(InputMismatchException e){
            System.out.println("Zadal si nenumericku hodnotu");
        }catch (Exception e){
            System.out.println("Nieco sa pokazilo: " + e.toString());
        }
        }


    
    public static void pridanieSuciastkyMenu(){
        int menuIndex = 0;
        try{
            System.out.println("1. Pridat Koleso");
            System.out.println("2. Pridaj Motor");
            System.out.println("3. Pridaj Svetlá ");
            System.out.println("4. Pridaj Výfuk");

            System.out.println("    Pre navrat do hlavneho menu zadaj 0");

            Scanner input = new Scanner(System.in);
            menuIndex = input.nextInt();

            System.out.println("Zvolil si polozku: " + menuIndex);

            if(menuIndex == 0 ){
                return;
            }
            if(menuIndex > 4 ){
                System.out.println("Zadal neplatnu hodnotu v menu.");
                return;
            }

            System.out.println("Zadaj vahu suciaskty: ");
            int vaha = input.nextInt();

            System.out.println("Zadaj id suciaskty: ");
            int id = input.nextInt();

            System.out.println("Zadaj nazov suciastky: ");
            String nazov = input.next();


            switch(menuIndex){
                case 1:
                    System.out.println("Zadaj pocet suciastok v aute: ");
                    int pocedDielov = input.nextInt();
                    lokalnySklad.pridajSuciastku(new Koleso(vaha, id, nazov, pocedDielov));
                    return;
                case 2:
                    System.out.println("Zadaj motorizaciu (1. BENZIN, 2. DIESEL, 3. PLYN, 4.Hybrid): ");
                    int motorizacia = input.nextInt();
                    switch (motorizacia){
                        case 1:
                            lokalnySklad.pridajSuciastku(new Motor(vaha, id, nazov, TypyMotora.BENZIN));
                            break;
                        case 2:
                            lokalnySklad.pridajSuciastku(new Motor(vaha, id, nazov, TypyMotora.DIESEL));
                            break;
                        case 3:
                            lokalnySklad.pridajSuciastku(new Motor(vaha, id, nazov, TypyMotora.PLYN));
                            break;
                        case 4:
                            lokalnySklad.pridajSuciastku(new Motor(vaha, id, nazov, TypyMotora.HYBRID));
                            break;
                        default:
                            System.out.println("Shit happens");
                    }
                case 3:
                    System.out.println("Zadaj druh Svetla (1. LED, 2. XENON, 3. BIXENON, 4.HALOGENOVÉ, 5.MATRIX): ");
                    int svetlo = input.nextInt();
                    switch (svetlo){
                        case 1:
                            lokalnySklad.pridajSuciastku(new Svetlo(vaha, id, nazov, TypySvetiel.LED));
                            break;
                        case 2:
                            lokalnySklad.pridajSuciastku(new Svetlo(vaha, id, nazov, TypySvetiel.XENON));
                            break;
                        case 3:
                            lokalnySklad.pridajSuciastku(new Svetlo(vaha, id, nazov, TypySvetiel.BIXENON));
                            break;
                        case 4:
                            lokalnySklad.pridajSuciastku(new Svetlo(vaha, id, nazov, TypySvetiel.HALOGENOVE));
                            break;
                        case 5:
                            lokalnySklad.pridajSuciastku(new Svetlo(vaha, id, nazov, TypySvetiel.MATRIX));
                            break;
                        default:
                            System.out.println("Shit happens");
                    }
                case 4:
                    System.out.println("Zadaj druh vyfuku (1. ZAKLADNY, 2. SPORTOVY): ");
                    int vyfuk = input.nextInt();
                    switch (vyfuk){
                        case 1:
                            lokalnySklad.pridajSuciastku(new Vyfuk(vaha, id, nazov, TypyVyfukov.ZAKLADNY));
                            break;
                        case 2:
                            lokalnySklad.pridajSuciastku(new Vyfuk(vaha, id, nazov, TypyVyfukov.SPORTOVY));
                            break;
                    }
                    return;
                default:
                    System.out.println("Zadal neplatnu hodnotu v menu.");
                    return;
            }

        }catch(InputMismatchException e){
            System.out.println("Zadal si nenumericku hodnotu");
        }catch (Exception e){
            System.out.println("Nieco sa pokazilo: " + e.toString());
        }

    }
}