package findElement;

import AppiumDriver.AppSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.net.MalformedURLException;

public class FindUI extends AppSetup {
    public FindUI() throws MalformedURLException {}

    public WebElement findByName(String key){
        return driver.findElement(By.name(key));
    }

    public WebElement findByXpath(String key){
        return driver.findElement(By.xpath(key));
    }

    public WebElement waitByName(String key){
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.name(key)));
    }

    public WebElement waitByXpath(String key){
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(key)));
    }

    public WebElement findByID(String key) { return driver.findElement(By.id(key));}

    public WebElement waitByID(String key) { return wait.until(ExpectedConditions.presenceOfElementLocated(By.id(key
    )));}

}
