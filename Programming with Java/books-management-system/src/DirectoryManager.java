import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;

public class DirectoryManager {

    public static void listFilesAndDirectories(String directoryPath) {
        File directory = new File(directoryPath);
        File[] files = directory.listFiles();

        if (files == null || files.length == 0) {
            System.out.println("The directory is empty or does not exist.");
        }
        else {
            for (File file : files) {
                if (file.isDirectory()) {
                    System.out.println("Directory: " + file.getName());
                } else {
                    System.out.println("File: " + file.getName());
                }
            }
        }
    }

    public static void createDirectory(String directoryPath) {
        File directory = new File(directoryPath);

        if (!directory.exists()) {
            if (directory.mkdirs()) {
                System.out.println("Directory created: " + directoryPath);
            } else {
                System.out.println("Failed to create directory: " + directoryPath);
            }
        }
        else {
            System.out.println("Directory already exists: " + directoryPath);

        }
    }

    public static void renameDirectory(String currentDirectory, String newDirectory) {
        File oldDir = new File(currentDirectory);
        File newDir = new File(newDirectory);


        if (newDir.exists()) {
            System.err.println("The new directory already exists: " + newDirectory);
            return;
        }

        if (!oldDir.renameTo(newDir)) {
            System.err.println("Failed to rename directory: " + currentDirectory + " to " + newDirectory);
        }
        else {
            System.out.println("Directory renamed from " + currentDirectory + " to " + newDirectory);

        }
    }

    public static void copyFiles(String sourceDir, String destDir) {
        Path sourcePath = Paths.get(sourceDir);
        Path destPath = Paths.get(destDir);

        // TODO 4c: Write a try-catch block to handle IOException because creating a new directory and copying files can throw an IOException
        try {
            // TODO 4d: Check if the destination directory exists using the exists() method from the Files class
            if (!Files.exists(destPath)) {
                // If the destination directory does not exist, create the directory using the createDirectories() method from the Files class
                Files.createDirectories(destPath);
                System.out.println("Destination directory created: " + destDir);

            }

            // TODO 4e: Iterate through the files in the source directory using a loop
            File sourceDirectory = new File(sourceDir);
            File[] files = sourceDirectory.listFiles();
            // For each file, create a Path object using the file's name and the destDir
            for (File file : files) {
                Path destFilePath = destPath.resolve(file.getName());
                Files.copy(file.toPath(), destFilePath, StandardCopyOption.REPLACE_EXISTING);
                System.out.println("Copied: " + file.getName() + " to " + destFilePath);
            }
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }

    public static void deleteFile(String fileName) {
        File file = new File(fileName);
        if (file.delete()) {
            System.out.println("File deleted: " + fileName);

        } else {
            System.err.println("Failed to delete file: " + fileName);

        }
    }

}

