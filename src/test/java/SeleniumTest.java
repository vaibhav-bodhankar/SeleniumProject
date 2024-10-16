import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import javax.swing.plaf.synth.SynthTextAreaUI;

public class SeleniumTest {

    @Test
    public void setUp(){

        System.setProperty("web driver.chrome.driver",System.getProperty("user.dir") + "\\src\\test\\resources\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.flipkart.com");

        driver.findElement(By.name("q")).click();



    }

}
