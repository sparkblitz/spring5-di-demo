package guru.springframework;

import guru.springframework.controllers.ConstructorInjectedController;
import guru.springframework.controllers.SetterInjectedController;
import guru.springframework.controllers.MyController;
import guru.springframework.controllers.PropertyInjectedController;
import guru.springframework.examplebeans.FakeDataSource;
import guru.springframework.examplebeans.FakeJMSBroker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"guru.springframework.services", "guru.springframework"})
public class DiDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

		MyController controller = (MyController) ctx.getBean("myController");

		FakeDataSource fakeDataSource = (FakeDataSource) ctx.getBean(FakeDataSource.class);

		FakeJMSBroker fakeJMSBroker = (FakeJMSBroker) ctx.getBean(FakeJMSBroker.class);

		System.out.println("Username: " + fakeDataSource.getUsername());
		System.out.println("Password: " + fakeDataSource.getPassword());
		System.out.println("DB URL  : " + fakeDataSource.getUrl());

		System.out.println("\n\nJMS Username: " + fakeJMSBroker.getUsername());
		System.out.println("JMS Password: " + fakeJMSBroker.getPassword());
		System.out.println("JMS URL     : " + fakeJMSBroker.getUrl());
	}
}
