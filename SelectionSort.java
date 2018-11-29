
import java.util.Scanner;

public class SelectionSort {
	public static int  n;
	public static int  arr [];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the part you want to run (a, b, c) : =>"); //Enter part you want to run a b or c 
		String s1 = s.next();
		SelectionSort b = new SelectionSort();		                         //Creating object of  SelectionSort class 
		System.out.println("\nEnter no of elements : =>");                   //Enter number of elements
		n = s.nextInt();
		System.out.println("\nEnter array elements : =>");                   //Enter array elements
		arr = new int[n];
		for(int i = 0; i< n; i++){
			 arr[i] = s.nextInt();
		}
		
		if(s1.equals("a")){                                                 //If choice is a then display part a
		 b.SelectionSort(arr);
		 System.out.println("\nOutput : =>");
			for(int i = 0; i< n; i++){
				if(i+1 != n) 
					System.out.print(arr[i]+",");
				else
					System.out.print(arr[i]);
			 }
		}
		if(s1.equals("b")){												   //If choice is a then display part b
		 b.SelectionSort(arr);	
		 b.ksmallest(arr);
		}
		if(s1.equals("c")){												  //If choice is a then display part c
			 b.SelectionSort(arr);	
			 b.median(arr);
		}
	}
public static void SelectionSort(int[] arr){										 //Selection sort algorithm
	for(int i=0;i<n-1;i++){
		for(int j = i+1;j<n;j++){
			if(arr[i]>arr[j]){
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp; 
			}
		}
	}
	
}
	
 public static void ksmallest(int[] arr){                              //find k smallest sequence
	 System.out.println("\nEnter value of k : =>");
	 Scanner s = new Scanner(System.in); 
	 n = s.nextInt();
	 System.out.println("\nOutput : =>");
	 for(int i =0;i<n;i++){
		 if(i+1 != n) 
				System.out.print(arr[i]+",");
			else
				System.out.print(arr[i]);
	 }
 }

 public static void median(int[] arr){                               //find median
	 if((arr.length)%2 == 0){
		System.out.println("\nMedian is :- "+(arr[((arr.length-1)/2)+1]+arr[((arr.length-1)/2)])/2f);
	 }else{
		 System.out.println("Median is :- "+arr[(int) Math.ceil((arr.length-1)/2)]);
	 }
 }

}
