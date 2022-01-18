// 4a
import java.util.*;
public class Sort {
    Scanner in=new Scanner(System.in);
	int len, i, j, temp = 0;
	int num[];
	public void getdata()
	{
		System.out.print("Enter the size of an array : ");
		len=in.nextInt();
		num=new int[len];
		System.out.print("Enter the number: ");
		for(i=0; i<len; i++)
		{
			num[i]=in.nextInt();
		}
	}
	void disp_array()
	{
		System.out.print("\nOriginal order of an array: ");
		for(i=0;i<len;i++)
		{
			System.out.print(" "+num[i]);
		}
	}
	void asce()
	{
		for(i=0;i<len;i++)
		{
			for(j=i+1;j<len;j++)
			{
				if(num[i]>num[j])
				{
					temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
			}
		}
			System.out.print("\nArray in Ascending order : ");
		for(i=0;i<len;i++)
		{
			System.out.print(" "+num[i]);
		}
	}
	void desc()
	{
		for(i=0;i<len;i++)
		{
			for(j=i+1;j<len;j++)
			{
				if(num[i]<num[j])
				{
					temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
			}
		}
		System.out.print("\nArray in Descending order : ");
		for(i=0;i<len;i++)
		{
			System.out.print(" "+num[i]);
		}
	}
	public static void main(String args[])
	{
		Sort sort=new Sort();
		sort.getdata();
		sort.disp_array();
		sort.asce();
		sort.desc();
	}
}
