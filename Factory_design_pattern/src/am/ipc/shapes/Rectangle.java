package am.ipc.shapes;

import am.ipc.Shape;

public class Rectangle implements Shape {
	
	@Override
	public void draw() {
		System.out.println("Inside Rectangle::draw() method.");
	}
	
}