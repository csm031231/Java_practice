package derived;

import base.Shape;

public class Circle extends Shape {
    // Shape 클래스의 draw 메서드를 오버라이드하여 "Circle"을 출력
    @Override
    public void draw() {
        System.out.println("Circle");
    }
}
