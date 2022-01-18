// 3b 
public class Sum_Digits {
    public static void main(String[] args) {
        String str = "2678543987";
        char array[] = str.toCharArray();
        long s = SumOfDigits.sumOfDigits(array);
        System.out.println("Sum of digits is : " +s);
    }
}
class SumOfDigits {
    public static long sumOfDigits(char arr[]) {
        long sum = 0;
        for(int i=0; i<arr.length; i++) {
            sum = sum + (arr[i] - '0');
        }
        return sum;
    }
}
