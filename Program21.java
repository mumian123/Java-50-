package program;

public class Program21 {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 20; i++) {
			int mul = 1;
			for (int j = 1; j <= i; j++) {
				mul *= j; 
			}
			sum += mul;
		}
		System.out.println(sum);
	}
}
