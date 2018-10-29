package program;

public class Program41 {
	public static void main(String[] args) {
		System.out.println(Peach(1));;
	}
	
	private static int Peach(int i) {
		if (i==5) {

			return 6;
		}
			return Peach(i+1)*5+1;
		}

}
