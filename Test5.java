package ArmaPuanTests;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class Test5 {
	//Çalışanlar için silme işlevi düzgün çalışmalı.
	public static void main(String[] args) {
		
		//Üzerinde çalışacağımız tarayıcı için gerekli olan driverları set ettik.
		System.setProperty("webdriver.chrome.driver","D:\\Browser drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
								
		//Test ediceğimiz siteye ulaştık.
		driver.get("http://localhost:4200/login");
		driver.findElement(By.xpath("/html/body/app-root/app-login/div/div/div[2]/a[1]/button")).click();
		driver.findElement(By.xpath("/html/body/app-root/app-employee/div/form/div[1]/a[1]")).click();
		driver.findElement(By.xpath("/html/body/app-root/app-employee/div/form/div[2]/table/tbody/tr[6]/a/mat-icon")).click();
		
		//Eğer çalışan silindiyse önceki bulunduğu konumdaki id'si boş olmmalı.
		String expected_ID = "";
		String actual_ID = driver.findElement(By.xpath("/html/body/app-root/app-employee/div/form/div[2]/table/tbody/tr[6]/th")).getText();
		if(expected_ID.equals(actual_ID))
			System.out.println("Test 5 successful");
		else
			System.out.println("Test 5 failed");
		//Tarayıcıyı kapatıyoruz.
		driver.quit();
	}
}