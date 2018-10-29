package program;

import java.util.Scanner;

public class Program5 {
	public static void main(String[] args) {
		System.out.println("输入您的分数：");
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		String grade = (input>=90) ? "A" : ((input>=60) ? "B" : "C");
		System.out.println("分数段为：" + grade);
		scanner.close();
	}
}
