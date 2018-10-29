package program;

import java.util.Arrays;
import java.util.Scanner;

public class Program28 {
	public static void main(String[] args) {
		System.out.println("请输入10个数：");
		int[] arr = new int[10];
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		
		int temp = 0;
		for (int i = 0; i < 9; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("排序后：" + Arrays.toString(arr));
		scanner.close();
	}
}
