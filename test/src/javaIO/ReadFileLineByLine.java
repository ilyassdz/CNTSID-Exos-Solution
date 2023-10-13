package javaIO;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadFileLineByLine {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\user\\OneDrive\\Documents\\GitHub\\desktop-tutorial\\test_file.txt"; // Replace with the path to your file

        Scanner s = new Scanner(System.in);
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath)) ) {
            String line;

            // Read and print each line of the file until the end of the file is reached.
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                s.nextLine();
                
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
