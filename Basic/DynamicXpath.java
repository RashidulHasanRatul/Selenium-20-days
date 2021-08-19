package Testing;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpath {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        String Url = "http://18.209.122.163/admin/login";

        driver.get(Url);

        WebElement email = driver.findElement(By.name("email"));

        WebElement password = driver.findElement(By.name("password"));

        //set the element input
        email.sendKeys("superadmin@gmail.com");
        password.sendKeys("superadmin");

        //find the button and click on it
        WebElement login = driver.findElement(By.className("btn-primary"));
        login.click();


        WebElement catalogue = driver.findElement(By.linkText("Catalogue"));
        catalogue.click();

        WebElement Product = driver.findElement(By.xpath("//a[@href='http://18.209.122.163/admin/product']"));

        Product.click();


    }
}
