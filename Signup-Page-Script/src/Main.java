import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.nio.file.WatchEvent;

public class Main {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.get("http://localhost:5173/");

        WebElement usernameFiled=driver.findElement(By.name("username"));
        WebElement emailField=driver.findElement(By.name("email"));
        WebElement passwordField= driver.findElement(By.name("password"));
        WebElement confirmPasswordField= driver.findElement(By.name("confirmPassword"));

        usernameFiled.sendKeys("Mohammad Abdul-Rehman");
        emailField.sendKeys("m.abdul@gmail.com");
        passwordField.sendKeys("m.abdul786@");
        confirmPasswordField.sendKeys("m.abdul786@");

        WebElement registerButton= driver.findElement(By.cssSelector());



    }
}