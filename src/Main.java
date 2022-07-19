public class Main {

    public static void main(String[] args) {
        System.out.println("Basic difficulty");
        System.out.println();
        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Иванов Иван Иванович0", 1, 100000);
        employees[1] = new Employee("Иванов Иван Иванович1", 2, 110000);
        employees[2] = new Employee("Иванов Иван Иванович2", 3, 120000);
        employees[3] = new Employee("Иванов Иван Иванович3", 4, 30000);
        employees[4] = new Employee("Иванов Иван Иванович4", 5, 140000);
        employees[5] = new Employee("Иванов Иван Иванович5", 1, 150000);
        employees[6] = new Employee("Иванов Иван Иванович6", 2, 260000);
        employees[7] = new Employee("Иванов Иван Иванович7", 3, 170000);
        employees[8] = new Employee("Иванов Иван Иванович8", 4, 180000);
        employees[9] = new Employee("Иванов Иван Иванович9", 5, 190000);


        sumSalary(employees);
        minSalary(employees);
        maxSalary(employees);
        averageSalary(employees);
        printEmployeesFullName(employees);

        System.out.println();
        System.out.println();
        System.out.println("Advanced difficulty");
        System.out.println();
        wageIndexation(employees, 1.5);
        departmentMinSalary(employees, 2);
        departmentMaxSalary(employees, 3);
        departmentSumSalary(employees, 4);
        departmentAverageSalary(employees, 4);

    }

    public static void sumSalary(Employee[] employees) {
        int salarySum = 0;
        for (int i = 0; i < employees.length; i++) {
            salarySum += employees[i].getSalary();
        }
        System.out.println("Сумма затрат на зарплаты в месяц - " + salarySum);
    }

    public static void minSalary(Employee[] employees) {
        int minSalary = employees[0].getSalary();
        int idMinSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < minSalary) {
                minSalary = employees[i].getSalary();
                idMinSalary = i;
            }
        }
        System.out.println("Минимальная ЗП - " + employees[idMinSalary].toString());
    }

    public static void maxSalary(Employee[] employees) {
        int maxSalary = employees[0].getSalary();
        int idMaxSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() > maxSalary) {
                maxSalary = employees[i].getSalary();
                idMaxSalary = i;
            }
        }
        System.out.println("Максимальная ЗП - " + employees[idMaxSalary].toString());
    }

    public static void averageSalary(Employee[] employees) {
        int salarySum = 0;
        for (int i = 0; i < employees.length; i++) {
            salarySum += employees[i].getSalary();
        }
        double salaryAverage = (double) salarySum / employees.length;
        System.out.println("Средняя ЗП - " + salaryAverage);
    }

    public static void printEmployeesFullName(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].getFullName());
        }
    }


    // Advanced difficulty
    public static void wageIndexation(Employee[] employees, double indexationRate) {
        for (int i = 0; i < employees.length; i++) {
            employees[i].setSalary((int) (employees[i].getSalary() * indexationRate));
        }
    }


    public static void departmentMinSalary(Employee[] employees, int departmentNum) {
        int minSalary = employees[0].getSalary();
        int idMinSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < minSalary && employees[i].getDepartment() == departmentNum) {
                minSalary = employees[i].getSalary();
                idMinSalary = i;
            }
        }
        System.out.println("Минимальная ЗП в отделе " + departmentNum + " - " + employees[idMinSalary].toString());
    }

    public static void departmentMaxSalary(Employee[] employees, int departmentNum) {
        int maxSalary = employees[0].getSalary();
        int idMaxSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() > maxSalary && employees[i].getDepartment() == departmentNum) {
                maxSalary = employees[i].getSalary();
                idMaxSalary = i;
            }
        }
        System.out.println("Максимальная ЗП в отделе " + departmentNum + " - " + employees[idMaxSalary].toString());
    }

    public static void departmentSumSalary(Employee[] employees, int departmentNum) {
        int salarySum = 0;

        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == departmentNum) {
                salarySum += employees[i].getSalary();
            }
        }
        System.out.println("Сумма затрат на зарплаты " + departmentNum + " отдела в месяц - " + salarySum);
    }

    public static void departmentAverageSalary(Employee[] employees, int departmentNum) {
        int salarySum = 0;
        int employeesCount = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == departmentNum) {
                salarySum += employees[i].getSalary();
                employeesCount++;
            }
        }
        System.out.println("Средняя арифметическая затрат на зарплаты " + departmentNum + " отдела в месяц - " + salarySum / employeesCount);
    }
}