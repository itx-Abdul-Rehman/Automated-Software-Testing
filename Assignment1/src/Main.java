import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","chromedriver.exe");

        WebDriver driver=new ChromeDriver();
//        driver.get("https://apkzone.net/");
//        WebElement searchBox=driver.findElement(By.id("sbinput"));
//        searchBox.sendKeys("Among us");

//        WebElement searchButton=driver.findElement(By.className("sb_submit"));
//        searchButton.click();

//        WebElement searchBox=driver.findElement(By.name("s"));
//        searchBox.sendKeys("KineMaster");

//        WebElement copyrightLink=driver.findElement(By.linkText("DMCA"));
//        copyrightLink.click();

//         WebElement howToDownloadLink=driver.findElement(By.partialLinkText("Download"));
//         howToDownloadLink.click();


           driver.get("https://apkzone.net/among-us/");
//           WebElement downloadButton= driver.findElement(By.xpath("//a[@class='buttond downloadAPK']"));
//           System.out.println(downloadButton.getText());
//           downloadButton.click();

//          WebElement toggleButton=driver.findElement(By.xpath("//div[contains(@id,'light')]"));
//          toggleButton.click();

//           WebElement commentBox=driver.findElement(By.xpath("//textarea[@placeholder='Write a comment...']"));
         WebElement commentBox=driver.findElement(By.id("comment"));
           commentBox.sendKeys("Assignment 1 Automated Software Testing :)");
    }
}