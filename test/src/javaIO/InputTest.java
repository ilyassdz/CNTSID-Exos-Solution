package javaIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import util.U;

public class InputTest {
    
    public static void test(){
        try {
            FileInputStream fileInputStream = new FileInputStream("E:\\BufferOutTest.txt");
int i;
            while((i = fileInputStream.read()) != -1)
            U.p((char) i);

            fileInputStream.close();
            

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
