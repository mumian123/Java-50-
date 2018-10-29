package program;
import java.util.Scanner;

public class Program37 {
	public static void main(String[] args) {
		System.out.print("请输入一个整数：");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		//定义数组变量标识某人是否还在圈内
		boolean[]isIn = new boolean[n];
		for(int i=0;i<isIn.length;i++){
			isIn[i] =true;
		}
		int inCount = n;//定义圈内人数
		int countNum = 0;//定义报数
		int index = 0;//定义索引
		while(inCount>1){//最后一人时退出循环
			if(isIn[index]){//判断下一个人是否在圈内
				countNum++;//在的话报数
				if(countNum==3){//如果这个数等于3
					isIn[index] =false;//把他定义为出圈
					countNum = 0;//报数清零，下一个好从1开始
					inCount--;//圈内人数减一
				}
			}
			index++;//下一人的位置索引值
			if(index==n){//当索引到最后之后再从头开始
				index = 0;
			}
		}
		for(int i=0;i<n;i++){
			if(isIn[i]){//最后只有一个符合条件的
				System.out.println("留下的是："+(i+1));
			}
		}
	}
}

