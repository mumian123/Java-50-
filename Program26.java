package program;

import java.util.Scanner;

public class Program26 {
	public static void main(String[] args) {
		System.out.println("�������1����ĸ");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		String input2 = "";
		switch (input) {
		case "m":
			System.out.println("Monday");
			break;
		case "t":
			System.out.println("�������2����ĸ��");
			input2 = scanner.next();
			if (input2.equals("u")) {
				System.out.println("Tuesday");
			}else if (input2.equals("h")) {
				System.out.println("Thursday");
			}else {
				System.out.println("�������ĸ����");
			}			
			break;
		case "w":
			System.out.println("Wednesday");
			break;
		case "f":
			System.out.println("Friday");
			break;
		case "s":
			System.out.println("�������2����ĸ��");
			input2 = scanner.next();
			if (input2.equals("u")) {
				System.out.println("Sunday");
			}else if (input2.equals("a")) {
				System.out.println("Saturday");
			}else {
				System.out.println("�������ĸ����");
			}			
			break;
		default:
			System.out.println("�������ĸ����");
			break;
		}
		scanner.close();
	}
}
