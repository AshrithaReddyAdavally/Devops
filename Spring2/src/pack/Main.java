package pack;

import org.springframework.beans.factory.*;
import org.springframework.beans.factory.xml.*;
import org.springframework.core.io.*;

public class Main {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BeanFactory b=new XmlBeanFactory(new ClassPathResource("ApplicationContext.xml"));
A a1=(A)b.getBean("a");
a1.setMessage("Welcome to spring core scopes");
a1.getMessage();
A b1=(A)b.getBean("a");
b1.setMessage("Welcome to spring");
b1.getMessage();
	
	}

}

