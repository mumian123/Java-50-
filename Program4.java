package program;

import java.util.Scanner;

public class program4 {
	public static void main(String[] args) {
		System.out.println("输入带分解正整数：");
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		System.out.print(input + "=");
		for (int i = 2; i <= input; i++) {
			while(input % i == 0 && input != i){
				input = input / i;
				System.out.print(i + "*");
			}
			if (input == i) {
				System.out.println(i);
				break;
			}
		}
		scanner.close();
	}
}
