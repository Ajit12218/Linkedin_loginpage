package sample;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class app1 {

	public static void main(String[] args) {
		//String username = "8240372675";
		//String password = "Ajit8240@";
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Downloads for Project\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.linkedin.com");
		driver.findElement(By.id("session_key")).sendKeys("mandalajit994@gmail.com");
		driver.findElement(By.id("session_password")).sendKeys("Ajit8240@");
		driver.findElement(By.xpath("//button[normalize-space()='Sign in']")).click();
		
	}

}
