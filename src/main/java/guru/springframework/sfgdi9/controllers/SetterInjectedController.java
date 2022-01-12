package guru.springframework.sfgdi9.controllers;

import guru.springframework.sfgdi9.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SetterInjectedController {

    @Qualifier("setterGreetingService")
    @Autowired
    public void setGreetingService( GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }

    private GreetingService greetingService;



}
