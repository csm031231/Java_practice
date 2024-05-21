package chap5;

class Points{
	private int x, y;
	public Points(int x, int y) { this.x = x; this.y = y; }
	public int getX() { return x; }
	public int getY() { return y; }
	protected void move(int x, int y) { this.x = x; this.y = y; }
}
class ColorPoints extends Points{
	private String color;
	public ColorPoints() {
		super(0,0);
		color = "BLACK";
	}
	public ColorPoints(int x, int y) {
		super(x, y);
	}
	public void setXY(int x, int y) {
		move(x, y);
	}
    public void setColor(String color) {
		this.color = color;
	}
    public String toString() {
    	return color + "색의 " + "(" + super.getX() + "," + super.getY() + ") 의 점";
    }
}
public class num6 {
	public static void main(String[] args) {
		ColorPoints zeroPoint = new ColorPoints();
		System.out.println(zeroPoint.toString() + "입니다.");
		
		ColorPoints cp = new ColorPoints(10, 10);
		cp.setXY(5, 5);
		cp.setColor("RED");
		System.out.println(cp.toString() + "입니다.");
	}
}
