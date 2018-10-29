package program;

import java.util.Scanner;

public class Program1 {
	public static int rabbit(int n) {
		if (n == 1 || n == 2) {
			return 1;
		}
		else {
			return rabbit(n-1) + rabbit(n-2);
		}
	}
	
	public static void main(String[] args) {
		System.out.println("几月份的兔子：");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		System.out.println("第"+n+"个月的兔子数目:"+rabbit(n));
        scanner.close();
	}
}
