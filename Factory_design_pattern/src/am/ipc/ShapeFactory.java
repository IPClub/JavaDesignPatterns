package am.ipc;

import am.ipc.shapes.Rectangle;
import am.ipc.shapes.Square;
import am.ipc.shapes.Circle;

public class ShapeFactory {

	public Shape getShape(ShapeTypes shapeType) {
		if (shapeType == null) {
			return null;
		}
		switch (shapeType) {
			case CIRCLE:
				return new Circle();
	
			case RECTANGLE:
				return new Rectangle();
			
			case SQUARE:
				return new Square();

			default:
				return null;
		}

	}
}
