import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");

        LoginTest login = new LoginTest();
        WishListTest wishList = new WishListTest();
        RegisterTest register = new RegisterTest();
        









    }


}
