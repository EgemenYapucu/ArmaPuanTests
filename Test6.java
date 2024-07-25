package ArmaPuanTests;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class Test6 {
	//Çalışan arama özelliği düzgün çalışmalı.
	public static void main(String[] args) {

		//Üzerinde çalışacağımız tarayıcı için gerekli olan driverları set ettik.
		System.setProperty("webdriver.chrome.driver","D:\\Browser drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
						
		//Test ediceğimiz siteye ulaştık.
		driver.get("http://localhost:4200/login");
		driver.findElement(By.xpath("/html/body/app-root/app-login/div/div/div[2]/a[1]/button")).click();
		driver.findElement(By.xpath("/html/body/app-root/app-employee/div/form/div[1]/a[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"employeeName\"]")).sendKeys("ED");
		
		//İlk sıradaki id edith isimli çalışanın id'si ile eşleşmeli
		String expected_ID = "58016";
		String actual_ID = driver.findElement(By.xpath("/html/body/app-root/app-employee/div/form/div[2]/table/tbody/tr[1]/th")).getText();
		if(expected_ID.equals(actual_ID))
			System.out.println("Test 6 successful");
		else
			System.out.println("Test 6 failed");
		//Tarayıcıyı kapatıyoruz.
		driver.quit();
	}
}
