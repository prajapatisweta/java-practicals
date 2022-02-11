// 8c Write a java program to read the student data from user and store it in the file
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class ReadAndCopy {
    public static void main(String[] args) throws IOException {
        int roll;
        String name, stream;
        File file = new File("Studentdata.txt");
        if (file.createNewFile()) {
            System.out.println("File is created");
        }
        else {
            System.out.println("File already exists");
        }
        FileWriter fr = new FileWriter(file);
        Scanner s = new Scanner(System.in);
        System.out.println("Enter student's roll number : ");
        roll=s.nextInt();
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter student's name : ");
        name=s1.nextLine();
        Scanner s2 = new Scanner(System.in);
        System.out.println("Enter student's stream : ");
        stream=s2.nextLine();
        s.close();
        s1.close();
        s2.close();
        fr.write("Roll number is : " +roll+ " ");
        fr.write("Name is : " +name+ " ");
        fr.write("Stream is : " +stream+ " ");
        fr.flush();
        fr.close();
        System.out.println("Data saved in file");
    }
}
