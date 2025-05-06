import java.io.*;
import java.util.Scanner;

public class Main {

    public static void textFileWrite() {
        Person person = new Person("John Doe", 30, 70.5);
        try {
            FileWriter writer = new FileWriter("file1.txt");
            writer.write(person.toString());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void printWrite() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        System.out.print("Enter weight: ");
        double weight = scanner.nextDouble();

        Person person = new Person(name, age, weight);

        try {
            PrintWriter printWriter = new PrintWriter("file2.txt");
            printWriter.println(person.toString());
            printWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void byteArrayWrite() {
        byte[] numbers = {1, 2, 3, 4, 5};
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("file3.dat");
            for (byte number : numbers) {
                fileOutputStream.write(number);
            }
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void streamWrite() {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("file4.dat");
            DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);
            Person person = new Person("Muzeffer Eyvazov", 25, 60.5);
            dataOutputStream.writeUTF(person.getName());
            dataOutputStream.writeInt(person.getAge());
            dataOutputStream.writeDouble(person.getWeight());
            dataOutputStream.flush();
            dataOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) throws Exception{
        textFileWrite();
        printWrite();
        byteArrayWrite();
        streamWrite();
        System.out.println("Data written to files successfully.");
    }
}