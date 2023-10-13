package javaIO;
import java.io.File;

public class ListFilesOfDirectory {
    public static void main(String[] args) {
        // Specify the directory path you want to list files and directories from.
        String directoryPath = "C:\\Users\\user\\OneDrive\\Documents\\GitHub\\desktop-tutorial\\test";

        // Create a File object representing the directory.
        File directory = new File(directoryPath);

        // Check if the specified path is a directory.
        if (directory.isDirectory()) {
            // Get an array of all files and directories in the specified directory.
            File[] filesAndDirectories = directory.listFiles();

            // Check if the directory is empty.
            if (filesAndDirectories != null) {
                // Iterate through the array and print the names of files and directories.
                for (File fileOrDir : filesAndDirectories) {
                    System.out.println(fileOrDir.getName());
                }
            } else {
                System.out.println("The directory is empty.");
            }
        } else {
            System.out.println("The specified path is not a directory.");
        }
    }
}
