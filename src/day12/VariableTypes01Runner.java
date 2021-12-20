package day12;

public class VariableTypes01Runner {

	public static void main(String[] args) {

			VariableTypes01 obj1 = new VariableTypes01 (); // VariableTypes01 is the classname. 
			System.out.println(obj1.name); // Ali Can (Becausae it Ali Can is an object variable for all objects.
			obj1.name = "Veli han";
			System.out.println(obj1.name); // Veli Han
			
			System.out.println(obj1.id); // Null
			obj1.id = "New Id";
			System.out.println(obj1.id); // New Id
			VariableTypes01 obj2 = new VariableTypes01 ();
			System.out.println(obj2.name); // Ali Can
			
			System.out.println(obj2.id); // New Id
	
	}

}
