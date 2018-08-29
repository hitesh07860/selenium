package Java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class First_Test {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_MyProject\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='lst-ib']")).sendKeys("Swagatika Joshi");
		
		driver.findElement(By.xpath("//*[@id='tsf']/div[2]/div[3]/center/input[1]")).click();
		driver.quit();

	}

}
