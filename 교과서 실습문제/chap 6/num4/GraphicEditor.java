package app;

// base 패키지에서 Shape 클래스를 가져옴
import base.Shape;

// derived 패키지에서 Circle 클래스를 가져옴
import derived.Circle;

public class GraphicEditor {
	public static void main(String[] args) {
		// Shape 타입의 변수를 Circle 객체로 초기화
		Shape shape = new Circle();
		// Shape 객체의 draw 메서드를 호출
		shape.draw();
	}
}
