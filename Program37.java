package program;
import java.util.Scanner;

public class Program37 {
	public static void main(String[] args) {
		System.out.print("������һ��������");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		//�������������ʶĳ���Ƿ���Ȧ��
		boolean[]isIn = new boolean[n];
		for(int i=0;i<isIn.length;i++){
			isIn[i] =true;
		}
		int inCount = n;//����Ȧ������
		int countNum = 0;//���屨��
		int index = 0;//��������
		while(inCount>1){//���һ��ʱ�˳�ѭ��
			if(isIn[index]){//�ж���һ�����Ƿ���Ȧ��
				countNum++;//�ڵĻ�����
				if(countNum==3){//������������3
					isIn[index] =false;//��������Ϊ��Ȧ
					countNum = 0;//�������㣬��һ���ô�1��ʼ
					inCount--;//Ȧ��������һ
				}
			}
			index++;//��һ�˵�λ������ֵ
			if(index==n){//�����������֮���ٴ�ͷ��ʼ
				index = 0;
			}
		}
		for(int i=0;i<n;i++){
			if(isIn[i]){//���ֻ��һ������������
				System.out.println("���µ��ǣ�"+(i+1));
			}
		}
	}
}

