import java.util.Objects;

public class Employee {
    private final int id;
    private final String fullName;
    private int departament;
    private int salary;
    private static int generateID = 1;

    public Employee(String fullName, int departament, int salary) {
        this.id = generateID++;
        this.fullName = fullName;
        this.departament = departament;
        this.salary = salary;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartament() {
        return departament;
    }

    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setDepartament(int departament) {
        this.departament = departament;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", ФИО='" + fullName + '\'' +
                ", отдел=" + departament +
                ", зарплата=" + salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return departament == employee.departament && salary == employee.salary && Objects.equals(fullName, employee.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, departament, salary);
    }
}