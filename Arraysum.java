package cycle2;

import java.util.Scanner;

public class Arraysum {


	public static void main(String args[]){
		int num,sum=0,x, flag =0,i;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the number of elements in the  array:");
		num = in.nextInt();
		
		int a[] = new int[num];
		
		
		System.out.println("The elements are:");
		for(i=0;i<num;i++)
		{
			a[i]=in.nextInt();
		}
		for(i=0;i<num;i++)
		{
		System.out.print(" "+a[i]);	
		}
		System.out.println();
		System.out.println("The sum of the elements are:");
		for(i=0; i<num; i++)
		{
			sum = sum + a[i];
		}
		System.out.println(sum);
	}
	

}
