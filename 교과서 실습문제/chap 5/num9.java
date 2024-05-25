package chap5;
import java.util.*;

interface Stack{
	int length();
	int capacity();
	String pop();
	boolean push(String val);
}
class StringStack implements Stack{
	private int cnt, length;
	String stack[];
	StringStack(int cnt){
		this.cnt = cnt;
		length = 0;
		stack = new String[cnt];
	}
	public int length() {
		return length;
	}
	public int capacity() {
		return cnt;
	}
	public String pop() {
		if(length -1 < 0)  
	         return null;
		  length--; 
	      String sa = stack[length]; 
	      return sa;
	}
	public boolean push(String val) {
		if(length < cnt) {
			stack[length] = val;
			length++;
			return true;
		}
		else
			return false;
	}
}
public class num9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("총 스택 저장 공간의 크기 입력 >> ");
		int a = sc.nextInt();
		
		StringStack s = new StringStack(a);
		while(true) {
			System.out.print("문자열 입력 >> ");
			String val = sc.next();
			if(val.equals("그만")) {
				break;
			}
			else if(!s.push(val)) {
				System.out.println("스택이 꽉 차서 푸시 불가!");
			}
		}
		System.out.print("스택에 저장된 모든 문자열 팝: ");
		for(int i = 0; i < a; i++) {
			System.out.print(s.pop() + ' ');
		}
		sc.close();
	}
	
}
