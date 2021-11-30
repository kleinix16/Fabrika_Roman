public class Person {
    public int salary;
    public TypeOfEmployee position;

    public Person(int salary, TypeOfEmployee position) {
        this.salary = salary;
        this.position = position;
    }

    @Override
    public String toString() {
        return "Person{" +
                "salary=" + salary + "€" +
                ", position=" + position +
                '}';
    }
}
