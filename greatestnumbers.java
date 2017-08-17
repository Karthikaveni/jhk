# jhk
package beginner;

import java.util.Scanner;

public class greatestnumbers {
public static void main(String args[])
{
	int a,b,c,d;
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter any three numbers");
	a=sc.nextInt();
	b=sc.nextInt();
	c=sc.nextInt();
	if(a>=b && a>=c)
	{
		System.out.println("Largest number :"+a);
	}
	if(b>=a && b>=c)
	{
		System.out.println("Largest number :"+b);
	}
	if(c>=a && c>=b)
	{
		System.out.println("Largest number :"+c);
	}
}
}
