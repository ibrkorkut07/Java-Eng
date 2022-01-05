package day23inheritanceoverriding;
/*
1) Multiple inheritance: A child class can't have multiple parents, java does not support
2) Hierarchical Inheritance: A parent class can have multiple child classes,  Java supports this
public class Vehicle{
	public void move() {
	System.out.println("All vehicles move...");
} 
	public int price() {		
	return 2000;		
	}
	public Vehicle name() {
	return new Vehicle();
	}
	public Integer age() {
	return 0;
	}
	public final String modelName() {
	return "Honda Civic";
	}   }
3) Multi Level Inheritance: Child -->  Parent  --> Grandparent, Java supports this
4) IS-A Relation: It is child-parent relation.  Dog IS-A Animal
5) HAS-A relation: It is parent-child relation.  Animal HAS-A Mammal
*/
public class Vehicle{
	public  void move() {
	System.out.println("Vehicles move...");
	}
	public int price() {
	return 10000;
	}
	public Integer age() {
	return 0;
	}
	public Vehicle name() {
	return new Vehicle();
	}   }
