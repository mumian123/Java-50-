package program;

import java.util.Scanner;

public class Program6 {
	public static void main(String[] args) {
		int bigDivisor = 0;
		int multiple = 0;
		System.out.println("��������������");
		Scanner scanner = new Scanner(System.in);
		int input1 = scanner.nextInt();
		int input2 = scanner.nextInt();
		multiple = input1 * input2;
		int temp = 1;
		
		if(input2 > input1){
			temp = input1;
			input1 = input2;
			input2 = temp;
		}
		
		while (temp != 0) {
			temp = input1 % input2;
			input1 = input2;
			input2 = temp;
		}
		
		bigDivisor = input1;
		multiple = multiple / bigDivisor;
		System.out.println("���Լ��Ϊ��" + bigDivisor);
		System.out.println("��С������Ϊ��" + multiple);
		scanner.close();
	}
}
