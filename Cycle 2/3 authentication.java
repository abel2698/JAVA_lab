import java.io.*;
import java.util.Scanner;
class authentication
{
String name,pass;
void read()throws UserException
{
	Scanner s = new Scanner(System.in);
	System.out.println("Usernme: ");
	name = s.nextLine();
	System.out.println("Password: ");
	pass = s.nextLine();
	if(!name.equals("user") && !pass.equals("pass"))throw new UserException();
	else if(name.equals("user") && !pass.equals("pass"))throw new UserException();
	else if(!name.equals("user") && pass.equals("pass"))throw new UserException();
	else
	{
		System.out.println("Authentication Successful........");
	}
}
public static void main(String args[])
{
	authentication obj1=new authentication();
	try
	{
		obj1.read();
    }
	catch(UserException u)
	{
		u.show();
	}
}
}

class UserException extends Exception
{
void show()
  {
     System.out.println("Authentication Failed.........");
  }
}

	

