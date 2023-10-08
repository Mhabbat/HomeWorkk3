import java.util.Comparator;
public class ComparartorS implements Comparator<Employee> {

    protected Sorttype sorttype;


    public Comparator(Sorttype sorttype) {
        this.sorttype = sorttype;
    }

    public int compare(Employee emp1, Employee emp2) {
        return sorttype == Sorttype.Ascending ? Double.compare(emp1.getSalary(), emp2.getSalary()) :
                Double.compare(emp2.getSalary(), emp1.getSalary());

    }
}
