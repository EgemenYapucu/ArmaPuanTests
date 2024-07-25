package ArmaPuanTests;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test10{
	//Menajer maillerinde @ işareti bulunmalıdır.
	public static void main(String[] args) {
	
		//Üzerinde çalışacağımız tarayıcı için gerekli olan driverları set ettik.
		System.setProperty("webdriver.chrome.driver","D:\\Browser drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
						
		//Test ediceğimiz siteye ulaştık.
		driver.get("http://localhost:4200/login");
		driver.findElement(By.xpath("/html/body/app-root/app-login/div/div/div[2]/a[1]/button")).click();
		driver.findElement(By.xpath("/html/body/app-root/app-employee/div/form/div[1]/a[2]")).click();
		
		driver.findElement(By.id("managerId")).sendKeys("10004");
		driver.findElement(By.id("name")).sendKeys("Egemen");
		driver.findElement(By.id("lastname")).sendKeys("Yapucu");
		driver.findElement(By.id("email")).sendKeys("egemenarma.com");
		driver.findElement(By.id("departmentName")).sendKeys("CM");
				
		//Eğer ki buton aktifleşirse test başarısızdır.
		boolean AddButtonEnabled = driver.findElement(By.xpath("/html/body/app-root/app-manager/div/form/button")).isEnabled();
						
		if(AddButtonEnabled)
			System.out.println("Test 10 failed.");
		else
			System.out.println("Test 10 successful.");
		//Tarayıcıyı kapatıyoruz.
		driver.quit();
	

	}

}
