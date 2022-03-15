/**
 * 
 * @author lijoj
 *	
 *	Assignment Operators

 * These operators are used to assign values to a variable. 
 * The left side operand of the assignment operator is a variable, 
 * and the right side operand of the assignment operator is a value. 
 * The value on the right side must be of the same data type of the operand on the left side. 
 * Otherwise, the compiler will raise an error. 
 * This means that the assignment operators have right to left associativity, 
 * i.e., the value given on the right-hand side of the operator is assigned to the variable on the left. 
 * Therefore, the right-hand side value must be declared before using it or should be a constant.
 */

public class O7AssignmentOperators 
{
	public static void main(String[] args) 
	{
		float num1 = 20, num2 = 10;
		num1 += num2;
		System.out.println("num1 after using (+) assignemnet operator : " + num1);
		num1 -= num2;
		System.out.println("num1 after using (-) assignemnet operator : " + num1);
		num1 *= num2;
		System.out.println("num1 after using (*) assignemnet operator : " + num1);
		num1 /= num2;
		System.out.println("num1 after using (/) assignemnet operator : " + num1);
		num1 %= num2;
		System.out.println("num1 after using (%) assignemnet operator : " + num1);
	}
}
