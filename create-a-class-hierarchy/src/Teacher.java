public class Teacher extends Employee {
    String qualification;
    String subject;

    public Teacher(String name, Date dob, String qualification, String subject, Date dateOfAppointment, int salary) {
        this.name = name;
        this.dob = dob;
        this.qualification = qualification;
        this.subject = subject;
        this.dateOfAppointment = dateOfAppointment;
        this.salary = salary;
    }

    @Override
    void getDetails() {
        System.out.println("Name of Teacher: " + this.name);
        System.out.println("Date of Birth: " + this.dob.getDate());
        System.out.println("Date of Appointment: " + this.dateOfAppointment.getDate());
        System.out.println("Subject: " + this.subject);
        System.out.println("Qualifications: " + this.qualification);
        System.out.println("Salary: " + this.getSalary());
    }
    
    @Override
    void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    int getSalary() {
        return this.salary;
    }

    @Override
    public String getName() {
        return this.name;
    }

}
