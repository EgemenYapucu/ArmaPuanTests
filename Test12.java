package ArmaPuanTests;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test12 {
	//İndirim miktarı 0 ile 99 arasında olmak zorundadır.
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
		driver.findElement(By.id("point")).sendKeys("999");
		driver.findElement(By.id("rate")).sendKeys("100");
		driver.findElement(By.id("productLink")).sendKeys("none");
		
		boolean AddButtonEnabled = driver.findElement(By.xpath("/html/body/app-root/app-product/form/button")).isEnabled();
		
		if(AddButtonEnabled)
			System.out.println("Test 12 failed.");
		else
			System.out.println("Test 12 successful.");
		//Tarayıcıyı kapatıyoruz.
		driver.quit();

	}

}
