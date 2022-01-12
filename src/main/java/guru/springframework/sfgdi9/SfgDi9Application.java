package guru.springframework.sfgdi9;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDi9Application {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(SfgDi9Application.class, args);
        var i18nController = ctx.containsBean("i18nController");


        //I18nController i18nController = (I18nController) ctx.getBean("i18nController");
        ////System.out.println(i18nController.sayGreeting());
        //
        //MyController myController = (MyController) ctx.getBean("myController");
        //
        //System.out.println("------primary Bean");
        //System.out.println(myController.sayHello());
        //
        //System.out.println("--------- Property");
        //PropertyInjectedController propertyInjectedController =
        //    (PropertyInjectedController) ctx.getBean("propertyInjectedController");
        //System.out.println(propertyInjectedController.getGreeting());
        //
        //System.out.println("--------- Setter");
        //SetterInjectedController setterInjectedController =
        //    (SetterInjectedController) ctx.getBean("setterInjectedController");
        //System.out.println(setterInjectedController.getGreeting());
        //
        //System.out.println("--------- constructor");
        //ConstructorInjectedController controller =
        //    (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
        //System.out.println(controller.getGreeting());
    }
}
