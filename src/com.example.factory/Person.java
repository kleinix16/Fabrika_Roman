/** V triede Person mame urceny plat a poziciu pre zamestnanca
 * ktora vychadza z enum triedy TypeOfEmployee
 *
 */
public class Person {
    public int salary;
    public TypeOfEmployee position;

    public Person(int salary, TypeOfEmployee position) {
        this.salary = salary;
        this.position = position;
    }

    @Override
    public String toString() {
        return "Zamestnanec" +"{" +
                "Vyplata=" + salary + "€" +
                ", post=" + position +
                "}";
    }
}
