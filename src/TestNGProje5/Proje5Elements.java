package TestNGProje5;

import Utlity.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Proje5Elements
{

    public Proje5Elements() {

        PageFactory.initElements(BaseDriver.driver, this);
    }
    @FindBy(xpath = "//i[@class='nav-icon fas fa-book']")
    public WebElement catalog;

    @FindBy(xpath = "//*[text()=' Products']")
    public WebElement dogrulama1;

    @FindBy(xpath = "//i[@class='nav-icon fas fa-shopping-cart']")
    public WebElement sales;

    @FindBy(xpath = "//*[text()=' Orders']")
    public WebElement dogrulama2;

    @FindBy(xpath = "//i[@class='nav-icon far fa-user']")
    public WebElement customers;

    @FindBy(xpath = "//*[text()=' Customer roles']")
    public WebElement dogrulama3;

    @FindBy(xpath = "//i[@class='nav-icon fas fa-tags']")
    public WebElement promotions;

    @FindBy(xpath = "//*[text()=' Discounts']")
    public WebElement dogrulama4;

    @FindBy(xpath = "//i[@class='nav-icon fas fa-cubes']")
    public WebElement contentManagement;

    @FindBy(xpath = "//*[text()=' News items']")
    public WebElement dogrulama5;

    @FindBy(xpath = "//i[@class='nav-icon fas fa-cogs']")
    public WebElement configuration;

    @FindBy(xpath = "//*[text()=' Stores']")
    public WebElement dogrulama6;

    @FindBy(xpath = "//i[@class='nav-icon fas fa-cube']")
    public WebElement system;

    @FindBy(xpath = "//*[text()=' Log']")
    public WebElement dogrulama7;

    @FindBy(xpath = "//i[@class='nav-icon fas fa-chart-line']")
    public WebElement reports;

    @FindBy(xpath = "//*[text()=' Sales summary']")
    public WebElement dogrulama8;

    @FindBy(xpath = "//i[@class='nav-icon fas fa-question-circle']")
    public WebElement help;

    @FindBy(xpath = "//*[text()=' Training']")
    public WebElement dogrulama9;


    @FindBy(xpath = "//*[text()=' Customers']")
    public WebElement customers2;

    @FindBy(xpath = "//a[@class='btn btn-primary']")
    public WebElement adNewButton;

    @FindBy(id = "Email")
    public WebElement eMail;

    @FindBy(id = "Password")
    public WebElement password;

    @FindBy(id = "FirstName")
    public WebElement firstName;

    @FindBy(id = "LastName")
    public WebElement lastName;

    @FindBy(id = "Gender_Male")
    public WebElement genderMale;

    @FindBy(id = "DateOfBirth")
    public WebElement dateOfBirth;

    @FindBy(id = "Company")
    public WebElement company;

    @FindBy(id = "IsTaxExempt")
    public WebElement isTaxExempt;

    @FindBy(xpath = "(//div[@class='k-multiselect-wrap k-floatwrap'])[1]")
    public WebElement Newsletter;

    @FindBy(xpath = "//li[text()='Test store 2']")
    public WebElement testStore;


    @FindBy(id = "Active")
    public WebElement activeButton;

    @FindBy(id = "AdminComment")
    public WebElement adminComment;

    @FindBy(xpath = "//i[@class='far fa-save']")
    public WebElement saveButton;

    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissable']")
    public WebElement dogrulama10;

    @FindBy(id = "SearchEmail")
    public WebElement searchEmail;

    @FindBy(id = "SearchFirstName")
    public WebElement searchFirsName;

    @FindBy(id = "SearchLastName")
    public WebElement searchLastName;

    @FindBy(id = "search-customers")
    public WebElement searchButton;

    @FindBy(xpath = "//td[text()='kadir caglar']")
    public WebElement dogrulama11;

    @FindBy(xpath = "//a[@class='btn btn-default']")
    public WebElement editButton;

    @FindBy(id = "customer-delete")
    public WebElement deleteButton;

    @FindBy(xpath = "//*[@class='btn btn-danger float-right']")
    public WebElement deleteButton2;

    @FindBy(xpath = "//*[@class='alert alert-success alert-dismissable']")
    public WebElement dogrulama12;

    @FindBy(xpath = "//*[@placeholder='Search']")
    public WebElement searchBox;

    @FindBy(xpath = "//strong[text()='Shipments']")
    public WebElement searchButton2;

    @FindBy(xpath = "//h1[@class='float-left']")
    public WebElement dogrulama13;













}
