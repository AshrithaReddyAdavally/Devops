package threads;
import java.util.*;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try
{
	while(true)

	{
		
		Date d=new Date();
//System.out.println(d);
String s=d.toString();
//s.substring(11,19);
Thread.sleep(1000);
System.out.println(s.substring(11,19));
}
	}
	catch(Exception e)
	{
		System.out.println(e);
	}

	}
}
