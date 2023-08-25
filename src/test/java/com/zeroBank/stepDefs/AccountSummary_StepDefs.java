package com.zeroBank.stepDefs;

import com.zeroBank.pages.AccountSummaryPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class AccountSummary_StepDefs {

    AccountSummaryPage accountSummaryPage = new AccountSummaryPage();

    @Then("The user should be able to see page title: {string}")
    public void the_user_should_be_able_to_see_page_title(String expectedTitle) {
        String actualTitle = accountSummaryPage.getPageTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
    }

    @Then("The user should be able to see following account types")
    public void the_user_should_be_able_to_see_following_account_types(List<String> expectedAccountTypes) {
        List<String> actualAccountTypes = accountSummaryPage.getAccountTypesTexts();
        Assert.assertEquals(expectedAccountTypes, actualAccountTypes);
    }

    @Then("The user should be able to see following credit accounts columns")
    public void the_user_should_be_able_to_see_following_credit_accounts_columns(List<String> expectedCreditAccountsColumns) {
        List<String> actualCreditAccountColumns = accountSummaryPage.getCreditAccountsColumnsTexts();
        Assert.assertEquals(expectedCreditAccountsColumns, actualCreditAccountColumns);
    }
}
