package arrays;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysSort2 {

	public static void main(String[] args) {
		//int arr[]= {37,21,26,88,66,99,52,34,74};
		Integer arr[]= {37,21,26,88,66,99,52,34,74};
		//내림차순 정렬 
		//The method sort(int[]) in the type Arrays is not applicable for the arguments (int[], Comparator.reverseOrder())
		//sort(T[] a, Compar~~)
		// T, E, K, V : 객체 
		Arrays.sort(arr,Comparator.reverseOrder());
		System.out.println(Arrays.toString(arr));
		

	}

}
