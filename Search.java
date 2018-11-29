
import java.util.Scanner;

public class Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter no of elements : =>");  //Enter number of elements
		int n = s.nextInt();
		System.out.println("Enter array elements : =>");  //Enter elements in an array in sorted order           
		int arr[] = new int[n];                            
		for(int i = 0; i< n; i++){
			 arr[i] = s.nextInt();
		}		
		boolean k = searchalgo(arr,0,arr.length-1);      // function call to search if A[i] == i
		if(k){
			System.out.println("\nValue is Present (i.e A[i] = i)");
		}else{
			System.out.println("\nValue not Present (i.e A[i] != i)");
		}
	}
	public static boolean searchalgo(int [] arr,int start, int end){
		if(end>=start){
		int middle = ((start+end)/2);                   // calculate middle element
			if(arr[middle] == middle){                  // if condition satisfies return true
				return true;
			}
				if(arr[middle]>middle){                 //if element > than middle search in first half  
					end =middle-1;
					
					return	searchalgo(arr,start,end);
				}else{
					start = middle+1;                  //if element < than middle search in second half 
					
					return	searchalgo(arr,start,end);
				}
		
		}	
	return false;	                                  //return false if A[i] != i 
	}

}
