package chap_2;
import java.util.*;
public class num6 {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("1~99 사이의 정수를 입력하시오 >> ");
		int a = scanner.nextInt();
		
		if(a > 0 && a < 100) {
			int b = a / 10;
			int c = a % 10;
			
			if((b == 3 || b == 6 || b == 9) && (c == 3|| c == 6|| c ==9)) { 
				System.out.println("박수짝짝");
			}
			else {
				System.out.println("박수짝");
			}
		}
		else {System.out.println("1~99 사이의 정수를 입력해주세요 >> ");}
		scanner.close();
	}

}
