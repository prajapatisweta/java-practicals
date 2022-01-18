//import java.io.IOException; 
// 4a
import java.util.Scanner;
public class Sort_Data {
    public static void main(String[] args) 
	{
	    SortData s=new SortData();
	    s.acceptData();
	    s.asce();
	    
	    System.out.println("Ascending Order: ");
	    s.showData();
	    s.desc();
	    System.out.println("Descending Order: ");
	    s.showData();
	}   
}
class SortData
{
    int a[]=new int[10];
    public void acceptData()throws IncompatibleClassChangeError
    {
        int i;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter array elements: ");
        s.close(); // remove when error
        for(i=0;i<=9;i++)
        {
            a[i]=s.nextInt();
        }
        
    }
    public void asce()
    {
        int i,j,t;
        for(i=0;i<=9;i++)
        {
            for(j=0;j<=8-i;j++)
            {
                if(a[j]>a[j+1])
                {
                 t=a[j];
                 a[j]=a[j+1];
                 a[j+1]=t;
                }
            }
        }
    }
    public void desc()
    {
        int i,j,t;
        for (i=0;i<=9;i++)
        {
            for(j=0;j<=8-i;j++)
            {
                if(a[j+1]>a[j])
                {
                    t=a[j+1];
                    a[j+1]=a[j];
                    a[j]=t;
                    
                }
            }
        }
    }
    
    public void showData()
    {
        int i;
        System.out.println("Sorted Elements are: ");
        for(i=0;i<=9;i++)
        {
            System.out.print(a[i] + " ");
    
        }
    }
}
