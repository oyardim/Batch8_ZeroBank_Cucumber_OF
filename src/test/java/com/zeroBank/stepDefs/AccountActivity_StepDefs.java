package com.zeroBank.stepDefs;

import com.zeroBank.pages.AccountActivityPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class AccountActivity_StepDefs {
    AccountActivityPage accountActivityPage = new AccountActivityPage();

    @Then("The user should be able to see {string} account type as default")
    public void the_user_should_be_able_to_see_account_type_as_default(String expectedAccountType) {
        String actualAccountType = accountActivityPage.getDefaultSelectedAccountText();
        Assert.assertEquals(expectedAccountType, actualAccountType);
    }

    @Then("The user should be able to see following account types at the drop down menu")
    public void the_user_should_be_able_to_see_following_account_types_at_the_drop_down_menu(List<String> expectedDropDownAccounts) {
        List<String> actualDropDownAccounts = accountActivityPage.getAllAccountTypesFromDropDown();
        Assert.assertEquals(expectedDropDownAccounts, actualDropDownAccounts);
    }

    @Then("The user should be able to see following Show Transaction table columns")
    public void the_user_should_be_able_to_see_following_show_transaction_table_columns(List<String> expectedShowTransactionsTableColumns) {
        List<String> actualShowTransactionsTableColumns = accountActivityPage.getShowTransactionsColumnText();
        Assert.assertEquals(expectedShowTransactionsTableColumns, actualShowTransactionsTableColumns);
    }
}
