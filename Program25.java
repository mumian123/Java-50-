package program;

import java.util.Scanner;

public class Program25 {
	public static void main(String[] args) {
		System.out.println("������λ����");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int[] arr = new int[5];
		
		int i = 4;
		while(num != 0){
			arr[i] = num % 10;
			num = num / 10;
			i--;
		}
		
		if (arr[0] == arr[4] && arr[1] == arr[3]) {
			System.out.println("����");
		}else {
			System.out.println("�ǻ���");
		}
		
		scanner.close();
	}	
}
