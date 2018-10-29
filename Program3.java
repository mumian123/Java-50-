package program;

public class program3 {
	public static boolean isRight(int n) {
		int one = n % 10;
		int ten = n / 10 % 10;
		int hun = n / 100;
		if (n == ((int)Math.pow(one,3) + (int)Math.pow(ten, 3) + (int)Math.pow(hun, 3))) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		int cou = 0;
		for (int i = 100; i < 1000; i++) {
			if (isRight(i)) {
				System.out.print(i + "  ");
				cou++;
				if (cou % 10 == 0) {
					System.out.println();
				}
			}
		}
		System.out.println();
		System.out.println("总共有水仙花个数：" + cou);
	}
}
