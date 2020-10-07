import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterTest {


    public void createAccount(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://testfasttrackit.info/selenium-test/");
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li:nth-child(5) > a")).click();
        driver.findElement(By.cssSelector("#firstname")).sendKeys("Muresan");
        driver.findElement(By.cssSelector("#lastname")).sendKeys("Ramona");
        driver.findElement(By.cssSelector("#email_address")).sendKeys("ramo.amo.ook@gmail.com");
        driver.findElement(By.cssSelector("#password")).sendKeys("Exercitiu8");
        driver.findElement(By.cssSelector("#confirmation")).sendKeys("Exercitiu8");
        driver.findElement(By.cssSelector("#form-validate > div.buttons-set > button")).click();
        driver.quit();

    }

    public void createAccountWithoutEmail(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://testfasttrackit.info/selenium-test/");
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li:nth-child(5) > a")).click();
        driver.findElement(By.cssSelector("#firstname")).sendKeys("Muresan");
        driver.findElement(By.cssSelector("#lastname")).sendKeys("Ramona");
        driver.findElement(By.cssSelector("#password")).sendKeys("Exercitiu8");
        driver.findElement(By.cssSelector("#confirmation")).sendKeys("Exercitiu8");
        driver.findElement(By.cssSelector("#form-validate > div.buttons-set > button")).click();
        driver.quit();

    }

    public void createAccountWithoutConfirmingThePassword(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://testfasttrackit.info/selenium-test/");
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li:nth-child(5) > a")).click();
        driver.findElement(By.cssSelector("#firstname")).sendKeys("Muresan");
        driver.findElement(By.cssSelector("#lastname")).sendKeys("Ramona");
        driver.findElement(By.cssSelector("#email_address")).sendKeys("ramo.amo.ook@gmail.com");
        driver.findElement(By.cssSelector("#password")).sendKeys("Exercitiu8");
        driver.findElement(By.cssSelector("#form-validate > div.buttons-set > button")).click();
        driver.quit();

    }

    public void createAccountWithEmptyFields(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://testfasttrackit.info/selenium-test/");
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li:nth-child(5) > a")).click();
        driver.findElement(By.cssSelector("#form-validate > div.buttons-set > button")).click();
        driver.quit();

    }
    public void createAccountWithTwoDifferentPasswords(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://testfasttrackit.info/selenium-test/");
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li:nth-child(5) > a")).click();
        driver.findElement(By.cssSelector("#firstname")).sendKeys("Muresan");
        driver.findElement(By.cssSelector("#lastname")).sendKeys("Ramona");
        driver.findElement(By.cssSelector("#email_address")).sendKeys("ramo.amo.ook@gmail.com");
        driver.findElement(By.cssSelector("#password")).sendKeys("Exercitiu8");
        driver.findElement(By.cssSelector("#confirmation")).sendKeys("Exercitiu5");
        driver.findElement(By.cssSelector("#form-validate > div.buttons-set > button")).click();
        driver.quit();


    }








}
