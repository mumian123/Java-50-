package program;
import java.util.Scanner;
import java.util.Arrays;;
public class Program35 {
	public static void main(String[] args) {

		System.out.print("请输入一组数：");
		Scanner scan = new Scanner(System.in).useDelimiter("\\s");
        int[]arrA = new int[50];
        int m = 0;//数组的长度
        while(scan.hasNextInt()){//不断给数组A赋值
        	arrA[m++] =scan.nextInt();
        }
        scan.close();//关闭输入流
        int[]arrB = new int[m];//创建数组B，要求刚好适应输入的数字的个数
        for(int i=0;i<m;i++){
        	arrB[i] =arrA[i];//把数组A不为零的数值赋值给数组B
        }
        int max=0;
        int min=arrB[1];//定义数组的最小值
        for (int i = 0; i < arrB.length; i++) {
        	if (arrB[i]>max) {//求数组的最大值
        		max=arrB[i];
        	}

        	if (arrB[i]<=min) {//求数组的最小值
        		min=arrB[i];
			}
		}
		int max_i=0;//定义数组最大值的下标
		int min_i=0;//定义数组最小值的下标
		for (int i = 0; i < arrB.length; i++) {

			if (max==arrB[i]) {
			max_i=i;
			}
		}
		int temp=0;//定义一个交换值
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
