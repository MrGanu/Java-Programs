/* Define Math class with four methods to perform addition as follows(use METHOD OVERLOADING)
1. Addition of two integers.
2. Addition of three integer numbers.
3. Addition of two float numbers */

class Math
{
	public void addition(int x, int y)
	{
		System.out.println(" Addition of the two integers is :- " +(x+y));
	}
	public void addition(int x, int y, int z)
	{
		System.out.println(" Addition of the three integers is :- " +(x+y+z));
	}
	public void addition(float x, float y)
	{
		System.out.println(" Addition of the two floats is :- " +(x+y));
	}
}
public class ADDITION
{
	public static void main(String args[])
	{
		Math m=new Math();
		m.addition(45,18);
		m.addition(45,18,7);
		m.addition(4.5f,1.8f);
	}
}
