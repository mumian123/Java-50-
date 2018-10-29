package program;
import java.util.Scanner;
public class Program39 {
	public static void main(String[] args) {
		System.out.println("请输入一个整数：");
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		double sum = 0;
		if (input % 2 == 0) {
			for (double i = 2; i <= input; i+=2) {
				sum += 1/i;
				if (i == input) {
					System.out.print("1/" + (int)i);
					break;
				}
				System.out.print("1/" + (int)i + "+");
			}
		}else {
			for (double i = 1; i <= input; i+=2) {
				sum += 1/i;
				if (i == input) {
					System.out.print("1/" + (int)i);
					break;
				}
				System.out.print("1/" + (int)i + "+");
			}
		}
		System.out.println("=" + sum);
		scanner.close();
	}
}
