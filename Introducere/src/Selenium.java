import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver","E:\\ChromeDriver\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	
	driver.get("https://www.gds.ro/local");
	System.out.println(driver.getCurrentUrl());
	//driver.findElement(By.name("login")).sendKeys("mail@yahoo.com");
	//driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[2]/div/div")).sendKeys("12345");
	//driver.findElement(By.id("loginForm")).click();
	
	driver.close();
	}

}
