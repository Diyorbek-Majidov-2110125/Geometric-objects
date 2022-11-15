package project_1.Geometric_Objects;

public abstract class GeometricObject {

    public abstract double getArea();

    public abstract double getPerimeter();

    public  boolean isEqualArea(GeometricObject object){
        if(getArea()==object.getArea()) return true;
        else return false;
    }
    public  boolean isEqualPerimeter(GeometricObject object){
        if(getPerimeter()==object.getPerimeter())
            return true;
        else
            return false;
    }

}
