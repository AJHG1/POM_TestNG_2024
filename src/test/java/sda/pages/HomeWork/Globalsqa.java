package sda.pages.HomeWork;

import com.github.javafaker.Faker;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import sda.utlitiles.Driver;

public class Globalsqa {

    Faker faker = new Faker();
    Select select;
    public Alert alert = Driver.getDriver().switchTo().alert();

    public Globalsqa() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    // this button for Bank Manager Login
    @FindBy(xpath = "//button[text()='Bank Manager Login']")
    public WebElement bankMangLogin;


    // this button for add customber button
    @FindBy(xpath = "//button[@ng-class='btnClass1']")
    public WebElement addCustomer;

    // this xpath for first name filed
    @FindBy(xpath = "//*[@placeholder='First Name']")
    public WebElement firstName;

    // this xpath ro last name filed
    @FindBy(xpath = "//*[@placeholder='Last Name']")
    public WebElement lastName;

    // this xpath for post code filed
    @FindBy(xpath = "//*[@placeholder='Post Code']")
    public WebElement postalCode;

    //this xpath for add Customer button
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement addCustButton;

    // this class name for the Home button
    @FindBy(className = "btn home")
    public WebElement homeButton;

    // this xpath for Customer login button
    @FindBy(xpath = "//button[text()='Customer Login']")
    public WebElement cutomerLoginButton;


    // this xpath for open account button
    @FindBy(xpath = "//*[@ng-click='openAccount()']")
    public WebElement openAccountButton;


    //this id for userSelect  select list
    @FindBy(id = "userSelect")
    public WebElement dropDown;

    // this id for Currency select list
    @FindBy(id = "currency")
    public WebElement currency;

    // this xpath for Process button
    @FindBy(xpath = "Process")
    public WebElement processButton;

    // this xpath for customer button
    @FindBy(xpath = "//button[@ng-class='btnClass3']")
    public WebElement customerButton;


    // this xpath for the table in customer filed
    @FindBy(xpath = "//table[@class='table table-bordered table-striped']")
    public WebElement fullTable;

    // this xpath for login button
    @FindBy(xpath = "//*[text()='Login']")
    public WebElement loginButton;


    // this xpath for the deposit button
    @FindBy(xpath = "//button[@ng-click='deposit()']")
    public WebElement deopositeButton;

    // this xpath for Amount to be Deposited filed
    @FindBy(xpath = "//input[@ng-model='amount']")
    public WebElement amountInput;

    // this xpath for deposit button
    @FindBy(xpath = "//*[.='Deposit']")
    public WebElement depositeButton;

    // this xpath for the massage Deposit Successful
    @FindBy(xpath = "//*[.='Deposit Successful']")
    public WebElement sucessMess;

    // this xpath for withdrawl button
    @FindBy(xpath = "//button[@ng-click='withdrawl()']")
    public WebElement withDrawButton;


    @FindBy(xpath = "//*[.='Withdraw']")
    public WebElement withdraweButtonAfter100;

    @FindBy(xpath = "//*[.='Transaction successful']")
    public WebElement transactionSuccessMessage;

    @FindBy(xpath = "//button[@ng-show='logout']")
    public WebElement logOutButton;


    public void selectDropDown1(int idnex) {
        new Select(dropDown);
        select.selectByIndex(idnex);
    }

    public void setCurrency(int valueOfCurrency) {
        new Select(currency);
        select.selectByIndex(valueOfCurrency);
    }


    public void addCustomerPage() {
        for (int i = 0; i < 4; i++) {
            firstName.sendKeys(faker.name().firstName());
            lastName.sendKeys(faker.name().lastName());
            postalCode.sendKeys(faker.address().zipCode());
            addCustButton.click();
            // Alert alert = Driver.getDriver().switchTo().alert();
            alert.accept();
        }
    }


    public void addingNumOfAccounts(int numberOfAcc) {
        for (int x = numberOfAcc; x < 4; x++) {
            selectDropDown1(faker.number().numberBetween(0, 3));
            setCurrency(faker.number().numberBetween(0, 2));
            processButton.click();
            alert.accept();
        }
    }

    public int rowCount = fullTable.findElements(By.xpath(".//tr")).size();
    // Table tasks
    //  public  void table(){
    //      int rowCoun2t = fullTable.findElements(By.xpath(".//tr")).size();
    //      System.out.println("rowCount = " + rowCount);
    //      }
//


    @FindBy(xpath = "//*[@ng-click='deleteCust(cust)']")
    public WebElement deleteButton;

    public void deleteFunction(int numbOfDeleteUwant) {
        for (int z = 0; z <= numbOfDeleteUwant; z++) {
            deleteButton.click();   // it will be clicked and the number will reduce from 5 to 4 all the way to 0
        }
    }

    public boolean rowCountAssertLast = fullTable.findElements(By.xpath(".//tr")).size() <= 0;

}
