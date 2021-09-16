package com.github.noi8e;

import org.junit.jupiter.api.Test;

import static com.github.noi8e.TestBase.REPOSITORY;

public class GithubStepAnnotationExample {

    @Test
    public void testGithub() {
        WebSteps steps = new WebSteps();
        steps.openMainPage();
        steps.searchValidateResult(REPOSITORY);
        steps.searchRepoNeeded(REPOSITORY);
        steps.goToIssueTab();
        steps.checkIssue();
    }



}
