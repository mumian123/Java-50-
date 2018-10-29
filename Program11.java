package program;

public class Program11 {
	public static void main(String[] args) {
		int sum = 0;
		for (int one = 1; one < 5; one++) {
			for (int ten = 1; ten < 5; ten++) {
				for (int hun = 1; hun < 5; hun++) {
					if (one != ten && ten != hun && hun != one) {
						System.out.print((hun * 100 + ten * 10 + one) + "  ");
						sum++;
						if (sum % 10 == 0) {
							System.out.println();
						}
					}
				}
			}
		}
		System.out.println();
		System.out.println("总共有" + sum + "个数");
	}
}
