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


        printBorder();
        printEmployees();
        printBorder();
        printFullNameOfEmployees();
        printBorder();
        System.out.println("Сумма всех ЗП составляет: " + calculateSumOfSalary());
        printBorder();
        System.out.println("Сотрудник с максимальной ЗП: " + findEmployeeWithMaxSalary());
        printBorder();
        System.out.println("Сотрудник с минимальной ЗП: " + findEmployeeWithMinSalary());
        printBorder();
        System.out.println("Средняя ЗП составляет: " + calculateMiddleOfSalary());
        printBorder();
        percentSalary();
        printBorder();
        printEmployeesWithSalaryLessNumber(10_000);
        printBorder();
        printEmployeesWithSalaryMoreNumber(5000);
        printBorder();
        System.out.println("Средняя ЗП по отделу 1 составляет: " + findMiddleSalaruFromDepartmen(1));
        printBorder();
        System.out.println("Сотрудник с максимальной ЗП во 2 отделе: " + findEmployeeWithMaxSalaryFromDepartment(2));
        printBorder();
        System.out.println("Сотрудник с минимальной ЗП в 3 отделе: " + findEmployeeWithMinSalaryFromDepartment(3));
        printBorder();
        System.out.println("Сумма всех ЗП в 4 отделе составляет: " + calculateSumOfSalaryFromDepartment(4));
        printBorder();
        percentSalaryFromDepartment(5);
        printBorder();
        printEmployeesFromDepartment(5);

    }

    private static void printBorder() {
        System.out.println("=======================");
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

    private static void percentSalary() {
        System.out.println("Сотрудники с индексацией ЗП в 7%:");
        int percent = 7;
        for (Employee employee : EMPLOYEES) {
            employee.setSalary(employee.getSalary() + (employee.getSalary() * percent / 100));
            System.out.println(employee);
        }
    }

    private static void printEmployeesWithSalaryLessNumber(int number) {
        System.out.println("Список сотрудников с ЗП меньше " + number + " руб.:");
        for (Employee employee : EMPLOYEES) {
            if (employee.getSalary() < number) {
                System.out.println(employee);
            }
        }
    }

    private static void printEmployeesWithSalaryMoreNumber(int number) {
        System.out.println("Список сотрудников с ЗП большей или равной " + number + " руб.:");
        for (Employee employee : EMPLOYEES) {
            if (employee.getSalary() >= number) {
                System.out.println(employee);
            }
        }
    }

    private static double findMiddleSalaruFromDepartmen(int department) {
        int count = 0;
        int sum = 0;
        for (Employee employee : EMPLOYEES) {
            if (employee != null && employee.getDepartament() == department) {
                count++;
                sum += employee.getSalary();
            }
        }
        if (count != 0) {
            return (double) sum / count;
        }
        return 0;
    }
    private static Employee findEmployeeWithMaxSalaryFromDepartment(int department) {
        Employee employeeWithMaxSalary = null;
        int maxSalary = Integer.MIN_VALUE;
        for (Employee employee : EMPLOYEES) {
            if (employee.getSalary() > maxSalary && employee.getDepartament() == department) {
                maxSalary = employee.getSalary();
                employeeWithMaxSalary = employee;
            }
        }
        return employeeWithMaxSalary;

    }

    private static Employee findEmployeeWithMinSalaryFromDepartment(int department) {
        Employee employeeWithMinSalary = null;
        int minSalary = Integer.MAX_VALUE;
        for (Employee employee : EMPLOYEES) {
            if (employee.getSalary() < minSalary && employee.getDepartament() == department) {
                minSalary = employee.getSalary();
                employeeWithMinSalary = employee;
            }
        }
        return employeeWithMinSalary;
    }
    private static int calculateSumOfSalaryFromDepartment(int department) {
        int sum = 0;
        for (Employee employee : EMPLOYEES) {
            if (employee.getDepartament() == department) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }
    private static void percentSalaryFromDepartment(int department) {
        System.out.println("Сотрудники с индексацией ЗП в 7%:");
        int percent = 7;
        for (Employee employee : EMPLOYEES) {
            if (employee.getDepartament() == department) {
                employee.setSalary(employee.getSalary() + (employee.getSalary() * percent / 100));
                System.out.println(employee);
            }
        }
    }
    private static void printEmployeesFromDepartment(int department) {
        System.out.println("Сотрудники " + department + " отдела:");
        for (Employee employee : EMPLOYEES) {
            if (employee.getDepartament() == department) {
                System.out.println("id - " + employee.getId() + ", ФИО - " + employee.getFullName() + ", зарплата - " + employee.getSalary() + " руб.");
            }
        }
    }



}