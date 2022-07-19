public class Employee {

    private final String fullName;
    private int department;
    private int salary;
    private static int idCount = 1;
       public int id;


    public Employee(String fullName, int department, int salary) {

        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        this.id = idCount++;
    }


    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }


    public int getId() {
        return id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Сотрудник: " +
                "ФИО - " + fullName +
                ", Департамент - " + department + ", ЗП - " + salary +
                ", ID - " + id;
    }

}
