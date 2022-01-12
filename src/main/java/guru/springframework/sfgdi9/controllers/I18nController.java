package guru.springframework.sfgdi9.controllers;

import guru.springframework.sfgdi9.services.GreetingService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/request")
@RequiredArgsConstructor

public class I18nController {
    private final ConstructorInjectedController controller;

    private final PropertyInjectedController injectedController;

    private final ConstructorInjectedController2 controller2;

    @GetMapping("")
    String getMessage(GreetingService greetingService) {


        controller.setGreetingService(greetingService);

        return "message";
    }

}
