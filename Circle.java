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

    @Override
    public double getArea() {
        double area = 3.14* this.getRadius()*this.getRadius();
        System.out.println("el area del circulo es de" + area +"cm");
        return area;
    }

    public double getPerimeter(){
        double perimeter = 3.14*this.getRadius();
        System.out.println("El perimetro del circulo es de" + perimeter+ "cm" );
        return perimeter;
    }
}

