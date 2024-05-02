package guru.springframework.spring6di;

import guru.springframework.spring6di.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Spring6DiApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Spring6DiApplication.class, args);
        MyController myController = context.getBean(MyController.class);
        System.out.println("I am in the main method!");
        System.out.println(myController.sayHello());
    }
}

