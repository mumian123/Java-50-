package program;

public class Program20 {
	public static void main(String[] args) {
		float up = 2;
		float down = 1;
		float fraction = up / down;
		float temp = 0;
		float sum = 0;
		for (int i = 0; i < 20; i++) {
			sum += fraction;
			temp = up + down;
			down = up;
			up = temp;
			fraction = up / down;
		}
		System.out.println(sum);
	}
}
