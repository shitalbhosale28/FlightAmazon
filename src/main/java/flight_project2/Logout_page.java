package flight_project2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout_page {
    WebDriver driver;
    @FindBy(xpath="//span[text()='Account & Lists']")
    WebElement accountHomepage;
    @FindBy(xpath="//span[.='Sign Out']")
    WebElement signOut;



    public void logoutM(){
        Actions a1=new Actions(driver);
        a1.moveToElement(accountHomepage).perform();
        signOut.click();

    }
public Logout_page(WebDriver driver){
    PageFactory.initElements(driver,this);
    this.driver=driver;
}
}
