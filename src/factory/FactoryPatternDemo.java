package factory;

public class FactoryPatternDemo 
{
	public static void main(String args[])
	{
		ShapeFactory shapefactory=new ShapeFactory();
		Shape shape1= shapefactory.getShape("circle");
		Shape shape2= shapefactory.getShape("rectangle");
		Shape shape3= shapefactory.getShape("square");
		
		shape1.draw();
		shape2.draw();
		shape3.draw();
		
		
		/* without factory pattern   
		Shape circle =new Circle();
		circle.draw();
		
		 */
		
		
	}
}
