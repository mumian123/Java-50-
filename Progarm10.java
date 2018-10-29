package program;

import java.util.Scanner;

public class Progarm10 {
	public static void main(String[] args) {
		System.out.println("输入小球下落时高度和落地次数");
		Scanner scanner = new Scanner(System.in);
		float h = scanner.nextFloat();
		int n = scanner.nextInt();
		float sum = h;
		float h1 = h / 2;
		for (int i = 2; i <= n; i++) {
			sum += h1 * 2;
			h1 /= 2;
		}
		System.out.println("在"+h+"米，经过"+n+"次后，能反弹："+h1+"米，经过的距离："+sum);
		scanner.close();
	}
}
