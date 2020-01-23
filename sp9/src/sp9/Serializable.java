package sp9;
import java.io.*;


public class Serializable {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	try
	{
		Student s=new Student(501,"ash");
		FileOutputStream fos=new FileOutputStream("t.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		fos.write(s);
		fos.flush();
		fos.close();
		System.out.println("Return successfully");
				
	}
	catch(Exception e)
	{
		
	}
		}
}
