public class Main {
    public static void main(String[] args) {

        Student[] students = new Student[5];
        students[0] = new Student(1,"John", 19);
        students[1] = new Student(2,"Jane", 20);
        students[2] = new Student(3,"Mike", 21);
        students[3] = new Student(4,"Sara", 22);
        students[4] = new Student(5,"Tom", 23);

        printArray("First version", students);

        int IndexToDelete = 1;
        students = removeElement(IndexToDelete, students);

        Student newStudent = new Student(6, "Alice", 24);
        AddElement(newStudent, students);

        int IndexToUpdate = 2;
        updateElement(IndexToUpdate, students);
    }
    public static Student[] removeElement(int IndexToDelete, Student[] originalArray){
        Student[] newArray = new Student[originalArray.length - 1];

        for (int i =0; i < originalArray.length; i++){
            if (i < IndexToDelete) {
                newArray[i] = originalArray[i];
            } else if (i > IndexToDelete) {
                newArray[i - 1] = originalArray[i];
            }
        }

        String message = "Removing the index: " + IndexToDelete;
        printArray(message, newArray);
        return newArray;

    }
    public static Student[] AddElement(Student newStudent,Student[] originalArray){

        Student[] newArray = new Student[originalArray.length + 1];
        for (int i = 0; i < originalArray.length; i++) {
            newArray[i] = originalArray[i];
        }
        newArray[newArray.length - 1] = newStudent;
        printArray("Add", newArray);
        return newArray;
    }
    public static void updateElement(int indexToUpdate, Student[] originalArray){
        
        originalArray[indexToUpdate].setName("Updated Name");
        originalArray[indexToUpdate].setAge(25);
        originalArray[indexToUpdate].setRollNumber(10);

        printArray("Update",originalArray);
    }
    public static void printArray(String message, Student[] students){
        System.out.println("Current Action: " + message);

        for (Student student : students) {
            System.out.println("Roll Number: " + student.getRollNumber() + ", Name: " + student.getName() + ", Age: " + student.getAge());

        }
    }
}
