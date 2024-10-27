package area_calcular;

public class areaCalcular {

    public double areaCircle(double radius) {
        if (radius < 0) throw new IllegalArgumentException("Radius cannot be negative");
        return Math.PI * radius * radius;
    }

    public double areaSquare(double side) {
        if (side < 0) throw new IllegalArgumentException("Side cannot be negative");
        return side * side;
    }

    public double areaRectangle(double width, double height) {
        if (width < 0 || height < 0) throw new IllegalArgumentException("Width and height cannot be negative");
        return width * height;
    }

    public double areaTriangle(double base, double height) {
        if (base < 0 || height < 0) throw new IllegalArgumentException("Base and height cannot be negative");
        return (base * height) / 2;
    }
}
