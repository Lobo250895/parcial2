public class  Circle extends Shape {
    private double radius;

    public Circle(String color, Boolean filled) {
        super(color, filled);
    }
    //constructor

    public Circle(String color, Boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public Circle (){
        super();
    }
    //constructor

    public Circle(double radius){
        this.radius=radius;
    }



    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    @Override
    public String toString() {
        return "Circle{ radius=" + radius + "}";
    }
}

