package program;

public class Program49 {
	public static void main(String[] args) {
		String string="aa bb df 23 d 3 df32 d";
		int num=1;//子字符的数量
		char[]c=string.toCharArray();
		for (int i = 0; i < c.length; i++) {
			if (c[i]==' ') {
				num++;
			}
		}
		System.out.println(string+"有子字符串： "+num +" 个");
	}

}
