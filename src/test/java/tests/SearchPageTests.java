package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SearchPage;

public class SearchPageTests extends BaseTest {

    @Test
    public void SearchWithResultsTC() {
        SearchPage searchPage = new SearchPage(driver);
        searchPage.searchWithResults("MacBook");
        Assert.assertTrue(searchPage.isProductFound(), "Search Failed");
    }

    @Test
    public void SearchWithNoResultsTC() {
        SearchPage searchPage = new SearchPage(driver);
        searchPage.searchWithResults("$$$$$$$");
        Assert.assertTrue(searchPage.isNoProductFound(), "Search Failed");
    }
}
