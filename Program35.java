package program;
import java.util.Scanner;
import java.util.Arrays;;
public class Program35 {
	public static void main(String[] args) {

		System.out.print("������һ������");
		Scanner scan = new Scanner(System.in).useDelimiter("\\s");
        int[]arrA = new int[50];
        int m = 0;//����ĳ���
        while(scan.hasNextInt()){//���ϸ�����A��ֵ
        	arrA[m++] =scan.nextInt();
        }
        scan.close();//�ر�������
        int[]arrB = new int[m];//��������B��Ҫ��պ���Ӧ��������ֵĸ���
        for(int i=0;i<m;i++){
        	arrB[i] =arrA[i];//������A��Ϊ�����ֵ��ֵ������B
        }
        int max=0;
        int min=arrB[1];//�����������Сֵ
        for (int i = 0; i < arrB.length; i++) {
        	if (arrB[i]>max) {//����������ֵ
        		max=arrB[i];
        	}

        	if (arrB[i]<=min) {//���������Сֵ
        		min=arrB[i];
			}
		}
		int max_i=0;//�����������ֵ���±�
		int min_i=0;//����������Сֵ���±�
		for (int i = 0; i < arrB.length; i++) {

			if (max==arrB[i]) {
			max_i=i;
			}
		}
		int temp=0;//����һ������ֵ
		temp=arrB[0];
		arrB[0]=arrB[max_i];
		arrB[max_i]=temp;
		for (int i = 0; i < arrB.length; i++) {
			if (min==arrB[i]) {
			min_i=i;
		}
	}

	temp=arrB[arrB.length-1];
	arrB[arrB.length-1]=arrB[min_i];
	arrB[min_i]=temp;
	System.out.println(Arrays.toString(arrB));
	scan.close();
	}
}
