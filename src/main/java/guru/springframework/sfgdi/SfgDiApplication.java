package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controller.ConstructorBasedInjection;
import guru.springframework.sfgdi.controller.MyController;
import guru.springframework.sfgdi.controller.PropertyInjectedController;
import guru.springframework.sfgdi.controller.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {

		ApplicationContext ctx=SpringApplication.run(SfgDiApplication.class, args);
		MyController myController=(MyController) ctx.getBean("myController");
		String greeting =myController.sayHello();
		System.out.println(greeting);

		System.out.println("----------------- PropertyInjection -----------------");
		PropertyInjectedController propertyInjectedController =(PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreetings());

		System.out.println("----------------- SetterInjection -----------------");
		SetterInjectedController setterInjectedController=(SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("----------------- ConstructorInjection -----------------");
		ConstructorBasedInjection constructorBasedInjection=(ConstructorBasedInjection) ctx.getBean("constructorBasedInjection");
		System.out.println(constructorBasedInjection.getGreeting());
	}

}
