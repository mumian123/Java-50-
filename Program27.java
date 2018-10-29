package program;

public class Program27 {
	public static boolean isRight(int i) {
		for (int j = 2; j < Math.sqrt(i); j++) {
			if (i % j == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		int cou = 0;
		for (int i = 1; i <= 100; i++) {
			if (isRight(i)) {
				System.out.print(i + " ");
				cou++;
				if(cou % 10 == 0){
					System.out.println();
				}
			}
		}
		System.out.println("�����ĸ���Ϊ" + cou);
	}
}
