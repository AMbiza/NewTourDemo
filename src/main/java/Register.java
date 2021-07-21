import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register {

    public static void main (String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        driver.manage().window().maximize();

        driver.get("http://demo.guru99.com/test/newtours/");

        driver.findElement(By.xpath("//a[contains(text(),'REGISTER')]")).click();

        driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Hello");

        driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Java");

        driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("0844671074");

        driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("www.java@gmail.com");

        driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("43 Khwezipark");

        driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Cape Town");

        driver.findElement(By.xpath("//input[@name='state']")).sendKeys("Western Cape");

        driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("7580");

        driver.findElement(By.xpath("//select[@name='country']")).sendKeys("SOUTH AFRICA");
        Thread.sleep(5000);

        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Asie");

        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Nolly");

        driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("Nolly");

        driver.findElement(By.xpath("//input[@name='submit']")).click();

        if(driver.findElement(By.xpath("//b[contains(.,'Note: Your user name is Asie.')]")).isDisplayed())
        {
            System.out.println("User name successfully displayed");
        }else

            System.out.println("User name not displayed");


        driver.findElement(By.xpath("//a[contains(text(),'sign-in')]")).click();

        driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("Asie");

        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Nolly");

        driver.findElement(By.xpath("//input[@name='submit']")).click();

        String TestResults="";

        if(driver.findElement(By.xpath("//h3[contains(.,'Login Successfully')]")).isDisplayed())
        {
            TestResults ="Passed";
        }else
            TestResults = "Failed";

        System.out.println(TestResults);
        driver.close();









    }
}
