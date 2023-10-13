package javaIO;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

 

public class FileOutTest {
    
    public static void test(){

        try{
            FileOutputStream fout = new FileOutputStream("E:\\FileOutTest.txt");
            String str = "My Name is abdeesdamir Charik";
            byte b[] = str.getBytes();

          // DirectoryManager d = new 
          File dir = new File("E:\\FileOutTest");
          if(dir.exists())
          p("dir.exists() true");
          else p("dir.exists() false");


          
            fout.write(b);
            fout.close();
            p("ok file writen succussfly");

        }catch(IOException e){
            p(e.getMessage());
        }
    }

    public static void p(Object o){
        System.out.println(o);
    }
}
