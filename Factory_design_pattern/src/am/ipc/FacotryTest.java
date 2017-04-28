package am.ipc;

public class FacotryTest {

	public static void main(String[] args) {
		 ShapeFactory shapeFactory = new ShapeFactory();

	      //get an object of Circle and call its draw method.
	      Shape shape1 = shapeFactory.getShape(ShapeTypes.CIRCLE);

	      //call draw method of Circle
	      shape1.draw();

	      //get an object of Rectangle and call its draw method.
	      Shape shape2 = shapeFactory.getShape(ShapeTypes.RECTANGLE);

	      //call draw method of Rectangle
	      shape2.draw();

	      //get an object of Square and call its draw method.
	      Shape shape3 = shapeFactory.getShape(ShapeTypes.SQUARE);

	      //call draw method of circle
	      shape3.draw();

	}

}
