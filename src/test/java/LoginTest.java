import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

    public void login1(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://testfasttrackit.info/selenium-test/");
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a")).click();
        driver.findElement(By.cssSelector("#email")).sendKeys("ramo.amo.ook@gmail.com");
        driver.findElement(By.cssSelector("#pass")).sendKeys("Exercitiu8");
        driver.findElement(By.cssSelector("#send2")).click();

    }

    public void login(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://testfasttrackit.info/selenium-test/");
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a")).click();
        driver.findElement(By.cssSelector("#email")).sendKeys("ramo.amo.ook@gmail.com");
        driver.findElement(By.cssSelector("#pass")).sendKeys("Exercitiu8");
        driver.findElement(By.cssSelector("#send2")).click();
        driver.quit();
    }

    public void loginWithInvalidEmail(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://testfasttrackit.info/selenium-test/");
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a")).click();
        driver.findElement(By.cssSelector("#email")).sendKeys("ramo.amo.ookgmail.com");
        driver.findElement(By.cssSelector("#pass")).sendKeys("Exercitiu8");
        driver.findElement(By.cssSelector("#send2")).click();
        driver.quit();
    }
    public void loginWithInvalidPassword(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://testfasttrackit.info/selenium-test/");
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a")).click();
        driver.findElement(By.cssSelector("#email")).sendKeys("ramo.amo.ookgmail.com");
        driver.findElement(By.cssSelector("#pass")).sendKeys("fmkjeawy5782");
        driver.findElement(By.cssSelector("#send2")).click();
        driver.quit();
    }
    public void loginWithoutPassword(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://testfasttrackit.info/selenium-test/");
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a")).click();
        driver.findElement(By.cssSelector("#email")).sendKeys("ramo.amo.ookgmail.com");
        driver.findElement(By.cssSelector("#send2")).click();
        driver.quit();
    }

    public void loginWithEmptyFields(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://testfasttrackit.info/selenium-test/");
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a")).click();
        driver.findElement(By.cssSelector("#send2")).click();
        driver.quit();
    }














}
