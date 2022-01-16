import java.util.Scanner;
public class Area {
    
    public static void main(String[] args) {
        
	    System.out.println("Calculating Area and Perimeter of Circle");

        Scanner sc = new Scanner(System.in);
        float radius = 0;
        System.out.print("Enter the radius: ");
        radius = sc.nextFloat();

		System.out.println("Area of Circle with radius " +radius+ " = " +(3.14*radius*radius));
		System.out.println("Perimeter of Circle with radius " +radius+ " = " +(3.14*2*radius));
        sc.close();
	}
}

