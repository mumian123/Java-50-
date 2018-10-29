package program;

public class Program18 {
	public static void main(String[] args) {
		for (int i = 'X'; i <= 'Z'; i++) {
			for (int j = 'X'; j <= 'Z'; j++) {
				for (int k = 'X'; k <= 'Z'; k++) {
					if (i=='X'||j==i||k=='X'||k=='Z'||k==i||k==j){
						continue;
					}
					System.out.println("A！！PK！！"+(char)i);
					System.out.println("B！！PK！！"+(char)j);
					System.out.println("C！！PK！！"+(char)k);
				}
			}
		}
	}
}
