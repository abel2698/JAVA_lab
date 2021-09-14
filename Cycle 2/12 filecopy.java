import java.io.*;
import java.util.Scanner;
public class filecopy
{
	public static void main(String args[])throws IOException,FileNotFoundException
	{
		int i;
		File f1=new File("d://JAVA PGMS//10-13//abc.txt");
		File f2=new File("d://JAVA PGMS//10-13//file.txt");
		FileInputStream in=new FileInputStream(f1);
		FileOutputStream op=new FileOutputStream(f2);
		System.out.println("\nCopy successful");
		do 
		{
			i=in.read();
			if(i!=-1)
			op.write(i);
        	}
        while(i!=-1);
        in.close();
		op.close();
	}
}