package chap_3;
import java.util.*;
public class num4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("소문자 알파벳 하나를 입력하시오>> ");
		String a = sc.next();
		char c = a.charAt(0);
		for(char i = c; i >= 'a'; i--) {
			for(char j = 'a'; j <= i; j++ ) {
				System.out.print(j);
			}
			System.out.println();
		}
		
	}
}
