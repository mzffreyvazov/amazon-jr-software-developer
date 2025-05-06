public class Employee extends Person implements EmployeeInterface {
    private double basicPay;

    public Employee(String name, int age, double basicPay) {
        this.name = name;
        this.age = age;
        this.basicPay = basicPay;
    }

    @Override
    public double computeSalary() {
        return basicPay + (0.2 * basicPay); // Assuming 20% bonus
    }

    @Override
    public double computeTax() {
        return computeSalary() * 0.1; // Assuming 10% tax
    }

    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("Basic Pay: " + basicPay);
        System.out.println("Salary: " + computeSalary());
        System.out.println("Tax: " + computeTax());
    }
}
