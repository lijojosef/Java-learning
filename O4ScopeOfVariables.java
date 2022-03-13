/**
 * 
 * @author lijoj
 * 
 * Scope of a variable is the part of the program where the variable is accessible.
 *
 */
public class O4ScopeOfVariables 
{
	//	Member Variables (Class Level Scope)
	private static int x;
	public static void main(String[] args) 
	{
		//		Local Variables (Method Level Scope)
		int a = 15;
		x = 5;
		int b = a + x;
		System.out.println("a" + "x = " + b);
		int y;
		//		Loop Variables (Block Scope) 
		for(y = 0; y < 5; y++)
		{
			System.out.println(y);
		}

	}
}

/*
 * Some points to remember In general, a set of curly brackets { } defines a
 * scope. 
 * In Java we can usually access a variable as long as it was defined
 * within the same set of brackets as the code we are writing or within any
 * curly brackets inside of the curly brackets where the variable was defined.
 * 
 * Any variable defined in a class outside of any method can be used by all
 * member methods.
 * When a method has the same local variable as a member, “this”
 * keyword can be used to reference the current class variable. 
 * For a variable to be read after the termination of a loop, It must be declared before the
 * body of the loop.
 */