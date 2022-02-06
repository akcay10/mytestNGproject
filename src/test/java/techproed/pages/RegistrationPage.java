package techproed.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;
public class RegistrationPage {
    public RegistrationPage(){
// to instantiate the page object
        PageFactory.initElements(Driver.getDriver(),this);
    }
    //  findElement(By.id("ssn"));; ====> @FindBy(id="ssn")
    //1
    @FindBy(id="ssn")
    public WebElement ssn;
    //  2
    @FindBy(name="firstname")
    public WebElement firstname;
    //  3
    @FindBy(id="lastname")
    public WebElement lastname;
    //  4
    @FindBy(id="address")
    public WebElement address;
    //  5
    @FindBy(id="mobilephone")
    public WebElement mobilephone;
    //  6
    @FindBy(name="username")
    public WebElement username;
    //  7
    @FindBy (id="email")
    public WebElement email;
    //  8
    @FindBy (id="firstPassword")
    public WebElement firstPassword;
    //  9
    @FindBy(id="secondPassword")
    public WebElement secondPassword;
    //  10
    @FindBy(id="register-submit")
    public WebElement registerButton;
}