public class Square extends Rectangle {
    private double side;

    public Square(){
        super();
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(String color,boolean filled,double side){
        super(color,filled);
        this.side=side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square{ side=" + side + "width" + "length"+ "}";
    }
}
