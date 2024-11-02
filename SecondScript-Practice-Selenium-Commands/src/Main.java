 import org.openqa.selenium.By;
 import org.openqa.selenium.WebDriver;
 import org.openqa.selenium.WebElement;
 import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");// set selenium that interact with
        //our chrome

        WebDriver driver=new ChromeDriver();// make chrome object

        driver.get("https://www.facebook.com");// open a webpage
        System.out.println(driver.getCurrentUrl());//get and print current url

        String pageTitle=driver.getTitle();// get the webpage Title
        System.out.println(pageTitle); //print title on console

        WebElement email=driver.findElement(By.id("email")); //find email field
        WebElement password=driver.findElement(By.id("pass")); //find password field
        WebElement loginBtn=driver.findElement(By.name("login")); //find login button field

        email.sendKeys("itsrehman@gmail.com"); //write email in email field
        password.sendKeys("abdulrehman222"); //write password in password field
       // loginBtn.click(); //click in login button after enter email & password

        String emailFieldPlaceholder=email.getAttribute("placeholder");//get the attribute placeholder
        // value from email field
        String passwordFieldPlaceholder=password.getAttribute("placeholder");//get the attribute placeholder
        // value from password field
        System.out.println("Email Field Placeholder: "+emailFieldPlaceholder);//print email field placeholder value
        //in console
        System.out.println("Password Field Placeholder: "+passwordFieldPlaceholder);//print password field placeholder value
        //in console

        String loginBtnText=loginBtn.getText();//get what text in login button
        System.out.println(loginBtnText);//print on console login button text

        driver.navigate().refresh();//refresh the page
        driver.navigate().to("https://www.netflix.com");//navigate/redirect to netflix website page
        driver.navigate().back();//back to previous page in browser history
        driver.navigate().forward();//forward to next page in browser history

        driver.close();//close current browser tab
        driver.quit();//close all browser tab and ends-up the WebDriver session
    }
}