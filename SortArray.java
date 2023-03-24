package cycle2;
import java.util.*;
public class SortArray {


	public static void main(String[] args) {
		int num,i,j;
		String temp;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the number of elements in the array:");
		num = in.nextInt();
		
		String a[] = new String [num];
		a[0]= in.nextLine();
		
		System.out.println("The elements are:");
		for(i=0; i<num; i++)
		{
		 a[i] = in.nextLine();
		}
		
		System.out.println("The array is :");
		for(i=0; i<num; i++)
		{
			System.out.println(" " +a[i]);
		}
        
		for(i=0; i<num; i++) {
			for(j=i+1; j<num; j++) {
				if(a[i].compareTo(a[j])>0) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
	
		System.out.println("The sorted array:");
		System.out.println(Arrays.toString(a));
	}

}
