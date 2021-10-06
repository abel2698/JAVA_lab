import java.io.*;
import java.util.Scanner;
import java.lang;
class compute
{
public void calculate()
{
System.out.println("calculate");
display();

}
public void calculate(int n,char ch)
{
Scanner sa=new Scanner(System.in);
System.out.println("enter the number");
int n=sa.nextInt();
System.out.println("enter the char s for square of a number else cube");
ch=sa.nextLine();
if(ch=='s')
{
int c=n*n;
System.out.println("square = "+c);
}
else
{
int c=n*n*n;
System.out.println("cube = "+c);
}
}
public void calculate(int n,int m, char ch)
{
int z;
Scanner sb=new Scanner(System.in);
System.out.println("enter first number");
int n=sb.nextInt();
System.out.println("enter second number");
int m=sb.nextInt();
System.out.println("enter the char p for product else addition");
ch=sb.nextLine();
if(ch=='p')
{
z=n*m;
System.out.println("product= "+z);
}
else
{
z=n+m;
System.out.println("sum= "+z);
}
}
public void calculate(String str1,String str2)
{
Scanner sd= new Scanner(System.in);
System.out.println("enter the first string");
String str1=sd.nextLine();
System.out.println("enter the first string");
String str2=sd.nextLine();
if(length(str1)==length(str2))
{
System.out.println("strings are equal");
}
else
{
System.out.println("strings are not equal");
}
}
class testcompute extends compute
{
public static void main(String args[])
{
System.out.println("")
Overloading obj= new Overlading();
calculate()=obj.calculate();
calculate(int n,char ch)=obj.calculate(int n,char ch);
calculate(int n,int m, char ch) = obj.calculate(int n,int m, char ch);
calculate(String str1,String str2) = obj.calculate(String str1,String str2);
}
}
}
