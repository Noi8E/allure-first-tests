package com.github.noi8e;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class GithubLambdaTestExample extends TestBase {

    @Test
    void lambdaExampleTest() {
        step("Открыть главную страницу Гитхаба", () -> {
            open(GITHUBMAINPAGE);
        });

        step("Найти подходящие результаты", () -> {
            $("[data-test-selector='nav-search-input']").setValue(REPOSITORY)
                    .pressEnter();
        });
        step("На странице результатов найти нужный репозиторий и перейти в него", () -> {
            $("[href*='" + REPOSITORY + "']").click();
        });
        step("Перйти в IssueTab", () -> {
            $("#issues-tab").click();
        });
        step("Проверить наличие Issue", () -> {
            $(ISSUE_LINK).should(exist);
        });
    }
}
