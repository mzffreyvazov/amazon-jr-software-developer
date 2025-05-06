public class Main {
    public static void main(String[] args) {
        Student student = new Student("John Doe", 20, "Mathematics", 75);
        student.getDetails();
        student.result();
        student.fee(5000);

        Employee employee = new Employee("Jane Doe", 30, 3000);
        employee.getDetails();
        System.out.println("Salary: " + employee.computeSalary());
        System.out.println("Tax: " + employee.computeTax());

    }
}