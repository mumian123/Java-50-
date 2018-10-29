package program;

public class Program23 {
	public static int fun(int n, int age) {
		if (n == 1) {
			return 10;
		}
		else {
			return fun(n-1, age) + age;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(fun(5, 2));
	}
}
