package program;

public class Program9 {
	public static void main(String[] args) {
		System.out.println("1000以内的因数有：");
		for (int i = 0; i <= 1000; i++) {
			int sum = 0;
			for (int j = 1; j < i/2+1; j++) {
				if (i % j == 0){
					sum += j;
					if (i == sum) {
						System.out.print(i + " ");
					}
				}
			}
		}
	}
}
