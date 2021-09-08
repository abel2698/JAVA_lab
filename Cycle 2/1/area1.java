package graphics;
public class area1
{
public static void main(String args[])
	{
		Square s=new Square();
		Rectangle r=new Rectangle();
		Triangle t=new Triangle();
		Circle c=new Circle();
		System.out.println("Area of square: "+s.area(5,0));
		System.out.println("Area of rectangle: "+r.area(5,10));
		System.out.println("Area of triangle: "+t.area(3,6));
		System.out.println("Area of circle: "+c.area(5,0));
	}
}
   