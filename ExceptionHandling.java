// 9c. Write a java program to implement exception handling
import java.util.Scanner;
public class ExceptionHandling {
    public static void main(String[] args) {
        int a,b,c;
        int d[]=new int[3];
        System.out.println("Main Starts");
        System.out.print("Enter 2 values : ");
        try {
            Scanner s = new Scanner(System.in);
            a = s.nextInt();
            b = s.nextInt();
            c = a/b;
            System.out.println("Division : "+c);
            d[12]=34;
            s.close();
        }
        catch(ArithmeticException ae) {
            System.out.println("Arithmetic Exception occurs");
        }
        catch(NumberFormatException nfe) {
            System.out.println("Number Format Exception occurs");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of boundary exception occurs ");
            
        }
        finally{
            System.out.println("Finally always executes");
        }
    }
}
