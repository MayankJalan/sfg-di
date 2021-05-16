package guru.springframework.sfgdi.controller;

import guru.springframework.sfgdi.services.ConstructrGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorBasedInjectionTest {

    ConstructorBasedInjection controller;
    @BeforeEach
    void setUp() {
        controller=new ConstructorBasedInjection(new ConstructrGreetingService());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}