public class Rectangle extends Shape {

    private double width ;
    private double length;

    public Rectangle() {
        super();
        this.setWidth(1);
        this.length(1);
    }

    public Rectangle(String color,boolean filled) {
        super(color,filled);
    }

    public Rectangle(String color,boolean filled ,double width, double length) {
        super(color,filled);
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length) {
        super();
        this.width = width;
        this.length = length;
    }




}
