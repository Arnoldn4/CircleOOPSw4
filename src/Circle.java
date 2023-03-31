public class Circle {
    private double radius;
    private String color;
    private double area;
    private double circumference;

    public Circle(double radius, String color) { // CONSTRUCTOR METHOD, WITH SAME NAME ATTRIBUTES = PARAMETER
        setRadius(radius);
        setColor(color);
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        area = Math.PI * this.radius * this.radius;
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
    // extension, calculate the circumference of the area
    //create method getCircumference, calculate circumference= ....
    //create setCircumference method
    public double getCircumference() {
        circumference = Math.PI * 2 * this.radius;
        return circumference;
    }

    public void setCircumference(double area) {
        this.circumference = circumference;
    }
}


