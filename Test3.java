package ArmaPuanTests;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test3{
	// Geçersiz menajer departman ismi girilemez.
	public static void main(String[] args){
		
		//Üzerinde çalışacağımız tarayıcı için gerekli olan driverları set ettik.
		System.setProperty("webdriver.chrome.driver","D:\\Browser drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
				
		//Test ediceğimiz siteye ulaştık.
		driver.get("http://localhost:4200/login");
		driver.findElement(By.xpath("/html/body/app-root/app-login/div/div/div[2]/a[1]/button")).click();
		driver.findElement(By.xpath("/html/body/app-root/app-employee/div/form/div[1]/a[1]")).click();
		driver.findElement(By.id("employeeId")).sendKeys("58046");
		driver.findElement(By.id("name")).sendKeys("Ali");
		driver.findElement(By.id("lastname")).sendKeys("Eastman");
		driver.findElement(By.id("email")).sendKeys("ali@arma.com");
		driver.findElement(By.id("managerId")).sendKeys("10003");
		driver.findElement(By.id("managerDepartmentName")).sendKeys("Yemek");
				
		//Eğer ki buton aktifleşirse test başarısızdır.
		boolean AddButtonEnabled = driver.findElement(By.xpath("/html/body/app-root/app-employee/div/form/button")).isEnabled();
				
		if(AddButtonEnabled)
			System.out.println("Test 3 failed.");
		else
			System.out.println("Test 3 successful.");
		//Tarayıcıyı kapatıyoruz.
		driver.quit();
	}
}