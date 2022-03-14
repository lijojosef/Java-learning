/**
 * 
 * @author lijoj
 *
 *	Java is a Statically typed language. 
 *	where each variable and expression type is already known at compile time. 
 *	Once a variable is declared to be of a certain data type, it cannot hold values of other data types. 
 *	Example: C, C++, Java.
 *
 */
public class O5DataTypes 
{
	public static void main(String[] args) 
	{
		/*
		 * Java has two categories of data:
		 * 
		 * Primitive Data Type: such as boolean, char, int, short, byte, long, float,
		 * and double Non-Primitive Data Type or Object Data type: such as String,
		 * Array, etc.
		 */

		/* Primitive data are only single values and have no special capabilities. */ 

		/*
		 * boolean data type represents only one bit of information either true or
		 * false, but the size of the boolean data type is virtual machine-dependent.
		 * Values of type boolean are not converted implicitly or explicitly (with
		 * casts) to any other type. But the programmer can easily write conversion
		 * code.
		 */
		boolean isTrue = false;

		/* The char data type is a single 16-bit Unicode character. */
		char a = 'L';

		/* It is a 32-bit signed two’s complement integer. */
		int i = 99;

		/*
		 * The byte data type is an 8-bit signed two’s complement integer. The byte data
		 * type is useful for saving memory in large arrays.
		 */
		byte b = 4;

		/*
		 * The short data type is a 16-bit signed two’s complement integer. Similar to
		 * byte, use a short to save memory in large arrays, in situations where the
		 * memory savings actually matters.
		 */
		short s = 56;

		/*
		 * The double data type is a double-precision 64-bit IEEE 754 floating-point.
		 * For decimal values, this data type is generally the default choice.
		 */
		double d = 3.141578946;

		/*
		 * The float data type is a single-precision 32-bit IEEE 754 floating-point. Use
		 * a float (instead of double) if you need to save memory in large arrays of
		 * floating-point numbers.
		 */
		float f = 4.377775f;

		/* a The long data type is a 64-bit two’s complement integer. */
		long longVar;

		System.out.println("char " + a);
		System.out.println("int " + i);
		System.out.println("byte " + b);
		System.out.println("short " + s);
		System.out.println("double " + d);
		System.out.println("float " + f);


		/* Non-Primitive Data Type or Reference Data Types */


		/*
		 * The Reference Data Types will contain a memory address of variable values
		 * because the reference types won’t store the variable value directly in
		 * memory. They are strings, objects, arrays, etc.
		 */


		// Declare String without using new operator 
		String str = "This tutorial is awesome!"; 

		// Declare String using new operator 
		String s1 = new String("This tutorial is mindblowing"); 
	}
}
