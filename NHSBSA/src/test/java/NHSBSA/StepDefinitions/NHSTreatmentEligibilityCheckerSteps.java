package NHSBSA.StepDefinitions;

import NHSBSA.Pages.BasePage;
import NHSBSA.Pages.CheckForHelpPayingNHSCostsPage;
import NHSBSA.Utils.BrowserFactory;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class NHSTreatmentEligibilityCheckerSteps {
    @Before
    public void setUp() {
        BrowserFactory.startBrowser();
    }

    @After
    public void cleanUp() {
      //  BrowserFactory.stopBrowser();
    }

    public BasePage basePage;
    public CheckForHelpPayingNHSCostsPage checkForHelpPayingNHSCostsPage;

    @Given("^I am a person from Wales$")
    public void i_am_a_person_from_Wales() {
        basePage=new BasePage();
        String acttitle=basePage.getTitle();
        Assert.assertEquals(acttitle,"Check what help you could get to pay for NHS costs");
    }

    @When("^I put my circumstances into the Checker tool$")
    public void i_put_my_circumstances_into_the_Checker_tool() {
        checkForHelpPayingNHSCostsPage =new CheckForHelpPayingNHSCostsPage();
        checkForHelpPayingNHSCostsPage.checkerToolOptions();
    }

    @Then("^I should get a result of whether I will get help or not$")
    public void i_should_get_a_result_of_whether_I_will_get_help_or_not() {
      Assert.assertTrue(checkForHelpPayingNHSCostsPage.verifyFinalMessage());
    }
}
