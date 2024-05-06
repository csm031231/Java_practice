package chap4;
import java.util.*;
class Circle{
	private double x, y;
	private int radius;
	public Circle(double x, double y, int radius) {
		this.x = x; this.y = y; this.radius = radius;
	}
	public void show() {
		System.out.println("(" + x + "," + y + ")" + radius);
	}
}
public class num_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x, y;
		int radius;
		Circle c [] = new Circle [3];
		for(int i = 0; i < c.length; i++) {
			System.out.print("x, y, radius >> ");
			x = sc.nextDouble();
			y = sc.nextDouble();
			radius = sc.nextInt();
			c[i] = new Circle(x, y, radius);
		}
		for(int i = 0; i < c.length; i++) {
			c[i].show();
			
		}
		sc.close();
	}
}

