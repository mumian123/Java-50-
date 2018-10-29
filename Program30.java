package program;

import java.util.Arrays;
import java.util.Scanner;

public class Program30 {
	public static void main(String[] args) {
		System.out.println("请输入一个数字：");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int[] arrA = {3, 5, 15, 36, 84, 99};
		int[] arrB = new int[arrA.length + 1];
		if (num > arrA[arrA.length-1]) {
			for (int i = 0; i < arrA.length; i++) {
				arrB[i] = arrA[i];
			}
			arrB[arrB.length - 1] = num;
		}else {
			for (int i = 0; i < arrA.length; i++) {
				if (num < arrA[i]) {
					for (int j = 0; j < i; j++) {
						arrB[j] = arrA[j];
					}
					arrB[i] = num;
					for (int j = i; j < arrA.length; j++) {
						arrB[j+1] = arrA[j];
					}
					break;	
				}
			}
		}
		System.out.println("插入一个数后的数组为：" + Arrays.toString(arrB));
	    scanner.close();
	}
}
