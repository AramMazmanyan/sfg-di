package guru.springframework.sfgdi9.controllers;

import guru.springframework.sfgdi9.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController2 {

    private final GreetingService greetingService;

    public ConstructorInjectedController2(@Qualifier("constructorGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }

}
