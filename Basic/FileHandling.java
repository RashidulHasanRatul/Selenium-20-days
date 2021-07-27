package Fundamental;

import java.io.File;
import java.io.FileWriter;

public class FileHandling {
    public static void main(String[] args) {

        try {
            File myfl = new File("C:\\Users\\hp\\Desktop\\test2.txt");
            if (myfl.createNewFile()){
                System.out.println("File is Created "+myfl.getName());
               boolean testfile=  myfl.canWrite();
                System.out.println(testfile);

            } else {
                System.out.println("File already Exists");
            }

        } catch (Exception e){
            System.out.println(e);
        }

        try {
            FileWriter flw = new FileWriter("C:\\Users\\hp\\Desktop\\test2.txt");
            flw.write("Hello this is test from code");
            flw.close();
            System.out.println("Succesfully Wrote to the file");

        } catch (Exception e){
            System.out.println(e);
        }

    }
}
