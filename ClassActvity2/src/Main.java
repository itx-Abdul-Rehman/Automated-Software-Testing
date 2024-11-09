import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        //Q1- Write a code snippet that finds all the <button> elements on a web page and
        // prints out the count.
        driver.get("https://www.playstation.com/en-us/ps5/");
        List<WebElement> buttons=driver.findElements(By.tagName("button"));
        System.out.println("Total Number of Buttons on a web-page: "+buttons.size());


        //Q2- Write a Selenium command to locate a hyperlink on a web page that contains a
        // specific part of the link text. Replace "paste-sample-partial-link-text" with any
        // example text you might expect in a link on a webpage.
//        driver.get("https://www.playstation.com/en-us/ps5/games/");
//        WebElement element= driver.findElement(By.partialLinkText("now"));
//        element.click();


        //Q3- Using CSS selectors in Selenium, find an element whose attribute value starts
        // with a specified text. What CSS selector syntax would you use if you wanted to
        // locate an element by an attribute whose value begins with certain text?
//        driver.get("https://www.playstation.com/en-us/ps5/games/");
//        WebElement element = driver.findElement(By.cssSelector("a[href^='#out']"));
//        element.click();


       //Q4- Using XPath in Selenium, write a command to locate an element containing specific
        // text. Substitute "paste-some-sample-text-here" with an example of text you expect to
        // find in the element's content.
//        driver.get("https://www.playstation.com/en-us/ps5/games/");
//        WebElement element = driver.findElement(By.xpath("//*[contains(text(), 'upgradeable')]"));
//        element.click();





    }
}