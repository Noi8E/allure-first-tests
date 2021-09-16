package com.github.noi8e;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GithubSelenideTestsExample {

    @Test
    void selenideExampleTest(){
        open("https://github.com/");
        $("[data-test-selector='nav-search-input']").setValue("eroshenkoam/allure-example")
                .pressEnter();
        $("[href*='eroshenkoam/allure-example']").click();
        $("#issues-tab").click();
        $("#issue_48_link").should(exist);


    }




}
