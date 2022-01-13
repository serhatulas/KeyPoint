package org.example.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FunctionPage extends BasePage{

    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div[2]/div/div[3]")
    public WebElement alertsButton;

    @FindBy(xpath ="/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[3]/div/ul/li[2]")
    public WebElement alertsButton2;

    @FindBy(xpath ="//*[@id='alertButton']")
    public WebElement alertsButton3;

    @FindBy(xpath ="//*[@id='timerAlertButton']")
    public WebElement alertsButton4;

    @FindBy(xpath ="//*[@id='confirmButton']")
    public WebElement alertsButton5;

    @FindBy(xpath ="//*[@id='confirmResult']")
    public WebElement alertsButton6;

    @FindBy(xpath ="//*[@id='promtButton']")
    public WebElement alertsButton7;

    @FindBy(xpath ="//*[@id='promptResult']")
    public WebElement alertsButton8;

    @FindBy(xpath ="/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[5]/div/ul/li[4]")
    public WebElement dropButton;

    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div[2]/div/div[5]")
    public WebElement intersButton;

    @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div[2]/div[1]/div/div[1]/div/div[1]")
    public WebElement DragMe;

    @FindBy(xpath ="/html/body/div[2]/div/div/div[2]/div[2]/div[1]/div/div[1]/div/div[2]")
    public WebElement DropMe;

    @FindBy(xpath ="/html/body/div[2]/div/div/div[2]/div[2]/div[1]/div/div[1]/div/div[2]/p")
    public WebElement DropMeConfirmed;

    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div[2]/div/div[4]")
    public WebElement widgetsButton;

    @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[4]/div/ul/li[7]")
    public WebElement toolTipsButton;

    @FindBy(xpath ="/html/body/div[2]/div/div/div[2]/div[2]/div[1]/div[1]/button")
    public WebElement hoverOverButton;

    @FindBy(xpath ="/html/body/div[2]/div/div/div[2]/div[2]/div[1]/div[2]/input")
    public WebElement hoverOverTextBox;
}

