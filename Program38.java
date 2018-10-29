package program;
import java.util.Scanner;
public class Program38 {
	public static void main(String[] args) {
		System.out.println("请输入一串字符：");
		Scanner scanner=new Scanner(System.in);
		String input=scanner.next();//获取输入的字符串
		System.out.println("你输入的字符串是："+input);
		System.out.println("你输入的字符串长度是："+input.length());
		scanner.close();
	}
}
