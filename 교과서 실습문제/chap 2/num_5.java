package study;

import java.util.Scanner;

public class num_5 {
	
	public static void main(String[] args) {
		 
		System.out.println("정수 3개를 입력하시오 >> ");
		
		 Scanner sc = new Scanner(System.in);
		 int a = sc.nextInt();
		 int b = sc.nextInt();
		 int c = sc.nextInt();
		 
		 
		 if((a + b) <= c || (a + c) <= b || (c + b) <= a) {
			 System.out.println("삼각형이 만들어지지 않습니다.");
		 }
		 else 
			 System.out.println("삼각형이 됩니다.");
		 
		 sc.close();
	}
}
