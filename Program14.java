package program;

import java.util.Scanner;

public class Program14 {
	public static void main(String[] args) {
		System.out.println("输入年月日（空格隔开）：");
		Scanner scanner = new Scanner(System.in);
		int year = scanner.nextInt();
		int month = scanner.nextInt();
		int day = scanner.nextInt();
		int sum = 0;
		int[] arr = {31,28,31,30,31,30,31,31,30,31,30,31};
		sum = day;
		for (int i = 1; i < month; i++) {
			sum += arr[i];
		}
		
		boolean isRight = (((year%4==0)&&(year%100!=0))||(year%400==0))&&(month>2);
		if (isRight) {
			sum += 1;
		}
		scanner.close();
		System.out.println(year+"年"+month+"月"+day+"日，是这年的第"+sum+"天");
	}
}
