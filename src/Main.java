public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Иванов Иван Иванович0", "1", 100000);
        employees[1] = new Employee("Иванов Иван Иванович1", "2", 110000);
        employees[2] = new Employee("Иванов Иван Иванович2", "3", 120000);
        employees[3] = new Employee("Иванов Иван Иванович3", "4", 30000);
        employees[4] = new Employee("Иванов Иван Иванович4", "5", 140000);
        employees[5] = new Employee("Иванов Иван Иванович5", "1", 150000);
        employees[6] = new Employee("Иванов Иван Иванович6", "2", 260000);
        employees[7] = new Employee("Иванов Иван Иванович7", "3", 170000);
        employees[8] = new Employee("Иванов Иван Иванович8", "4", 180000);
        employees[9] = new Employee("Иванов Иван Иванович9", "5", 190000);


        int salarySum = 0;
        for (int i = 0; i < employees.length; i++) {
            salarySum += employees[i].getSalary();
        }
        System.out.println("Сумма затрат на зарплаты в месяц - " + salarySum);

        int minSalary = employees[0].getSalary();
        int idMinSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < minSalary) {
                minSalary = employees[i].getSalary();
                idMinSalary = i;
            }
        }
        System.out.println("Минимальная ЗП - " + employees[idMinSalary].toString());

        int maxSalary = employees[0].getSalary();
        int idMaxSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() > maxSalary) {
                maxSalary = employees[i].getSalary();
                idMaxSalary = i;
            }
        }
        System.out.println("Максимальная ЗП - " + employees[idMaxSalary].toString());

        double salaryAverage = (double) salarySum / employees.length;
        System.out.println("Средняя ЗП - " + salaryAverage);

        printEmployeesFullName(employees);

        wageIndexation(employees,1.5);
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].getSalary());
        }
    }


    public static void printEmployeesFullName(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].getFullName());
        }
    }

    public static void wageIndexation(Employee[] employees, double indexationRate) {
        for (int i = 0; i < employees.length; i++) {
            employees[i].setSalary((int) (employees[i].getSalary() * indexationRate));
        }
    }
}