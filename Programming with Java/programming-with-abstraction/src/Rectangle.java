public class Rectangle extends Shape {
    private float length;
    private float width;
    private String color;

    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
        this.color = "black"; // default color
    }

    @Override
    public float calculateArea() {
        return length * width;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle with length " + length + " and width " + width);
    }

    @Override
    public void lineColor(String color) {
        this.color = color;
        System.out.println("Setting rectangle line color to " + color);

    }

    @Override
    public float calculatePerimeter() {
        return 2 * (length + width);
    }
    
}
