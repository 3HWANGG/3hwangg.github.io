package javatest;
import java.io.*;
import java.util.*;
public class myCSVMenu {

	public static void main(String[] args) {
		int menu;
		boolean check = true;
		float[][]indat = new float[10][3];
		
		Scanner scan = new Scanner(System.in);
		do {
			System.out.println("----메뉴----");
			System.out.println("1. 읽기");
			System.out.println("2. 쓰기/종료");
			System.out.println("메뉴 선택>>");
			menu = scan.nextInt();
			switch(menu) {
			case 1:
				System.out.println("읽기");
				try {
					File csv = new File("C:\\Users\\3hwan\\OneDrive\\바탕 화면\\1.csv");
					BufferedReader br = new BufferedReader(new FileReader(csv));
					String line = null;
					int row = 0;
					do {
						line = br.readLine();	// 한 라인 읽기
						if(line != null) {
							String[] token = line.split(",",-1);	// -1 옵션은 마지막 "," 이후 빈 공백도 읽기 위한 옵션
							for(int i=0; i<3; i++) indat[row][i] = Float.parseFloat(token[i]);
							//CSV에서 읽어 배열에 옮긴 자료를 화면 확인하기 위한 출력
							for(int i=0; i<3; i++) System.out.print(indat[row][i]+",");
							System.out.println("");
							row++;
						}
					}while(line != null);
					br.close();
					
				} catch(FileNotFoundException e) {
					e.printStackTrace();
				}	catch(IOException e) {
					e.printStackTrace();
				}
				break;
			case 2:
				check = false;
				FileOutputStream out = null;
				try {
					out = new FileOutputStream("C:\\Users\\3hwan\\OneDrive\\바탕 화면\\1.csv");
					for (int i= 0; i<10; i++) {
						for (int j = 0; j < 3; j++) {
							out.write(Float.toString(indat[i][j]).getBytes("utf-8"));
							out.write(",".getBytes("utf-8"));
						}
						out.write("\n".getBytes("utf-8"));
					}
					out.close();
					System.out.println("쓰기하고 종료합니다");
					check = false;
					break;
				} catch(FileNotFoundException e) {
					System.out.println(e.getMessage());
				}	catch(IOException e) {
					System.out.println(e.getMessage());
				}finally {
					try {out.close();}catch(IOException e) {}
				}
				default:
					System.out.println("잘못된 입력함, 새로 입력하세요");
			}
			
		}while(check);
scan.close();
	}
}
