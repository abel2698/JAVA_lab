import java.io.*;
import java.util.Scanner;
class Employee1
{ 
 int Num,Sal;
 String Name;
 
 void read() throws IOException
 {
   System.out.print("\n");
   Scanner em = new Scanner(System.in);
   System.out.print("Enter the emp number: ");
   Num=em.nextInt();
   System.out.print("Enter the emp name: ");
   Name=em.next();
   System.out.print("Enter the emp salary: ");
   Sal=em.nextInt();
 }
 void Display() throws IOException
 {
  System.out.println("Name of the emp: " + Name);
   System.out.println("salary of the emp: " + Sal);
  }
public static void main(String args[])throws IOException
{
 int n;
 int emp;
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter number of employees: ");
 n=sc.nextInt();
 Employee1 s[]=new Employee1[n];
 for(int i=0;i<n;i++)
 {
  s[i]=new Employee1();
  s[i].read();
  
 }
 System.out.print("\nEnter emp number to search: ");
 emp=sc.nextInt();
 for(int i=0;i<n;i++)
 {
  if(emp==s[i].Num)
  {
   s[i].Display();
  }
 }
}
}