package program;

import java.util.Scanner;

public class Program7 {
	public static void main(String[] args) {
		int num = 0;
		int letter = 0;
		int space = 0;
		int others = 0;
		
		System.out.println("请输入一串字符串：");
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
		System.out.println("数字：" + num + "个，字母：" + letter + "个，空格：" + space + "个，其他：" + others + "个");
		scanner.close();
	}
}
