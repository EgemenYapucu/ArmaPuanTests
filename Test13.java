package ArmaPuanTests;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test13 {

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
		driver.findElement(By.id("point")).sendKeys("300");
		driver.findElement(By.id("rate")).sendKeys("15");
		driver.findElement(By.id("productLink")).sendKeys("none");
		
		driver.findElement(By.xpath("/html/body/app-root/app-product/form/button")).click();
		
		//Eklenen ürünün id'si sonda olmalıdır
		String expected_ID = "4";
		String actual_ID = driver.findElement(By.xpath("/html/body/app-root/app-product/form/div[2]/table/tbody/tr[4]/th")).getText();
		if(expected_ID.equals(actual_ID))
			System.out.println("Test 13 successful.");
		else
			System.out.println("Test 13 failed.");
		//Tarayıcıyı kapatıyoruz.
		driver.quit();
	}
}
