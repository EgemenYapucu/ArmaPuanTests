package ArmaPuanTests;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

class ArmaPuanTests{
	
	@Test
	public void Test1(){
					
				// declaration and instantiation of objects/variables
				System.setProperty("webdriver.chrome.driver","D:\\Browser drivers\\chromedriver.exe");
				ChromeDriver driver = new ChromeDriver();
				
				// launch Chrome and direct it to the google.com
				driver.get("http://localhost:4200/login");
				driver.findElement(By.xpath("/html/body/app-root/app-login/div/div/div[2]/a[1]/button")).click();
				driver.findElement(By.xpath("/html/body/app-root/app-employee/div/form/div[1]/a[1]")).click();
				driver.findElement(By.id("employeeId")).sendKeys("1");
				driver.findElement(By.id("name")).sendKeys("Hanife");
				driver.findElement(By.id("lastname")).sendKeys("Yılmaz");
				driver.findElement(By.id("email")).sendKeys("hanifeyılmaz@gmail.com");
				driver.findElement(By.id("managerId")).sendKeys("1");
				driver.findElement(By.id("managerDepartmentName")).sendKeys("x");
				//close Chrome
				driver.quit();	
		
	}

	@Test
	public void Test2(){
				
		// declaration and instantiation of objects/variables
		System.setProperty("webdriver.chrome.driver","D:\\Browser drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
			
		// launch Chrome and direct it to the google.com
		driver.get("http://localhost:4200/login");
		driver.findElement(By.xpath("/html/body/app-root/app-login/div/div/div[2]/a[1]/button")).click();
		driver.findElement(By.xpath("/html/body/app-root/app-employee/div/form/div[1]/a[1]")).click();
		driver.findElement(By.id("employeeId")).sendKeys("1");
		driver.findElement(By.id("name")).sendKeys("Hanife");
		driver.findElement(By.id("lastname")).sendKeys("Yılmaz");
		driver.findElement(By.id("email")).sendKeys("hanifeyılmaz@gmail.com");
		driver.findElement(By.id("managerId")).sendKeys("1");
		driver.findElement(By.id("managerDepartmentName")).sendKeys("x");
		//close Chrome
		//driver.close();
	
	}
}

