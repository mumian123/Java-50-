package program;

import java.util.Scanner;

public class Program14 {
	public static void main(String[] args) {
		System.out.println("���������գ��ո��������");
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
		System.out.println(year+"��"+month+"��"+day+"�գ�������ĵ�"+sum+"��");
	}
}
