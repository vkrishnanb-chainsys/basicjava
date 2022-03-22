package edu.lessons.day92.io.byteStreams;
import java.io.ByteArrayInputStream;
import java.io.BufferedInputStream;
import java.io.IOException;
public class BufferInputDemo 
{
	public static void main(String arg[])   
	{
		String s="99% is  &approx equal  to 100 but this is &approx; not.";
		byte buf[]=s.getBytes();
		ByteArrayInputStream in=new ByteArrayInputStream(buf);
		BufferedInputStream f=new BufferedInputStream(in);
		int c;
		try
		{
			while((c=f.read())!=-1)
			{
				System.out.print((char) c);			
			}
		}catch(IOException ex)
		{
			ex.printStackTrace();
		}
	}
	public static void m2()throws IOException 
	{
		String s="99% is  &approx equal  to 100 but this is"+
				" &approx; not.";
	byte buf[]=s.getBytes();
	ByteArrayInputStream in=new ByteArrayInputStream(buf);
	BufferedInputStream f=new BufferedInputStream(in);
	int c;
	char a=247;
	boolean marked=false;
	while((c=f.read())!=-1)
	{
		System.out.print((char) c);
		/*switch(c)
		{
			case '&':
			if(!marked)
			{
				f.mark(32);
				marked=true;
			} 	
			else 
			{
				marked=false;
			} break;
			case ';':
			if (marked)
			{
				marked=false;
				System.out.print(a);
			}
		    else 
			{
				 System.out.print((char)c);
			} 
			break;
			case ' ':
			if(marked)
			{
				marked=false;
				f.reset();
				System.out.print("&");
			} else
	        System.out.print((char) c);
			break;
			default :
			if (!marked) System.out.print((char) c);
			break;
		}*/
	}

	}
}
