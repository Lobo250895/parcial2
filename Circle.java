public class  Circle extends Shape {
    private double radius;

    public Circle(String color, Boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public Circle (){
        super();
    }
    public Circle (String color,boolean filled){
        super(color,filled);

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


}

