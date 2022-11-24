public abstract class Shape {
    public String color ="red";
    public Boolean filled = true;
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(Boolean filled) {
        this.filled = filled;
    }
}
