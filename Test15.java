package ArmaPuanTests;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test15 {
	//Contact us bölümünde e-mail adresi Türkçe özel karakter içermez.
	public static void main(String[] args) {
		
		//Üzerinde çalışacağımız tarayıcı için gerekli olan driverları set ettik.
		System.setProperty("webdriver.chrome.driver","D:\\Browser drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
				
		//Test ediceğimiz siteye ulaştık.
		driver.get("http://localhost:4200/login");
		driver.findElement(By.xpath("/html/body/app-root/app-login/div/div/div[2]/a[2]/button")).click();
		driver.findElement(By.xpath("/html/body/app-root/app-homepage-employee/nav/div/a[2]/mat-icon")).click();
		
		driver.findElement(By.id("email")).sendKeys("şeymaünlü@gmail.com");
		driver.findElement(By.id("subject")).sendKeys("Fiyatlar");
		driver.findElement(By.id("request")).sendKeys("BLablabla");
		
		String actual_Mail = "şeymaünlü@gmail.com";
		String expected_Mail = driver.findElement(By.xpath("//*[@id=\"email\"]")).getText();
		if(expected_Mail.equals(actual_Mail))
			System.out.println("Test 15 failed.");
		else
			System.out.println("Test 15 successful.");
		//Tarayıcıyı kapatıyoruz.
		driver.quit();
		
	}

}
