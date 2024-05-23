package chap5;
class Point1{
	private int x, y;
	public Point1(int x, int y) { this.x = x; this.y = y; }
	public int getX() { return x; }
	public int getY() { return y; }
	protected void move(int x, int y) { this.x = x; this.y = y; }
}
class Point3D extends Point1{
	int z;
	public Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}
	public void moveUp() {
		this.z++;
	}
	public void moveDown() {
		this.z--;
	}
	protected void moves(int x, int y) { 
		move(x,y);
	}
	protected void move(int x, int y, int z) { 
		move(x, y);
		this.z = z;
	}
	public String toString() {
		return "(" + super.getX() + "," + super.getY() + "," + z + ")의 점";
	}
}
public class num7 {
	public static void main(String[] args) {
		Point3D p = new Point3D(1,2,3);
		System.out.println(p.toString() + "입니다.");
		
		p.moveUp();
		System.out.println(p.toString() + "입니다.");
		
		p.moveDown();
		p.move(10, 10);
		System.out.println(p.toString() + "입니다.");
		
		p.move(100, 200, 300);
		System.out.println(p.toString() + "입니다.");
	}
}
