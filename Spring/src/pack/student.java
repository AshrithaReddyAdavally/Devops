package pack;
import java.util.*;
public class student {
private int sid;
private String sname;
private List<String> Mobile;




public student(int sid, String sname, List<String> mobile) {
	super();
	this.sid = sid;
	this.sname = sname;
	Mobile = mobile;
}




public void display()
{
	System.out.println("sid:"+this.sid+"\n"+"sname:"+this.sname+"\n");
	Iterator i=Mobile.iterator();
	while(i.hasNext())
	{
		System.out.println(i.next());
	}
	
}


}
