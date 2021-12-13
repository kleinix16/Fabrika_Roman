public class Person {
    public int salary;
    public TypeOfEmployee position;

    /**
     * konstruktor
     * @param salary navrati plat zamestnanca
     * @param position navrati poziciu zamestnanca
     */
    public Person(int salary, TypeOfEmployee position) {
        this.salary = salary;
        this.position = position;
    }

    /**
     * metoda na vypisanie objektu
     * @return navrati poziciu a plat
     */
    @Override
    public String toString() {
        return "Zamestnanec" +"{" +
                "Vyplata=" + salary + "€" +
                ", post=" + position +
                "}";
    }
}
