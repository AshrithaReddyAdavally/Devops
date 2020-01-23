package pack;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.xml.*;
import org.springframework.core.io.*;


public class Main {

	public static void main(String[] args) {
		BeanFactory b=new XmlBeanFactory(new ClassPathResource("ApplicationContext.xml"));
		//ApplicationContext a=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		student d=(student)b.getBean("s");
		d.display();

	}

}
