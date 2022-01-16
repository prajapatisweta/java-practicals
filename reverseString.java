import java.util.Scanner;
public class reverseString {
    public static void main(String[] args) {
        String original, reverse = "";
        Scanner in = new Scanner(System.in);
        System.out.print("\nEnter a string to reverse : ");
        original = in.nextLine();
        int length = original.length();
        in.close();
        for(int i = length - 1; i>=0; i--){
            reverse = reverse + original.charAt(i);
        }
        System.out.println("\nReverse of entered string is : "+reverse);
    }
}
