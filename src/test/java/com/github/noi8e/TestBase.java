package com.github.noi8e;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {

    @BeforeAll
    static void sayHello() {
        System.out.println("Hi this is simple test for allure lesson");
        Configuration.startMaximized = true;
    }
    static void beforeAll() {
        Configuration.startMaximized = true;
    }

    @AfterAll
    static void sayGoodBye() {
        System.out.println("Bye guys!");
        Selenide.closeWebDriver();
    }

}
