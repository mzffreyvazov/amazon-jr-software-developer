public class Circle extends Shape {
    private float radius;
    private String color;

    public Circle(float radius) {
        this.radius = radius;
        this.color = "black"; // default color
    }

    @Override
    public float calculateArea() {
        return (float) (Math.PI * radius * radius);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle with radius " + radius);
    }

    @Override
    public float calculatePerimeter() {
        return (float) (2 * Math.PI * radius);
    }

    @Override
    public void lineColor(String color) {
        this.color = color;
        System.out.println("Setting circle line color to " + color);
    }
    
}
