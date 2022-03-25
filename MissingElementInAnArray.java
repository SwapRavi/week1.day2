package week1.day2;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,7,6,8,9};
		
		Arrays.sort(arr);
		System.out.println(arr);
		
		int count = 1;
		for (int i=0; i<arr.length;i++) {
			if (arr[i] !=i+count) {
				System.out.println(i+count);
				count++;
			}
		}
		

	}

}
