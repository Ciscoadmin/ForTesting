package ForTesting.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Sample page
 */
public class ExamplePage extends Page {



  @FindBy(how = How.TAG_NAME, using = "h1")
  @CacheLookup
  public WebElement header;



  public ExamplePage(WebDriver webDriver) {
    super(webDriver);
  }
}
