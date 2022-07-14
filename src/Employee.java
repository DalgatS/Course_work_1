public class Employee {

    private final String fullName;
    private String department;
    private int salary;
  public static int id = 0;


    public Employee(String fullName, String department, int salary) {

        this.fullName = fullName;
        this.department = department;
        this.salary = salary;

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

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


}
