package chap4;
import java.util.*;
class TV{
	String n;
	int a, b;
	TV(String n, int a, int b){
		this.n = n;
		this.a = a;
		this.b = b;
	}
	void show() {
		System.out.print(n + "에서 만든 " + a + "년형 " + b+"인치 TV");
	}
}
public class num_1 {
	public static void main(String[] args) {
		TV myTv = new TV("LG", 2017, 32);
		myTv.show();
	}
}
