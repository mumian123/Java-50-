package program;

import java.util.Scanner;

public class Program24 {
	public static void main(String[] args) {
		System.out.println("输入不多于五位的数：");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int[] arr = new int[5];
		int i = 0;
		
		while(num != 0){
			arr[i] = num % 10;
			num = num / 10;
			i++;
		}
		System.out.println("输入的数字是" + i + "位数的");
		System.out.println("逆序输出：");
		for (int j = 0; j < i; j++) {
			System.out.print(arr[j] + " ");
		}
		scanner.close();
	}	
}
