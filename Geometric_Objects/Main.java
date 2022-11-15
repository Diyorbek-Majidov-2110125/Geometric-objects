package project_1.Geometric_Objects;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(5);
        Triangle triangle = new Triangle(4,5,6);
        Rectangle rectangle = new Rectangle(6,7);


        circle.printCircle();
        triangle.printTriangle();
        rectangle.printRectangle();

        System.out.println("areas of cirle and triangle equals? " + circle.isEqualArea(triangle));
        System.out.println("areas of cirle and rectangle equals? " +circle.isEqualArea(rectangle));
        System.out.println("areas of triangle and rectangle equals? " +triangle.isEqualArea(rectangle));

        System.out.println("perimeters of cirle and triangle equals? " + circle.isEqualPerimeter(triangle));
        System.out.println("perimeters of cirle and rectangle equals? " +circle.isEqualPerimeter(rectangle));
        System.out.println("perimeters of triangle and rectangle equals? " +triangle.isEqualPerimeter(rectangle));

        ArrayList<GeometricObject> objects = new ArrayList<>();
        objects.add(circle);
        objects.add(triangle);
        objects.add(rectangle);
        System.out.println("Objects In Arraylist:");
        for(int i = 0; i < objects.size(); i++){
            System.out.print(objects.get(i).toString() + ",  ");
        }
    }

}
