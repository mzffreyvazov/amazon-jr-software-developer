public class ExamSchedule {
    private ExamNode head;
    private ExamNode current;

    public ExamSchedule() {
        this.head = null;
        this.current = null;
    }


    public void addExam(String examDetails) {
        ExamNode newExam = new ExamNode(examDetails);
        // If the list is empty, set head to newExam
        if (head == null) {
            head = newExam;
            current = newExam;
            System.out.println("Exam added: " + examDetails);
            return;
        }

        // if not empty, traverse to the end of the list, and add newExam
        while (current.next != null) {
            current = current.next;
        }
        current.next = newExam;
        newExam.prev = current; 
        current = newExam;
        System.out.println("Exam added: " + examDetails);
    }


    public void viewNextExam() {
        if (current == null) {
            System.out.println("No exams available.");
        } else {
            // TODO 3: Implement the logic to move to the next exam in the list and displays it
            if (current.next != null) {
                current = current.next;
                System.out.println("Next exam: " + current.examDetails);
                if (current.next == null) {
                    System.out.println("End of the list");
                }
            } else {
                current = head;
                System.out.println("Next exam: " + current.examDetails);
            }  

        }
    }


    public void viewPreviousExam() {
        if (current == null) {
            System.out.println("No exams available.");
        } else {
            // TODO 4: Implement logic to move to the previous exam in the list and display it
            if (current.prev != null) {
                current = current.prev;
                System.out.println("Previous exam: " + current.examDetails);
                if (current.prev == head) {
                    System.out.println("At the beginning of the list");

                }
            } else {
                System.out.println("At the beginning of the list");
            }
        }
    }

    public void viewAllExamSchedule() {
        ExamNode temp = head;
        if (temp == null) {
            System.out.println("No exams scheduled.");
        } else {
            System.out.println("Exam Schedule:");
            while (temp != null) {
                System.out.println(temp.examDetails);
                temp = temp.next;
            }
        }
    }
}


