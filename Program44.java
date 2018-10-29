package program;
import java.util.Scanner;
public class Program44 {
	public static void main(String[] args) {
		System.out.println("请输入一个偶数：");
		Scanner scanner =new Scanner(System.in);
		int input=scanner.nextInt();
		while (input%2!=0) {
			System.out.println("你输入的不是偶数，请重新输入：");
			input=scanner.nextInt();
		}
		for (int i = 2; i < input; i++) {
			if(isRightNum(i)&&isRightNum(input-i)) {//两个加数同时是素数
				System.out.println(input+"="+i+"+"+(input-i));
				break;
			}
		}
		scanner.close();
	}
	//判断这个数是不是素数的具体方法：
	private static boolean isRightNum(int i) {
		for (int j = 2; j < Math.sqrt(i+1);j++) {
			if (i%j==0) {//确定是素数
				return false;
			}
		}
		return true;
	}

}
