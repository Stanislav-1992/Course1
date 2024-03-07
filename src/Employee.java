import java.util.Objects;

public class Employee {
    private static String name;
    private static String nameOne;
    private static String nameTwo;
    private int departament;
    private static int salary;
    private static int id = 455600;
    private static int generateID;

    public Employee() {
        generateID = ++id;
    }

    public Employee(String name, String nameOne, String nameTwo, int departament, int salary) {
        this.name = name;
        this.nameOne = nameOne;
        this.nameTwo = nameTwo;
        this.departament = departament;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getNameOne() {
        return nameOne;
    }

    public String getNameTwo() {
        return nameTwo;
    }

    public int getDepartament() {
        return departament;
    }

    public void setDepartament(int departament) {
        this.departament = departament;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public static int getGenerateID() {
        return generateID;
    }

    public static int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Сотрудник (id " + new Employee().getGenerateID() + "):" +
                "имя '" + name + '\'' +
                ", фамилия '" + nameOne + '\'' +
                ", отчество '" + nameTwo + '\'' +
                ", отдел " + "'" + departament + '\'' +
                ", зарплата " + salary + " руб." +
                ';';
    }

    public static void reternName() {
        System.out.println(name + " " + nameOne + " " + nameTwo);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return departament == employee.departament && salary == employee.salary && Objects.equals(name, employee.name) && Objects.equals(nameOne, employee.nameOne) && Objects.equals(nameTwo, employee.nameTwo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, nameOne, nameTwo, departament, salary);
    }
}