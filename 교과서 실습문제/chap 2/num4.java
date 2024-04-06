package chap_2;
import java.util.*;
public class num4 {
	public static void main(String[] args) {
		System.out.print("정수 3개 입력 >> ");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
	
		if(a < b && b < c) {
			System.out.println(b);
		}
		else if(a > b && c > a) {
			System.out.println(a);
		}
		else{
			System.out.println(c);
		}
	
		scanner.close();
	}

}