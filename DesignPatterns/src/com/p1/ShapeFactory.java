package com.p1;

public abstract class ShapeFactory {
	public static GeometricShape getShape(ShapeType name) {
		GeometricShape shape = null;
		switch(name) {
		case LINE:
			shape = new Line();
			break;
		case CIRCLE:
			shape = new Circle();
			break;
		case RECTANGLE:
			shape = new Rectange();
			break;
		
		}
		return shape;
	}
}
