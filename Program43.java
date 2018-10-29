package program;

public class Program43 {
	public static void main(String[] args) {
		int n = 8;//位数
		int sum = 0;//总和

		// 1位数情况
		sum += n / 2;
		// 2位数情况	
		sum += (n-1)*n / 2;
		// 3位数情况
		sum += (n-1)*n*n / 2;
		// 4位数情况
		sum += (n-1)*n*n*n / 2;
		// 5位数情况
		sum += (n-1)*n*n*n*n / 2;
		// 6位数情况
		sum += (n-1)*n*n*n*n*n / 2;
		// 7位数情况
		sum += (n-1)*n*n*n*n*n*n / 2;
		// 8位数情况
		sum += (n-1)*n*n*n*n*n*n*n / 2;
		System.out.println("0到7能组成的奇数个数："+sum);
	}

}
