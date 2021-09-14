import java.io.*;
import java.util.Scanner;
class filelist
{
	public static void main(String args[])
	{
		File f1=new File("d://");
		if(f1.isDirectory())
		{
			System.out.println("******DETAILS IN  "+f1.getAbsolutePath()+"*******");
			String s[]=f1.list();
			System.out.println("\nTotal no.of files: "+s.length+"\n");
			for(int i=0;i<s.length;i++)
			{
				File f2=new File("d://"+"//"+s[i]);
				if(f2.isDirectory())
				{
					System.out.println(s[i]+"\t is a directory");
				}
				else
				{
					System.out.println(s[i]+"\t is a file");
				}
			}
		}
	   else
	   {
		   System.out.println("d://" + " is not a directory");
	   }
System.out.println("\nEnter the file name to search : ");
Scanner sc=new Scanner(System.in);
String fname=sc.nextLine();
String filelist[]=f1.list();
boolean f=false;
	for(int i=0;i<filelist.length;i++)
	{
		File f2=new File("d://"+"//"+filelist[i]);
		if(fname.equals(f2.getName()))
		{
		  System.out.println(fname+" file found");
		  f=true;
		  break;
		}
	}
	if(!f)
	{
		System.out.println("file doesn't exists");
	}
	
	}
}
			
