package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage extends BasePage{

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public WebElement searchField() {
        return getElement("//input[@type='search']");
    }

    public List<WebElement> listItems() {
        return getElements("//a[@data-testid='product-tile']");
    }
}
