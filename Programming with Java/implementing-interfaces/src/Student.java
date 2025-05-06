public class Student extends Person implements StudentInterface {
    private String subject;
    private int marks;

    public Student(String name, int age, String subject, int marks) {
        this.name = name;
        this.age = age;
        this.subject = subject;
        this.marks = marks;
    }

    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("Subject: " + subject + ", Marks: " + marks);
    }
    
    @Override
    public void result() {
        if (marks > 50) {
            System.out.println("Result: Pass");
        } else {
            System.out.println("Result: Fail");
        }
    }

    @Override
    public void fee(int fee) {
        System.out.println("Student has paid the fee of: " + fee);
    }   
}
