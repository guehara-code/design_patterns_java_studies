public class Client {
    public static void main(String[] args) {
        System.out.println("***BRIDGE PATTERN***");

        // Coloring Green to Triangle
        System.out.println("\nColoring Triangle");
        ColorInterface green = new GreenColor();
        Shape triangleShape = new Triangle(green);
        triangleShape.drawShape(20);
        triangleShape.modifyBorder(20, 3);

        // Coloring Red to Rectangle
        System.out.println("\nColoring Rectangle");
        ColorInterface red = new RedColor();
        Shape rectangeShape = new Rectangle(green);
        rectangeShape.drawShape(50);
        rectangeShape.modifyBorder(50, 2);

    }
}
