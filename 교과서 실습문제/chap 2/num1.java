package chap_2;
import java.util.*;
public class num1 {
	
	public static void main(String[]args) {
		System.out.println("원화를 입력하세요(단위 원) >>");
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		double b = a / 1100;
		
		System.out.println(a+"원은 "+b+"입니다.");
		scanner.close();
	}
}
