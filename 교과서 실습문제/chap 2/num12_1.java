package chap_2;
import java.util.*;
public class num12_1 {

	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("연산 >> ");
		int a = scanner.nextInt();
		String s = scanner.next();
		int b = scanner.nextInt();
		int sum = 0;
		
		if(s.equals("+")){
            sum = a + b;
        }
        else if(s.equals("-")){
        	sum = a - b;
        }
        else if(s.equals("*")){
        	sum = a * b;
        }
        else if (s.equals("/")){
            if(b == 0){
                System.out.print("0으로 나눌 수 없습니다.");
                scanner.close();
                return;
            }
            else{
            	sum = a / b;
            }
        }
        else{
            System.out.print("잘못된 입력입니다.");
            scanner.close();
            return;
        }
        System.out.print(a+s+b+"의 계산 결과는 " + sum);

        scanner.close();
	}
}
