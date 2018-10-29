package program;
import java.io.*;
public class Program50 {
	String[] number = new String[5];
	String[] name = new String[5];
	float[][] grade = new float[5][3];
	float[] sum = new float[5];
	
	void input() throws IOException{
		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
		boolean isRecord = true;
		while (isRecord) {
			try {
				for (int i = 0; i < 5; i++) {
					System.out.print("请输入学号：");
					number[i] = bReader.readLine();
					System.out.print("请输入姓名：");
					name[i] = bReader.readLine();
					for (int j = 0; j < 3; j++) {
						System.out.print("请输入第"+(j+1)+"门课成绩：");
						 grade[i][j] = Integer.parseInt(bReader.readLine());
					}
					System.out.println();
					sum[i] = grade[i][0]+grade[i][1]+grade[i][2];
				}
			} catch (NumberFormatException e) {
				System.out.println("请输入一个数字！");
			}			
		}
	}
	
	void output() throws IOException{
		FileWriter fWriter = new FileWriter("studen.txt");
		BufferedWriter bWriter = new BufferedWriter(fWriter);
		bWriter.write("No.  "+"Name  "+"grade1  "+"grade2  "+"grade3  "+"average");
		bWriter.newLine();
		for (int i = 0; i < 5; i++) {
			bWriter.write(number[i]);
			bWriter.write("  "+name[i]);
			for (int j = 0; j < 3; j++) {
				bWriter.write("  "+grade[i][j]);
				bWriter.write("  "+(sum[i]/5));
				bWriter.write("  "+(sum[i]/5));
			}
			bWriter.close();
		}
	}
	
	public static void main(String[] args) throws Exception{
		Program50 student = new Program50();
		student.input();
		student.output();		
	}
}
