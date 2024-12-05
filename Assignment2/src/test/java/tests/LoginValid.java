
package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginValid {

    WebDriver driver;

    @BeforeClass
    public void setup(){
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void testCases() throws InterruptedException {

        Actions actions=new Actions(driver);
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));
        driver.get("https://login.live.com/login.srf?wa=wsignin1.0&rpsnv=166&ct=1733075102&rver=7.5.2211.0&wp=MBI_SSL&wreply=https%3a%2f%2foutlook.live.com%2fowa%2f%3fnlp%3d1%26cobrandid%3dab0455a0-8d03-46b9-b18b-df2f57b9e44c%26culture%3den-us%26country%3dus%26RpsCsrfState%3dc4e70378-0fac-bb34-b8a5-0d22625362b5&id=292841&aadredir=1&CBCXT=out&lw=1&fl=dob%2cflname%2cwld&cobrandid=ab0455a0-8d03-46b9-b18b-df2f57b9e44c");
        String expectedTitle="Sign in to Outlook";
        String actualTitle= driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle,"Login page title cannot matches the expected title");

        WebElement emailField=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='loginfmt']")));
        actions.sendKeys(emailField,"l1f21bsse0213@ucp.edu.pk")
                .sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.ENTER).build().perform();


        WebElement passwordField= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='i0118']")));
        actions.sendKeys(passwordField,"Javaidramay367").sendKeys(Keys.TAB).sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER).build().perform();

        WebElement yesButton=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='idSIButton9']")));
        actions.click(yesButton).perform();

        String dashboardExpectedURL="https://outlook.office365.com/mail/";
        String dashboardActualURL= driver.getCurrentUrl();
        Assert.assertEquals(dashboardActualURL,dashboardExpectedURL,"Unsuccessful Login");

         WebElement newEmail= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='textContainer label-194']")));
         newEmail.click();
        Thread.sleep(10000);
        WebElement recipientAddress= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='ApKtB ___hhiv960 f22iagw fly5x3f f1fow5ox f1l02sjl']")));
        actions.sendKeys(recipientAddress,"l1f21bsse0191@ucp.edu.pk").sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB).sendKeys("ATS Assignment 2").sendKeys(Keys.TAB)
                .sendKeys("My name is Abdul Rehman.").sendKeys(Keys.ENTER).sendKeys("regards,")
                .build().perform();

        WebElement draftsBtn= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Drafts']")));
        actions.click(draftsBtn).perform();

        WebElement draftMail= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='FqgPc gy2aJ Ejrkd']")));
      //  String expectedSubject="ATS Assignment 2";
     //   String mailSubject=draftMail.getText();
//        Assert.assertEquals(mailSubject,expectedSubject,"Mail not saved as draft");


        WebElement logoutDropdown= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='O365_HeaderRightRegion']")));
        actions.click(logoutDropdown).perform();

        WebElement logoutBtn= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='mectrl_body_signOut']")));
        actions.click(logoutBtn).perform();

        WebElement logout= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='login_workload_logo_text']")));
        Assert.assertTrue(logout.isDisplayed(),"Unsuccessfully Logout");

    }


    @AfterClass
    public void teardown(){
        if(driver!=null){
            driver.quit();
        }
    }

}