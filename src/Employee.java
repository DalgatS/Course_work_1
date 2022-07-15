public class Employee {

    private final String fullName;
    private String department;
    private int salary;
       public int id;


    public Employee(String fullName, String department, int salary) {

        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        this.id++;
    }


    public String getFullName() {
        return fullName;
    }

    public String getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }


    public int getId() {
        return id;
    }

    public void setDepartment(String department) {
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
