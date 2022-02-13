// take a number from user print its sum of digits , if sum is less than 15 and odd print it's factorial 
import java.util.Scanner;
public class SumOfDigits {
    public static long factorial(int num){
        long fact = 1;
        for(int i=1; i<=num; i++) {
            fact *= i;
        }
        return fact;
    }
    public static void main(String[] args) {
        int num, rem, sum=0;
        long fact = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        num = sc.nextInt();
        while(num>0) {
            rem = num % 10;
            sum = sum + rem;
            num = num/10;
        }
        sc.close();
        System.out.println("Sum of digits = " +sum);
        if(sum%2!=0 && sum<15) {
            fact = factorial(sum);
            System.out.println("Factorial of "+sum+ " = " +fact);
        }
    }
}
