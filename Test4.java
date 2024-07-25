package ArmaPuanTests;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4 {
	//Çalışanlar için Add butonu düzgün çalışmalı.
	public static void main(String[] args) {
		
		//Üzerinde çalışacağımız tarayıcı için gerekli olan driverları set ettik.
		System.setProperty("webdriver.chrome.driver","D:\\Browser drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
						
		//Test ediceğimiz siteye ulaştık.
		driver.get("http://localhost:4200/login");
		driver.findElement(By.xpath("/html/body/app-root/app-login/div/div/div[2]/a[1]/button")).click();
		driver.findElement(By.xpath("/html/body/app-root/app-employee/div/form/div[1]/a[1]")).click();
		driver.findElement(By.id("employeeId")).sendKeys("58017");
		driver.findElement(By.id("name")).sendKeys("Egemen");
		driver.findElement(By.id("lastname")).sendKeys("Yapucu");
		driver.findElement(By.id("email")).sendKeys("egemen@arma.com");
		driver.findElement(By.id("managerId")).sendKeys("10002");
		driver.findElement(By.id("managerDepartmentName")).sendKeys("IT");
		driver.findElement(By.xpath("/html/body/app-root/app-employee/div/form/button")).click();
		
		//Eklenen çalışanın id'si sonda olmalıdır
		String expected_ID = "58017";
		String actual_ID = driver.findElement(By.xpath("/html/body/app-root/app-employee/div/form/div[2]/table/tbody/tr[6]/th")).getText();
		if(expected_ID.equals(actual_ID))
			System.out.println("Test 4 successful.");
		else
			System.out.println("Test 4 failed.");
		//Tarayıcıyı kapatıyoruz.
		driver.quit();
	}
}