package project_1.Geometric_Objects;

public class Circle extends GeometricObject{
    private double radius;

    private String type = "Circle";



    public Circle(){};

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "type='" + type + '\'';
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * this.radius * this.radius;
    }
    public double getPerimeter(){
        return 2 * Math.PI * this.radius;
    }
    public void printCircle(){
        System.out.println("Circle: \nPerimeter = " + getPerimeter() + "\nArea = " + getArea());
    }


}
