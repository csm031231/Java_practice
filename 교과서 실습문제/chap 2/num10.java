package chap_2;
import java.util.*;
public class num10 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("첫 번째 원의 중심과 반지름 입력 >> ");
		
		int x = scanner.nextInt();
		int x1 = scanner.nextInt();
		int r = scanner.nextInt();

		System.out.println("두 번째 원의 중심과 반지름 입력 >> ");
		
		int y = scanner.nextInt();
		int y1 = scanner.nextInt();
		int r1 = scanner.nextInt();
		
		double distance = Math.sqrt(((x-x1)*(x-x1))+((y-y1)*(y-y1)));
		
		if(distance <= r + r1) {
			System.out.println("두 원은 서로 겹칩니다.");
		}
		else
			System.out.println("두 원은 서로 겹치지 않습니다.");
		
		scanner.close();
	}
}
