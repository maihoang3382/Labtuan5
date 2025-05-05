package Labtuan5;
abstract class Shape {
    protected String color;
    protected boolean filled;

    public Shape() {
        this.color = "red";
        this.filled = true;
    }
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public boolean isFilled() {
        return filled;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
    public boolean equals(Object obj) {
        if (obj instanceof Shape) {
            Shape other = (Shape) obj;
            return this.color.equals(other.color) && this.filled == other.filled;
        }
        return false;
    }
    public String toString() {
        return "Shape[color=" + color + ", filled=" + filled + "]";
    }
}
class Circle extends Shape {
    private double radius;

    public Circle() {
        super();
        this.radius = 1.0;
    }
    public Circle(double radius) {
        super();
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
    public boolean equals(Object obj) {
        if (obj instanceof Circle) {
            Circle other = (Circle) obj;
            return super.equals(other) && this.radius == other.radius;
        }
        return false;
    }
    public String toString() {
        return "Circle[radius=" + radius + ", color=" + color + ", filled=" + filled + "]";
    }
}
class Rectangle extends Shape {
    protected double width;
    protected double length;
    public Rectangle() {
        super();
        this.width = 1.0;
        this.length = 1.0;
    }
    public Rectangle(double width, double length) {
        super();
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public double getArea() {
        return width * length;
    }
    public double getPerimeter() {
        return 2 * (width + length);
    }
    public boolean equals(Object obj) {
        if (obj instanceof Rectangle) {
            Rectangle other = (Rectangle) obj;
            return super.equals(other) && this.width == other.width && this.length == other.length;
        }
        return false;
    }
    public String toString() {
        return "Rectangle[width=" + width + ", length=" + length + ", color=" + color + ", filled=" + filled + "]";
    }
}
class Square extends Rectangle {
    public Square() {
        super(1.0, 1.0);
    }
    public Square(double side) {
        super(side, side);
    }
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }
    public double getSide() {
        return width;
    }
    public void setSide(double side) {
        this.width = side;
        this.length = side;
    }
    @Override
    public void setWidth(double side) {
        this.width = side;
        this.length = side;
    }
    @Override
    public void setLength(double side) {
        this.width = side;
        this.length = side;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Square) {
            Square other = (Square) obj;
            return super.equals(other);
        }
        return false;
    }
    @Override
    public String toString() {
        return "Square[side=" + width + ", color=" + color + ", filled=" + filled + "]";
    }
}
 class Main2 {
    public static void main(String[] args) {
        Shape c1 = new Circle(5.5, "blue", true);
        Shape r1 = new Rectangle(3.0, 4.0, "green", false);
        Shape s1 = new Square(2.0, "yellow", true);
        System.out.println(c1.toString());
        System.out.println("Area = " + c1.getArea());
        System.out.println("Perimeter = " + c1.getPerimeter());
        System.out.println("\n" + r1.toString());
        System.out.println("Area = " + r1.getArea());
        System.out.println("Perimeter = " + r1.getPerimeter());
        System.out.println("\n" + s1.toString());
        System.out.println("Area = " + s1.getArea());
        System.out.println("Perimeter = " + s1.getPerimeter());
    }
}
