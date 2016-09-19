package ForTesting.pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Login page elements
 */

public class LoginPage extends Page {


    By userLogin = By.id("user_login");
    By userPass = By.id("user_pass");

//    By submit = By.id("submit");

//    @FindBy(xpath = "//input[@id='user_login']" )
//    public WebElement user_login;

//    @FindBy(xpath = "//input[@id='user_pass']")
//    public WebElement user_pass;
//
//    @FindBy(xpath = "//input[@id='rememberme']")
//    public WebElement rememberme;
//
    @FindBy(xpath = "//input[@id='wp-submit']")
    public WebElement submit;





//    public WebElement user_pass = findElement(By.xpath("//input[@id='user_pass']"));


    public  void Login( String login, String password) {
       findElement(userLogin).clear();
       findElement(userLogin).sendKeys(login);
       findElement(userPass).clear();
       findElement(userPass).sendKeys(password);
        submit.click();
    }




    public LoginPage(WebDriver webDriver) {
        super(webDriver);
    }
}
