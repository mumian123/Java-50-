package program;
import java.util.Scanner;
public class Program44 {
	public static void main(String[] args) {
		System.out.println("������һ��ż����");
		Scanner scanner =new Scanner(System.in);
		int input=scanner.nextInt();
		while (input%2!=0) {
			System.out.println("������Ĳ���ż�������������룺");
			input=scanner.nextInt();
		}
		for (int i = 2; i < input; i++) {
			if(isRightNum(i)&&isRightNum(input-i)) {//��������ͬʱ������
				System.out.println(input+"="+i+"+"+(input-i));
				break;
			}
		}
		scanner.close();
	}
	//�ж�������ǲ��������ľ��巽����
	private static boolean isRightNum(int i) {
		for (int j = 2; j < Math.sqrt(i+1);j++) {
			if (i%j==0) {//ȷ��������
				return false;
			}
		}
		return true;
	}

}
