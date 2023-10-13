package javaIO;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferOutTest {
    
    public static void test() {
        // Declare a FileOutputStream object for writing to a file.
        FileOutputStream stream;
    
        try {
            // Create a FileOutputStream to write data to the file "E:\\BufferOutTest.txt".
            stream = new FileOutputStream("E:\\BufferOutTest.txt");
    
            // Create a BufferedOutputStream to improve write performance.
            BufferedOutputStream bOutputStream = new BufferedOutputStream(stream);
    
            String str;
    
            // Loop from 0 to 999 (1000 times).
            for (int i = 0; i < 1000; i++) {
                // Create a string containing the value of 'i' and "testing......" with a newline.
                str = i + " testing......\n";
    
                // Convert the string to bytes and write it to the BufferedOutputStream.
                bOutputStream.write(str.getBytes());
            }
    
            // Close the BufferedOutputStream and the FileOutputStream.
            bOutputStream.close();
            stream.close();
    
        } catch (FileNotFoundException e) {
            // Handle an exception if the file is not found.
            e.printStackTrace();
        } catch (IOException e) {
            // Handle an exception if there is an I/O error during file writing.
            e.printStackTrace();
        }
    }
    
}
