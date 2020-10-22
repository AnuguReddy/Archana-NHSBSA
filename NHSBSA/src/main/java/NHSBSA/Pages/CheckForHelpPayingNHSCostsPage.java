package NHSBSA.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckForHelpPayingNHSCostsPage extends BasePage{

    public CheckForHelpPayingNHSCostsPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(id="next-button")
    WebElement nextButton;
    @FindBy(id="label-wales")
    WebElement radioWales;
    @FindBy(id="dob-day")
    WebElement dobDay;
    @FindBy(id="dob-month")
    WebElement dobMonth;
    @FindBy(id="dob-year")
    WebElement dobYear;
    @FindBy(id="label-yes")
    WebElement radioYes;
    @FindBy(id="label-no")
    WebElement radioNo;
    @FindBy(id="result-heading")
    WebElement confirmationMessage;

    public void checkerToolOptions(){
        nextButton.click();
        radioWales.click();
        nextButton.click();
        dobDay.sendKeys("31");
        dobMonth.sendKeys("07");
        dobYear.sendKeys("1961");
        nextButton.click();
        radioYes.click();
        nextButton.click();
        radioNo.click();
        nextButton.click();
        radioNo.click();
        nextButton.click();
        radioNo.click();
        nextButton.click();
        radioNo.click();
        nextButton.click();
        radioNo.click();
        nextButton.click();
        radioNo.click();
        nextButton.click();
        radioNo.click();
        nextButton.click();
    }
    public Boolean verifyFinalMessage(){
        return confirmationMessage.getText().matches("Based on what you've told us\n" +
                "You get help with NHS costs");
    }
}


