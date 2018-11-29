
import java.util.ArrayList;
import java.util.Scanner;

public class CoolSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("\nEnter no of elements : =>");        //Enter no of elements 
		int n = s.nextInt();
		System.out.println("\nEnter array elements : =>");        //Enter elements in an array
		int arr[] = new int[n];
		for(int i = 0; i< n; i++){
			 arr[i] = s.nextInt();
		}
		System.out.println("\nEnter sequence count : =>");       //Enter Sequence count e.g 3 
		int t = s.nextInt();
		System.out.println("\nEnter sequence : =>");	         //Enter Sequence e.g 5 3 1 
		int r[] = new int[t];	   
		for(int i = 0; i< t; i++){
			 r[i] = s.nextInt();
		}	   
	   int arr1[] = null;
	   for(int l=0;l<r.length;l++){                              //looping through each sequence
		  int counter = 0; 
		  for(int k=0;k<n;k++){
			   ArrayList<Integer> arr2 = new ArrayList<Integer>();
			   ArrayList<Integer> arr3 = new ArrayList<Integer>();
			   ArrayList<Integer> arr4 = new ArrayList<Integer>();			   
			   if(counter >= r[l]){                             
				   break;
			   }
			   counter++;			   
			   for(int i =k;i<n;i=i+r[l]){		                //Adding data to an Arraylist for sorting 
				   arr2.add(arr[i]);                                     
				   arr3.add(i);
			   }				   
			   arr4  = insertation(arr2);                       //perform sorting
			   for(int p=0;p<arr3.size();p++){
				   arr[arr3.get(p)] = arr4.get(p);
			   }
		  }
                  System.out.println("\n"+r[l]+"-Sorting");
		  System.out.println("\n-----------------------------\n");        //Display sorted Array for each sequence
		  for(int j = 0;j<arr.length;j++){
                          if(j+1 != arr.length)
			   	System.out.print(arr[j]+",");
                          else
                             System.out.print(arr[j]);

		  }
		  System.out.println("\n-----------------------------\n");
		  System.out.println("\n");
	   }	  
	}

	public static ArrayList<Integer> insertation(ArrayList<Integer> arr){	//Insertation sort logic
		int i =0;
		for(int j =1;j<arr.size();j++){			
			int key = arr.get(j);
				for(i=j-1;i>=0 && arr.get(i)>key;i--){
						arr.set(i+1,arr.get(i)); 
				}
				arr.set(i+1, key) ;
		}
		return arr;
	}	
}
