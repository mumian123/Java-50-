package program;

public class Program42 {
	public static void main(String[] args) {
		String result="";
		for (int i = 100; i < 1000;i++) {
			if (809*i==800*i+9*i+1) {
				result=i+" ";
			}
		}
		if (result.equals("")) {
			System.out.println("û�к��ʵ���");
		}else {
			System.out.println("���ʵ����У�"+result);
		}
	}
}
