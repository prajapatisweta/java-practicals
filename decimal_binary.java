import java.util.Scanner;
public class decimal_binary {
    public static void main(String[] args) {
        int decimal_num, i, decimal;
        long binary_num;
        System.out.println("\n1. Decimal to Binary");
        System.out.println("2. Binary to Decimal");
        System.out.println("\nEnter your choice: ");
        Scanner choice = new Scanner(System.in);
        int c = choice.nextInt();
        switch(c) {
            case 1:
                    Scanner in = new Scanner(System.in);
                    System.out.println("Enter a Decimal number: ");
                    decimal_num = in.nextInt();
                    int binary[] = decimal_binary.convertDecimalToBinary(decimal_num);
                    System.out.print("\nIt's equivalent binary number is: ");
                    in.close();
                    for(i = binary.length - 1; i>=0; i--) {
                        System.out.print(binary[i]);
                    }
                    break;
                    
            case 2:
                    Scanner n = new Scanner(System.in);
                    System.out.println("\nEnter a Binary number: ");
                    binary_num = n.nextLong();
                    decimal = decimal_binary.convertBinaryToDecimal(binary_num);
                    System.out.print("\nIt's equivalent decimal number is : " +decimal);
                    break;
                default:
                    System.out.println("\nIncorrect choice");
                    break;
                
        }
        choice.close(); 
    }
        public static int[]convertDecimalToBinary(int num) {
            int bin[] = new int[30];
            int i = 0 ;
            while(num>0) {
                bin[i++] = num%2;
                num = num/2;
            }
            return bin;
        }
        public static int convertBinaryToDecimal(long num) {
            int decimalNumber = 0, i = 0;
            long remainder;
            while(num!=0) {
                remainder = num%10;
                num = num/10;
                decimalNumber = decimalNumber + (int)(remainder*Math.pow(2,i));
                ++i;
            }
            return decimalNumber;
        }
}
