package program;

import java.util.Arrays;

public class Program31 {
	public static void main(String[] args) {
		int[] arrA = {1,3,44,22,77,99};
		int[] arrB = new int[arrA.length];
		int j = arrA.length;
		for(int i=0; i < arrA.length; i++){
			arrB[i] = arrA[j-1];
			j--;
		}
		System.out.println(Arrays.toString(arrB));
	}
}
