import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ListManager {

    private static HashMap<String, Student> studentsMap = new HashMap<>();

    public ListManager(Student [] students){
        for (Student student: students) {
            studentsMap.put(student.lastName, student);
        }
    }


    public void listStudents( ){
        if (studentsMap.isEmpty()) {
            System.out.println("There are no students");
        } else {
            System.out.println("Listing all Students");
            Set<Map.Entry<String, Student>> entries = studentsMap.entrySet();
            for (Map.Entry<String, Student> entry: entries) {
                System.out.println(entry.getValue().toString());
            }
        }

    }

    public void findStudent(String lastName){

        if (!studentsMap.containsKey(lastName)) {
            System.out.println("Key not found");
        }

        Student student = studentsMap.get(lastName);


        if (student != null) {
            System.out.println(student.toString());
        }

    }


    public void updateStudentStatus(String lastName, String newStatus){

        Student student = studentsMap.get(lastName);
        if (student != null) {
            student.status = newStatus;
            System.out.println("Updated the student");
            System.out.println("Before: " + lastName + " - UNDER-REVIEW");
            System.out.println("After: " + lastName + " - " + newStatus);
        } else {
            System.out.println("Student does not exist");
        }

    }


    public void removeStudent(String lastName){

        Student removedStudent = studentsMap.remove(lastName);
        


        if (removedStudent != null) {
            System.out.println("Removed student: " + removedStudent.toString());
        } else {
            System.out.println("Student was not removed");
        }

    }
}