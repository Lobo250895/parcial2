public class Main {
    Circle circulo= new Circle("red",false,5.5);
	    circulo.getArea();
	    circulo.getPerimeter();
	    System.out.println(circulo);

	Rectangle rectangulo =new Rectangle("red",false,1.0,2.0);
	    rectangulo.getArea();
	    rectangulo.getPerimeter();
	    System.out.println(rectangulo);

    Square cuadrado =new Square(6.6);
	    cuadrado.setWidth(6.6);
	    cuadrado.getLength();
	    System.out.println(cuadrado);
}
