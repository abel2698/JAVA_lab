import java.io.*;
import java.util.Scanner;
class complex
{
	public static void main(String args[])throws IOException
	{
		Scanner sc = new Scanner(System.in);
		int a1,b1,a2,b2;
		System.out.println("Enter the real part of the first complex number");
		a1 = sc.nextInt();
		System.out.println("Enter the imaginary part of the first complex number");
		b1 = sc.nextInt();
		System.out.println("Enter the real part of the second complex number");
		a2 = sc.nextInt();
		System.out.println("Enter the real part of the second complex number");
		b2 = sc.nextInt();
		System.out.println("The complex numbers are  " +a1+ "+" +b1+ "i  and  " +a2+ "+" +b2+ "i");
		int as=a1+a2;
		int bs=b1+b2;
		System.out.println("The sum is " +as+ "+" +bs+ "i");	
	}
}