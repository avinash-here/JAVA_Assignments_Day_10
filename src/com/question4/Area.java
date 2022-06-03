package com.question4;

public class Area extends Shape{

	@Override
	public int rectangleArea(int length, int breadth) {
		System.out.println("Rectangle's Area = " + length*breadth );
		return 0;
	}

	@Override
	public int squareArea(int side) {
		System.out.println("Square's Area = " + side*side );
		return 0;
	}

	@Override
	public int circleArea(int radius) {
		System.out.println("Circle's Area = " + (22/7)*radius*radius );
		return 0;
	}

}
