public class Main {

    private static final Employee[] EMPLOYEES = new Employee[10];
    public static void main(String[] args) {
        EMPLOYEES[0] = new Employee("Иванов Иван Иванович", 1, 5_000);
        EMPLOYEES[1] = new Employee("Денисов Денис Денисович", 1, 10_000);
        EMPLOYEES[2] = new Employee("Николаев Николай Николаевич", 2, 15_000);
        EMPLOYEES[3] = new Employee("Викторов Виктор Викторович", 2, 20_000);
        EMPLOYEES[4] = new Employee("Тимофеев Тимофей Тимофеевич", 3, 25_000);
        EMPLOYEES[5] = new Employee("Петров Петр Петрович", 3, 30_000);
        EMPLOYEES[6] = new Employee("Михайлов Михаил Михайлович", 4, 35_000);
        EMPLOYEES[7] = new Employee("Васильев Василий Васильевич", 4, 40_000);
        EMPLOYEES[8] = new Employee("Олегов Олег Олегович", 5, 45_000);
        EMPLOYEES[9] = new Employee("Константинов Константин Константинович", 5, 50_000);


        printEmployees();
        printFullNameOfEmployees();
        System.out.println("Сумма всех ЗП составляет: " + calculateSumOfSalary());
        System.out.println("Сотрудник с максимальной ЗП: " + findEmployeeWithMaxSalary());
        System.out.println("Сотрудник с минимальной ЗП: " + findEmployeeWithMinSalary());
        System.out.println("Средняя ЗП составляет: " + calculateMiddleOfSalary());
    }

    private static void printEmployees() {
        System.out.println("Сотрудники:");
        for (Employee employee : EMPLOYEES) {
            System.out.println(employee + ";");
        }
    }

    private static void printFullNameOfEmployees() {
        System.out.println("ФИО сотрудников:");
        for (Employee employee : EMPLOYEES) {
            System.out.println(employee.getFullName() + ";");
        }
    }

    private static int calculateSumOfSalary() {
        int sum = 0;
        for (Employee employee : EMPLOYEES) {
            sum += employee.getSalary();
        }
        return sum;
    }

    private static Employee findEmployeeWithMaxSalary() {
        Employee employeeWithMaxSalary = null;
        int maxSalary = Integer.MIN_VALUE;
        for (Employee employee : EMPLOYEES) {
            if (employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                employeeWithMaxSalary = employee;
            }
        }
        return employeeWithMaxSalary;

    }

    private static Employee findEmployeeWithMinSalary() {
        Employee employeeWithMinSalary = null;
        int minSalary = Integer.MAX_VALUE;
        for (Employee employee : EMPLOYEES) {
            if (employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                employeeWithMinSalary = employee;
            }
        }
        return employeeWithMinSalary;
    }

    private static double calculateMiddleOfSalary() {
        return (double) calculateSumOfSalary() / EMPLOYEES.length;
    }

}
