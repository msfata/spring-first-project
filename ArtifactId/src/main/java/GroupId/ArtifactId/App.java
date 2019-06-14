package GroupId.ArtifactId;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		Messenger message = (Messenger) context.getBean("GroupId");
		message.getMessage();
	}
}
