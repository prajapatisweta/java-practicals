// 8b Write a java program to copy the contents from one file to other file.
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class CopyFile {
    public static void main(String[] args) {
        int a;
        FileInputStream fin;
        FileOutputStream fout;
        try {
            fin = new FileInputStream("readfile.txt");
            fout = new FileOutputStream("appendfile.txt");
            do {
                a = fin.read();
                if(a!=-1) {
                    fout.write(a);
                }
            }
            while(a!=-1);
            fin.close();
            fout.close();
            System.out.println("File Copied");
        }
        catch(IOException e) {
            System.out.println("Unable to open the file to copy");
        }
    }
}
