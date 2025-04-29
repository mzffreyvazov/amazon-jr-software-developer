public abstract class Employee extends Person {
    Date dateOfAppointment;
    int salary;

    abstract void setSalary(int salary);
    abstract int getSalary();
    abstract String getName();
    
}
