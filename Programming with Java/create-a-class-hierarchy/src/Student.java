public class Student extends Person{
    String subject;
    Teacher teacher;

    public Student(String name, Date dob, String subject, Teacher teacher) {
        this.name = name;
        this.dob = dob;
        this.subject = subject;
        this.teacher = teacher;
    }

    @Override
    void getDetails() {
        System.out.println("Name: " + name);
        System.out.println("Date of Birth: " + dob.getDate());
        System.out.println("Subject: " + subject);
        System.out.println("Teacher: " + teacher.getName());
    }

}
