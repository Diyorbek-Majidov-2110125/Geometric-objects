package project_1.Geometric_Objects;

public class Rectangle extends GeometricObject{
    private double width;
    private double height;

    private String type = "Rectangle";



    public Rectangle(){};

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
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

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }


    public double getArea(){
        return this.width * this.height;
    }
    public double getPerimeter(){
        return 2 * (this.height + this.width) ;
    }
    public void printRectangle(){
        System.out.println("Rectangle: \nPerimeter = " + getPerimeter() + "\nArea = " + getArea());
    }

}
