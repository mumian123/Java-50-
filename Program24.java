package program;

import java.util.Scanner;

public class Program24 {
	public static void main(String[] args) {
		System.out.println("���벻������λ������");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int[] arr = new int[5];
		int i = 0;
		
		while(num != 0){
			arr[i] = num % 10;
			num = num / 10;
			i++;
		}
		System.out.println("�����������" + i + "λ����");
		System.out.println("���������");
		for (int j = 0; j < i; j++) {
			System.out.print(arr[j] + " ");
		}
		scanner.close();
	}	
}
