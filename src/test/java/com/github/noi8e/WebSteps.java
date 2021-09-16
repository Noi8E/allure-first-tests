package com.github.noi8e;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class WebSteps extends TestBase {
    @Step("Открываем главную страницу гитхаба")
    public void openMainPage() {
        open("https://github.com/");
    }
    @Step("Ищем репозиторий {repoRequest}")
    public void searchValidateResult(String repoRequest) {
        $("[data-test-selector='nav-search-input']").setValue(repoRequest)
                .pressEnter();
    }

    @Step("Ищем в списке репозиториев нужный нам")
    public void searchRepoNeeded(String repoNeeded) {
        $("[href*='" + repoNeeded + "']").click();
    }

    @Step("Переход в таб с Issues")
    public void goToIssueTab() {
        $("#issues-tab").click();
    }

    @Step("Проверка наличия искомого Issue")
    public void checkIssue() {
        $("#issue_48_link").should(exist);

    }

}
