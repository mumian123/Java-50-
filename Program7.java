package program;

import java.util.Scanner;

public class Program7 {
	public static void main(String[] args) {
		int num = 0;
		int letter = 0;
		int space = 0;
		int others = 0;
		
		System.out.println("������һ���ַ�����");
		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine();
		char[] arr = string.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 48 && arr[i] <= 57) {
				num ++;
			}else if ((arr[i] >= 65 && arr[i] <= 90) || (arr[i] >= 97 && arr[i] <= 122)) {
				letter ++;
			}else if (arr[i] == 32) {
				space ++;
			}else {
				others ++;
			}
		}
		System.out.println("���֣�" + num + "������ĸ��" + letter + "�����ո�" + space + "����������" + others + "��");
		scanner.close();
	}
}
