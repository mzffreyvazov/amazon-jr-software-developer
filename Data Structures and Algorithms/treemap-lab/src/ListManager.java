import java.util.HashMap;
import java.util.TreeMap;
import java.util.Map;
import java.util.Set;

public class ListManager {

    private static TreeMap<String, Student> studentsMap = new TreeMap<>();

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



    public void findFirstStudent(){

    // TODO 3: Get the first Entry in studentsMap
        Map.Entry<String, Student> firstEntry = studentsMap.firstEntry();

    /* TODO 4: If the first entry exists, get the Student object
        from the entry */
        if (firstEntry != null) {
            Student student = firstEntry.getValue();
            if (student != null) {
                System.out.println(student.toString());
                return;
            } else {
                System.out.println("Student not found.");
            }
        } else {
            System.out.println("No students found.");
        }

}

    public void findLastStudent(){
        Map.Entry<String, Student> lastEntry = studentsMap.lastEntry();
        if (lastEntry != null) {
            Student student = lastEntry.getValue();
            if (student != null) {
                System.out.println(student.toString());
                return;
            } else {
                System.out.println("Student not found.");
            }
        } else {
            System.out.println("No students found.");
        }

    }

    public void findNextStudent(String searchString){
        Map.Entry<String, Student> higherEntry = studentsMap.higherEntry(searchString);
        if (higherEntry != null) {
            Student student = higherEntry.getValue();
            if (student != null) {
                System.out.println(student.toString());
                return;
            } else {
                System.out.println("Student not found.");
            }
        } else {
            System.out.println("No students found.");
        }

    }


    public void findPreviousStudent(String searchString) {      
        Map.Entry<String, Student> lowerEntry = studentsMap.lowerEntry(searchString);
        if (lowerEntry != null) {
            Student student = lowerEntry.getValue();
            if (student != null) {
                System.out.println(student.toString());
                return;
            } else {
                System.out.println("Student not found.");
            }
        } else {
            System.out.println("No students found.");
        }
    }
}