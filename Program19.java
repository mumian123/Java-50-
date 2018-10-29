package program;

public class Program19 {
	public static void main(String[] args) {
		int n = 4;
		for (int i = 0; i < n; i++) {
			for (int j = 3-i; j > 0; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k <= 2*i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		int m = 3;
		for (int i = m; i > 0; i--) {
			for (int j = 3-i+1; j > 0; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k < 2*i-1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
