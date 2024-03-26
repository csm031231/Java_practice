package study;
import java.util.Scanner;
public class num_3 {
	 public static void main(String[] args) {
		 
		 Scanner sc = new Scanner(System.in);
		 System.out.println("금액을 입력하시오 >> ");
		 
		 int a = 50000, b = 10000, c = 1000, d = 500, e = 100, f = 10, g = 1;
		 int money = sc.nextInt();
		 
		 int m = money / a;
		 money = money % a;
		 if( m > 0) {
			 System.out.println("오만원권" + m + "매");
		 }
		 m = money / b;
		 money = money % b;
		 if( m > 0) {
			 System.out.println("만원권" + m + "매");
		 }
		 m = money / c;
		 money = money % c;
		 if( m > 0) {
			 System.out.println("천원권" + m + "매");
		 }
		 m = money / d;
		 money = money % d;
		 if( m > 0) {
			 System.out.println("오백원권" + m + "매");
		 }
		 m = money / e;
		 money = money % e;
		 if( m > 0) {
			 System.out.println("백원권" + m + "매");
		 }
		 m = money / f;
		 money = money % f;
		 if( m > 0) {
			 System.out.println("십원권" + m + "매");
		 }
		 m = money / g;
		 money = money % g;
		 if( m > 0) {
			 System.out.println("일원권" + m + "매");
		 }
	 }
}
