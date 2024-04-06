package chap_2;
import java.util.*;
public class num8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("원의 중심과 반지름 입력>> ");
		double x = scanner.nextDouble();
		double y = scanner.nextDouble();
		double r = scanner.nextDouble();
		System.out.print("점 입력>> ");
		double x1 = scanner.nextDouble();
		double y1 = scanner.nextDouble();
		
		double distance = Math.sqrt(((x-x1)*(x-x1))+((y-y1)*(y-y1)));
        
		if(distance < r) {
			 System.out.print("점 (" +x1+ "," + y1 + ")은 원 안에 있다");
        }
        else{
            System.out.print("점 (" +x1+ "," + y1 + ")은 원 안에 없다");
        }
        scanner.close();
	}

}
