package chap_2;
import java.util.*;
public class num2 {
	
	public static void main(String[] args) {
	System.out.println("2자리수 정수 입력(10~99)>> ");
	Scanner scanner = new Scanner(System.in);
	
	int a = scanner.nextInt();
	
	if(a / 10 == a % 10) {
		System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
	}
	else {
		System.out.println("No..");
	}
	scanner.close();
	}
}
