import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        System.out.println("Main starts");
        int a[][] = new int[3][3], b[][] = new int[3][3], c[][] = new int[3][3],i,j;
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the elements of First matrix:");
        for(i=0; i<=2; i++) {
            for(j=0; j<=2; j++) {
                a[i][j] = s.nextInt();
            }
        }
        System.out.println("Enter the elements of Second matrix:");
        for(i=0; i<=2; i++) {
            for(j=0; j<=2; j++) {
                b[i][j] = s.nextInt();
            }
        }
        s.close();
        for(i=0; i<=2; i++) {
            for(j=0; j<=2; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        System.out.println("Addition : ");
        for(i=0; i<=2; i++) {
            for(j=0; j<=2; j++) {
                System.out.print(c[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
