public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Иванов Иван Иванович0", "1", 100000);
        employees[1] = new Employee("Иванов Иван Иванович1", "2", 110000);
        employees[2] = new Employee("Иванов Иван Иванович2", "3", 120000);
        employees[3] = new Employee("Иванов Иван Иванович3", "4", 130000);
        employees[4] = new Employee("Иванов Иван Иванович4", "5", 140000);
        employees[5] = new Employee("Иванов Иван Иванович5", "1", 150000);
        employees[6] = new Employee("Иванов Иван Иванович6", "2", 160000);
        employees[7] = new Employee("Иванов Иван Иванович7", "3", 170000);
        employees[8] = new Employee("Иванов Иван Иванович8", "4", 180000);
        employees[9] = new Employee("Иванов Иван Иванович9", "5", 190000);
        System.out.println(employees[7].getId());
        System.out.println(employees[2].getId());
        printEmployees(employees);

    }

    public static void printEmployees(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees [i]);
        }
    }
}