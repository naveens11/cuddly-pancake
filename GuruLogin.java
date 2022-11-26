import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GuruLogin {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver","E:\\jarfiles\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://www.demo.guru99.com/V4/");
		  driver.manage().window().maximize();
		  driver.findElement(By.name("uid")).sendKeys("mngr458104");
		  driver.findElement(By.name("password")).sendKeys("yjaterA");
		  driver.findElement(By.name("btnLogin")).click();
	}

}
