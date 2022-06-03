package com.question3;

public class AbstractAndInterface {
	
	/*
	 * Explain abstract class and interface with an example.
	 * 
	 * In JAVA, when we need to define a category and this category can have different 
	 * properties according to need of the child(after being inherited),
	 * i.e., When we need abstraction in JAVA, we use 'Abstract Class' or 'Interface'.
	 * 
	 *    
	 *    Abstract Class is a type of class that needs to be inherited.
	 *    If any other class doesn't inherits or extends the Abstract Class then there is no 
	 *    meaning of the Abstract Class.
	 *    
	 *     And, Interface is almost same as the Abstract Class
	 *     The only difference is that Abstract Class is used for partial abstraction
	 *     And, Interface is used for complete abstraction.
	 *     i.e., Abstract Class may or may not have an abstract method 
	 *     But, an Interface can have abstract methods only.
	 *     
	 *     Abstract Class needs to be extended.
	 *     Interface needs to be implemented.
	 *     
	 *     Below is an example of an abstract class.
	 *     Abstract Class is used to achieve 0 to 100 percent abstraction.
	 *     It can have implemented methods, abstract methods and variables as well.
	 *     If a class extends this abstract class, then that class must override its 
	 *     abstract methods.
	 *     
	 *     There is also an example of Interface in this package as Inter.java
	 *     Interface is a structure used to achieve 100% abstraction in Java.
	 *     An interface can only have abstract methods
	 *     If a class implements an interface, then that class must override all the methods 
	 *     present inside the interface. 
	 * 
	 */
}


abstract class Demo{
	
	int x = 10;
	
	public void fun1() {
		System.out.println("inside fun1 of Demo");
	}
	
	public abstract void fun2();
}



