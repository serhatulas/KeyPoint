package org.example.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.*;
import org.example.utilities.BrowserUtils;
import org.example.utilities.ConfigurationReader;
import org.example.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class FunctionsStepDefs {
    @Given("the user is on the  page")
    public void the_user_is_on_the_page() throws InterruptedException {
        String url = ConfigurationReader.get("url2");
        //WebDriver driver = Driver.get();
        Driver.get().get(url);
        Driver.get().manage().window().maximize();

    }

    @When("the user enters the alerts")
    public void the_user_enters_the_alerts() {

        BrowserUtils.waitFor(3);
        FunctionPage functionPage = new FunctionPage();
        functionPage.alertsButton.click();
        BrowserUtils.waitFor(3);
        Driver.get().manage().window().fullscreen();
        BrowserUtils.waitFor(3);
        functionPage.alertsButton2.click();

    }

    @Then("the user clicks the alerts")
    public void the_user_clicks_the_alerts() {
        FunctionPage functionPage = new FunctionPage();
        BrowserUtils.waitFor(3);
        functionPage.alertsButton3.click();
        BrowserUtils.waitFor(3);
        Driver.get().switchTo().alert().accept();

        BrowserUtils.waitFor(3);
        functionPage.alertsButton4.click();
        BrowserUtils.waitFor(5);
        Driver.get().switchTo().alert().accept();

        BrowserUtils.waitFor(3);
        functionPage.alertsButton5.click();
        BrowserUtils.waitFor(7);
        Driver.get().switchTo().alert().accept();
        String text = functionPage.alertsButton6.getText();
        Assert.assertEquals(text, "You selected Ok");

        BrowserUtils.waitFor(3);
        functionPage.alertsButton7.click();
        Driver.get().switchTo().alert().sendKeys("User Tester");
        BrowserUtils.waitFor(10);
        Driver.get().switchTo().alert().accept();
        String text2 = functionPage.alertsButton8.getText();
        Assert.assertEquals(text2, "You entered User Tester");
        BrowserUtils.waitFor(3);
    }

    @When("the user enters the Interactions droppable button")
    public void the_user_enters_the_Interactions_droppable_button() {
        BrowserUtils.waitFor(3);
        FunctionPage functionPage = new FunctionPage();
        functionPage.intersButton.click();
        BrowserUtils.waitFor(3);
        Driver.get().manage().window().fullscreen();
        BrowserUtils.waitFor(3);
        JavascriptExecutor js = (JavascriptExecutor) Driver.get();
        js.executeScript("window.scrollBy(0,1000)");
        BrowserUtils.waitFor(7);
        functionPage.dropButton.click();
    }

    @Then("the user drags to the box")
    public void the_user_drags_to_the_box() {
        BrowserUtils.waitFor(7);
        FunctionPage functionPage = new FunctionPage();
        Actions action = new Actions(Driver.get());
        action.moveToElement(functionPage.DragMe)
                .clickAndHold()
                .moveToElement(functionPage.DropMe).click()
                .build()
                .perform();
        BrowserUtils.waitFor(3);
        Assert.assertEquals(functionPage.DropMeConfirmed.getText(),"Dropped!");
    }

    @When("the user enters the Widgets tool Tips button")
    public void the_user_enters_the_Widgets_tool_Tips_button() {
        BrowserUtils.waitFor(3);
        FunctionPage functionPage = new FunctionPage();
        functionPage.widgetsButton.click();
        BrowserUtils.waitFor(3);
        Driver.get().manage().window().fullscreen();
        BrowserUtils.waitFor(3);
        JavascriptExecutor js = (JavascriptExecutor) Driver.get();
        js.executeScript("window.scrollBy(0,1000)");
        BrowserUtils.waitFor(7);
        functionPage.toolTipsButton.click();

    }


    @Then("the user establish hover and over function")
    public void the_user_establish_hover_and_over_function() {
        Actions actions = new Actions(Driver.get());
        FunctionPage functionPage = new FunctionPage();
        BrowserUtils.waitFor(5);
        actions.moveToElement(functionPage.hoverOverButton).build().perform();
        BrowserUtils.waitFor(7);
        WebElement toolTipElement = Driver.get().findElement(By.cssSelector("#buttonToolTip"));
        String title = toolTipElement.getText();
        Assert.assertEquals("You hovered over the Button",title);

        BrowserUtils.waitFor(5);
        actions.moveToElement(functionPage.hoverOverTextBox).build().perform();
        BrowserUtils.waitFor(7);
        WebElement toolTipElement2 = Driver.get().findElement(By.cssSelector("#textFieldToolTip"));
        String title2 = toolTipElement2.getText();
        Assert.assertEquals("You hovered over the text field",title2);

    }

}