// take consecutive number from user and stop accepting if any prime number is entered.
import java.util.Scanner;
public class Consecutive {
    static boolean Prime(int n) {
        boolean Prime=true;
        if (n <= 1)
            return false;
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;
        return Prime;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        while(true) {
            System.out.print("Enter a number : ");
            num = sc.nextInt();
            if(Prime(num)) {
                System.out.println("Thank you!");
                break;
            }
        }
        sc.close();
    }
}
