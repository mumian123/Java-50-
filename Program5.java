package program;

import java.util.Scanner;

public class Program5 {
	public static void main(String[] args) {
		System.out.println("�������ķ�����");
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		String grade = (input>=90) ? "A" : ((input>=60) ? "B" : "C");
		System.out.println("������Ϊ��" + grade);
		scanner.close();
	}
}
