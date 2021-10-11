import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utils.TestInit;


public class TestSearchResult extends TestInit {


    String lookingItem = "Конфеты Рошен Ромашка";


    @Test
    public void searchTest() {
        HomePage homePage = new HomePage(driver);
        openUrl("https://metro.zakaz.ua/ru/");
        homePage.searchField().sendKeys(lookingItem);
        pushBtnReturn();
        sleep(1);
        if (homePage.listItems().size() < 5) {
            System.out.println("Товаров меньше 5");
        } else {
            System.out.println("Товаров больше 5");
        }
        Assert.assertTrue(homePage.listItems().size() > 5, "Fail");
    }
}
