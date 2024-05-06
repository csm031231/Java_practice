package chap4;
import java.util.*;

class Day {
	String work;
	void set(String work) {
		this.work = work;
	}
	String get() {return work;}
	void show() {
		if(work == null)System.out.println("없습니다.");
		else System.out.println(work + " 입니다.");
	}
}
class MonthSchedule{
	Scanner sc = new Scanner(System.in);
	int m;
	Day day[];
	MonthSchedule(int m){
		this.m = m;
		day = new Day[m];
		
	}
	void run() {
		System.out.println("이번달 스케줄 관리 프로그램.");
		while(true) {
			System.out.println("할일(입력:1, 보기:2, 끝내기:3)>> ");
			int a = sc.nextInt();
			
		}
		
	}
	void input() { //입력
		System.out.println("날짜(1~30)? ");
		System.out.println("할일(빈칸없이 입력)?");
	}
	void view() { //보기
		System.out.println("일의 할 일은 "+ +"입니다.");
	}
	void finish() { //끝내기
		
	}
}
public class num_7 {
	public static void main(String[] args) {
		MonthSchedule april = new MonthSchedule(30);
		april.run();
	}
}
