// 3c
import java.util.Scanner;
public class SmallestLargest {
    public static void main(String[] args) {
        int a[] = new int[5];
        int i,j,large,small;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 elements : ");
        sc.close(); // remove when error
        for(i=0; i<5; i++) {
            a[i] = sc.nextInt();
        }
        large=small=a[0];
        for(j=1; j<5; j++) {
            if(a[j] > large) {
                large = a[j];
            }
            if(a[j] < small) {
                small = a[j];
            }
            
        }
         
        System.out.println("Smallest element is : " +small);
        System.out.println("Largest element is : " +large);
        
    }  
}
