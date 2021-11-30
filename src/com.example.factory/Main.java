public abstract class Main {
    public static void main(String[] args) {
        System.out.println("Roman Mica - senior software developer");

        Person romanMica = new Person(10000, TypeOfEmployee.CTO);

        System.out.println(romanMica.toString());

    }
}