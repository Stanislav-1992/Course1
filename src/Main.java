public class Main {
    public static void main(String[] args) {

        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Иван", "Иванов", "Иванович", 1, 5_000);
        employees[1] = new Employee("Денис", "Денисов", "Денисович", 1, 10_000);
        employees[2] = new Employee("Николай", "Николаев", "Николаевич", 2, 15_000);
        employees[3] = new Employee("Виктор", "Викторов", "Викторович", 2, 20_000);
        employees[4] = new Employee("Тимофей", "Тимофеев", "Тимофеевич", 3, 25_000);
        employees[5] = new Employee("Петр", "Петров", "Петрович", 3, 30_000);
        employees[6] = new Employee("Михаил", "Михайлов", "Михаилович", 4, 35_000);
        employees[7] = new Employee("Василий", "Васильев", "Васильевич", 4, 40_000);
        employees[8] = new Employee("Олег", "Олегов", "Олегович", 5, 45_000);
        employees[9] = new Employee("Константин", "Константинов", "Константинович", 5, 50_000);

        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
        for (int i = 0; i < employees.length; i++) {
            System.out.println("ФИО сотрудника (id " + new Employee().getGenerateID() + "): " + employees[i].getName().charAt(0)
                    + "." + employees[i].getNameOne().charAt(0) + "." + employees[i].getNameTwo().charAt(0));
        }
        employees[0].setSalary(55_555);
    }
}