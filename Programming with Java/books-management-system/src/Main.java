import java.io.File;

public class Main {

    public static void main(String[] args) {

    //    String directoryPath = "./myBooks";
    //    String[] titles = {"The Great Gatsby", "1984", "To Kill a Mockingbird"};
    //    String[] authors = {"F. Scott Fitzgerald", "George Orwell", "Harper Lee"};

    //    for (int i = 0; i < titles.length; i++) {
    //        String fileName =  (titles[i]) + ".txt";
    //        String content = "Title: " + titles[i] + "\nAuthor: " + authors[i] + "\nSample Content...";
    //        FileCreator.createSampleFile(directoryPath, fileName, content);
    //    }
    //    System.out.println("List of files in the directory: " + directoryPath);
    //    DirectoryManager.listFilesAndDirectories(directoryPath);



    //    String directoryPath2 = "./myBooksBackup";
    //    DirectoryManager.createDirectory(directoryPath2);



    //    String newDirectoryPath = "./BooksBackupDirectory";
    //    DirectoryManager.renameDirectory(directoryPath2, newDirectoryPath);


//      Task 4 testing

    //    String srcPath = "./myBooks";
    //    String destPath = "./BooksBackupDirectory";
    //    DirectoryManager.copyFiles(srcPath, destPath);


//     Task 5 testing

    //    String filePath = "./myBooks/1984.txt";
    //    DirectoryManager.deleteFile(filePath);


//     Task 6 testing

       Book book = new Book("1984", "George Orwell", "978-0451524935");
       String filePath = "./myBooks/book.ser";
       Book.serializeBook(book, filePath);
       Book deserializedBook = Book.deserializeBook(filePath);


    }

}
