public class Main {
    public static void main(String[] args) {
        Date date1 = new Date(1, 1, 2005); //dob of student
        Date date2 = new Date(10, 10, 1995); //dob of teacher
        Date date3 = new Date(1, 4, 2024); //dateOfAppointment of teacher

        Teacher teacher = new Teacher("Madhavan", date2, "MTech", "Electronics", date3, 50000);
        Student student = new Student("Belinda", date1, "Electronics", teacher);

        teacher.getDetails();
        student.getDetails();
    }
}