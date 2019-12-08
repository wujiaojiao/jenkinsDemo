import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class mainClass {

  public static void main(String[] args){
      System.setProperty("webdriver.chrome.driver", "/Users/wujiaojiao/Documents/jenkins/chromedriver");
      WebDriver driver = new ChromeDriver();
      driver.get("http://www.baidu.com");
      WebElement keywordEt = driver.findElement(By.id("kw"));
      WebElement search = driver.findElement(By.id("su"));
      keywordEt.sendKeys("hahaah");
      search.click();
  }

}
