package project_1.Geometric_Objects;

public class Triangle extends GeometricObject{
    private double side1;
    private double side2;
    private double side3;

    private String type = "Triangle";



    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
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

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }
    public double getArea(){
        double p = (side1 + side3 + side2)/2;
        double area = Math.sqrt(p * (p - this.side1)*(p - this.side2)*(p - this.side3));
        return  area;
    }

    public double getPerimeter(){
        return this.side1 + this.side2 + this.side3;
    }

    public void printTriangle(){
        System.out.println("Triangle: \nPerimeter = " + getPerimeter() + "\nArea = " + getArea());
    }

}
