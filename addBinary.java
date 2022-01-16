import java.util.Scanner;
public class addBinary {
    public static void main(String[] args) {
        long b1, b2;
        int r=0, i=0;
        int[] sum = new int[20];
        Scanner in=new Scanner(System.in);
        System.out.println("\nInput first binary number: ");
        b1 = in.nextLong();
        System.out.println("\nInput second binary number: ");
        b2 = in.nextLong();
        while (b1!=0 || b2!=0) {
            sum[i++] = (int)((b1%10 + b2%10 + r)%2);
            r = (int)((b1%10 + b2%10 + r)/2);
            b1 = b1/10;
            b2 = b2/10;
        }
        if(r!=0) {
            sum[i++] = r;
        }
        i--;
        System.out.println("\nSum of Two Binary Numbers : ");
        while(i>=0) {
            System.out.print(sum[i--]);
        }
        in.close();

    }
}
