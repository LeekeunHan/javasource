package arrays;

import java.util.Arrays;

// BinarySearch : 이진검색 


public class ArrayBinarySearch {

	public static void main(String[] args) {
		int arr[]= {11,13,25,27,36,45,65};
		
		//검색 
		System.out.println(Arrays.binarySearch(arr, 40)); // 40은 내가 찾고자하는수 
		System.out.println(Arrays.binarySearch(arr, 36)); // 40은 내가 찾고자하는수 
		

	}

}
