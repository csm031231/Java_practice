package chap_3;
import java.util.*;
public class num6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("금액을 입력하시오 >> ");
		int a = sc.nextInt();
		
		int[] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};
		
		for(int i = 0; i < unit.length; i++) {
			if(a / unit[i] > 0) {
				System.out.println(unit[i] + "원은" + a/unit[i]+"매 입니다 ");
				a %= unit[i];
			}
		}
	}
}
