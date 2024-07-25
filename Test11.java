package ArmaPuanTests;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test11 {
	//Ürünlerin puanları 100 ile 1000 arasında bulunmalıdır.
	public static void main(String[] args) {
	
		//Üzerinde çalışacağımız tarayıcı için gerekli olan driverları set ettik.
		System.setProperty("webdriver.chrome.driver","D:\\Browser drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		//Test ediceğimiz siteye ulaştık.
		driver.get("http://localhost:4200/login");
		driver.findElement(By.xpath("/html/body/app-root/app-login/div/div/div[2]/a[1]/button")).click();
		driver.findElement(By.xpath("/html/body/app-root/app-employee/div/form/div[1]/a[3]")).click();
		
		driver.findElement(By.id("productId")).sendKeys("4");
		driver.findElement(By.id("name")).sendKeys("Elbise");
		driver.findElement(By.id("point")).sendKeys("1200");
		driver.findElement(By.id("rate")).sendKeys("60");
		driver.findElement(By.id("productLink")).sendKeys("none");
		
		boolean AddButtonEnabled = driver.findElement(By.xpath("/html/body/app-root/app-product/form/button")).isEnabled();
		
		if(AddButtonEnabled)
			System.out.println("Test 11 failed.");
		else
			System.out.println("Test 11 successful.");
		//Tarayıcıyı kapatıyoruz.
		driver.quit();
	}

}
