import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class mainTestClass {

  WebDriver driver;

  @BeforeTest
  public void beforeTest(){

      System.setProperty("webdriver.chrome.driver", "/Users/wujiaojiao/Documents/jenkins/chromedriver");
      driver = new ChromeDriver();

  }

  @Test
  public void Test(){

    driver.get("http://www.baidu.com");
    String title = driver.getTitle();
    AssertJUnit.assertTrue(title.contains("百度"));
//    WebElement keywordEt = driver.findElement(By.id("kw"));
//    WebElement search = driver.findElement(By.id("su"));
//    keywordEt.sendKeys("hello");
//    search.click();
  }

  @AfterTest
  public void afterClass(){

  }


}
