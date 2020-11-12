package com.sandboxProject;

public class MyFirstProgram {

	public static void main (String[] args){
	//System.out.println("Hello world");
    //home task function
	Point p1 = new Point(2,5);
	Point p2 = new Point(5,9);

	System.out.println("the distance is = "+p2.checkDistance(p1,p2));

	Square s = new Square(5);

	Rectangle r = new Rectangle(5,8);

		System.out.println("square of square with side a = "+s.l +" = "+ s.area());
		System.out.println("square of rectangle with side a("+r.a+") and b("+r.b+") = "+r.area());

	}


}
