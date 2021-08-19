package Testing;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Struct;
import java.util.List;

public class DynamicRadioButton {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        String Url = "https://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html";

        driver.get(Url);

        List<WebElement> radio = driver.findElements(By.xpath("//input[@name='lang' and  @type='radio']"));

        for (int i=0;i<radio.size();i++) {

           WebElement local_radio =  radio.get(i);

           String value = local_radio.getAttribute("value");

            System.out.println(value);

            if (value.equalsIgnoreCase("RUBY")){
                local_radio.click();
            }

        }





    }
}
