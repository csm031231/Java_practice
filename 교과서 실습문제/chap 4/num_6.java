package chap4;
import java.util.*;

class Circ {
	private double x, y;
	private int radius;
	public Circ(double x, double y, int radius) {
		this.x = x; this.y = y; this.radius = radius;
	}
	public void show() {
		System.out.println("(" + x + "," + y + ")" + radius);
	}
	int getradius() {
		return radius;
	}
}
public class num_6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x, y;
		int radius;
		int max = 0;
		
		Circ c [] = new Circ [3];
		for(int i = 0; i < c.length; i++) {
			System.out.print("x, y, radius >> ");
			x = sc.nextDouble();
			y = sc.nextDouble();
			radius = sc.nextInt();
			c[i] = new Circ(x, y, radius);
		}
		for(int i = 0; i < c.length; i++) {
			if(c[i].getradius()>c[max].getradius()) {
				max = i;
			}
		}
		System.out.print("가장 큰 원의 면적은>> ");
		c[max].show();
		sc.close();
	}
}
