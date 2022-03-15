/**
 * 
 * @author lijoj
 *
 *	Arithmetic Operators

 * These operators involve the mathematical operators that can be used to perform various simple or advanced 
 * arithmetic operations on the primitive data types referred to as the operands. 
 * These operators consist of various unary and binary operators that can be applied on a single or two operands. 
 */
public class O6ArithmeticOperators 
{
	public static void main(String[] args) 
	{
		int num1 = 10, num2 = 20;
		int mult, sum, sub,  mod;
		float div;
		float fnum1 = num1, fnum2 = num2;

		/*
		 * Addition(+): This operator is a binary operator and is used to add two
		 * operands.
		 */
		sum = num1 + num2;
		
		/*
		 * Subtraction(-): This operator is a binary operator and is used to subtract
		 * two operands.
		 */
		sub = num1 - num2;
		
		/*
		 * Multiplication(*): This operator is a binary operator and is used to multiply
		 * two operands.
		 */
		mult = num1 * num2;
		
		/*
		 * Division(/): This is a binary operator that is used to divide the first
		 * operand(dividend) by the second operand(divisor) and give the quotient as a
		 * result.
		 */
		div = fnum1 / fnum2;
		
		/*
		 * Modulus(%): This is a binary operator that is used to return the remainder
		 * when the first operand(dividend) is divided by the second operand(divisor).
		 */
		mod = num1 % num2;
		System.out.println("Sum: " + sum);
		System.out.println("Sub: " + sub);
		System.out.println("Mult: " + mult);
		System.out.println("Div: " + div);
		System.out.println("Mod: " + mod);
	}
}
