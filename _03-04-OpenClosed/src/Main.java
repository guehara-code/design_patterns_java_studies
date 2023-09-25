public interface Shape {
    public double calculateArea();
}
class Rectangle {
    public double length;
    public double width;

    public double calculateArea() {
        return length*width;
    }

}

class Circle implements Shape {
    public double radius;

    public double calculateArea(){
        return (22/7)*radius*radius;
    }


}

class AreaCalculator {

    public double calculateShapeArea(Shape shape) {
        return shape.calculateArea();
    }

}
