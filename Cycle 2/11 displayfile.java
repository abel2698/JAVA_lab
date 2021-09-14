import java.io.*;
public class displayfile
{
	public static void main(String args[])throws IOException,FileNotFoundException
	{
		int i;
		File f1=new File("d://JAVA PGMS//10-13//abc.txt");
		FileInputStream in=new FileInputStream(f1);
		System.out.println("\n");
		do
		{
			i=in.read();
			if(i!=-1)
			{
				System.out.println(" "+(char)i);
			}
		}
		while(i!=-1);
		in.close();
	}
}