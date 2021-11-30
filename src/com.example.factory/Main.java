import java.util.InputMismatchException;
import java.util.Scanner;

public abstract class Main {

    static Sklad lokalnySklad;

    public static void main(String[] args) {
        System.out.println("Roman Mica - senior software developer");

        lokalnySklad = new Sklad(30);

        while(true){
            vygenerujHlavneMenu();
        }

    }

    public static void vygenerujHlavneMenu(){
        int menuIndex = 0;
        try{
            System.out.println("=== HLAVNE MENU ===");
            System.out.println("1. spracovanie suciastok");
            // TODO: Dalsie menu položky

            Scanner input = new Scanner(System.in);
            menuIndex = input.nextInt();

            if(menuIndex > 1){
                System.out.println("Zadal neplatnu hodnotu v menu.");
                return;
            }
            System.out.println("Zvolil si polozku: " + menuIndex);

            switch(menuIndex){
                case 1:
                    suciastkoveSubMenu();
                    break;
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

            System.out.println("    Pre navrat do hlavneho menu zadaj 0");

            Scanner input = new Scanner(System.in);
            menuIndex = input.nextInt();

            System.out.println("Zvolil si polozku: " + menuIndex);

            if(menuIndex == 0 ){
                return;
            }
            if(menuIndex > 2 ){
                System.out.println("Zadal neplatnu hodnotu v menu.");
                return;
            }

            System.out.println("Zadaj vahu suciaskty: ");
            int vaha = input.nextInt();

            System.out.println("Zadaj id suciaskty: ");
            int id = input.nextInt();

            System.out.println("Zadaj nayov suciastkz: ");
            String nazov = input.next();


            switch(menuIndex){
                case 1:
                    System.out.println("Zadaj pocet suciastok v aute: ");
                    int pocedDielov = input.nextInt();
                    lokalnySklad.pridajSuciastku(new Koleso(vaha, id, nazov, pocedDielov));
                    return;
                case 2:
                    System.out.println("Zadaj motorizaciu (1. BENZIN, 2. DIZEL ...): ");
                    int motorizacia = input.nextInt();
                    switch (motorizacia){
                        case 1:
                            lokalnySklad.pridajSuciastku(new Motor(vaha, id, nazov, TypyMotora.BENZIN));
                            break;
                        case 2:
                            lokalnySklad.pridajSuciastku(new Motor(vaha, id, nazov, TypyMotora.DIESEL));
                            break;
                        default:
                            System.out.println("Shit happens");
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