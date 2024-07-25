package ArmaPuanTests;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

class ArmaPuanTests{
	@Test
	//Test 1:Varolmayan menajere çalışan eklenemez.
	public void Test01(){
		
		//Üzerinde çalışacağımız tarayıcı için gerekli olan driverları set ettik.
		System.setProperty("webdriver.chrome.driver","D:\\Browser drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
				
		//Test ediceğimiz siteye ulaştık.
		driver.get("http://localhost:4200/login");
		driver.findElement(By.xpath("/html/body/app-root/app-login/div/div/div[2]/a[1]/button")).click();
		driver.findElement(By.xpath("/html/body/app-root/app-employee/div/form/div[1]/a[1]")).click();
		driver.findElement(By.id("employeeId")).sendKeys("58017");
		driver.findElement(By.id("name")).sendKeys("June");
		driver.findElement(By.id("lastname")).sendKeys("Adams");
		driver.findElement(By.id("email")).sendKeys("june@arma.com");
		driver.findElement(By.id("managerId")).sendKeys("10004");
		driver.findElement(By.id("managerDepartmentName")).sendKeys("FI");
		
		//Eğer ki buton aktifleşirse test başarısızdır.
		boolean AddButtonEnabled = driver.findElement(By.xpath("/html/body/app-root/app-employee/div/form/button")).isEnabled();
		if(AddButtonEnabled)
			System.out.println("Test 1 failed.");
		else
			System.out.println("Test 1 successful.");
		//Tarayıcıyı kapatıyoruz.
		driver.quit();		
	}
	@Test
	//Test 2:Mailde @ işareti olmalı.
	public void Test02(){
		
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
		driver.findElement(By.id("email")).sendKeys("aliarma.com");
		driver.findElement(By.id("managerId")).sendKeys("10003");
		driver.findElement(By.id("managerDepartmentName")).sendKeys("CM");
		
		//Eğer ki buton aktifleşirse test başarısızdır.
		boolean AddButtonEnabled = driver.findElement(By.xpath("/html/body/app-root/app-employee/div/form/button")).isEnabled();
				
		if(AddButtonEnabled)
			System.out.println("Test 2 failed.");
		else
			System.out.println("Test 2 successful.");
		//Tarayıcıyı kapatıyoruz.
		driver.quit();
	}
	@Test
	//Test 3:Geçersiz menajer departman ismi olamaz.
	public void Test03() {
		
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
		//Tarayıcıyı kapatıyoruz
		driver.quit();
	}
	@Test
	//Test 4:Add Butonu düzgün çalışmalı
	public void Test04(){

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
		
		String expected_ID = "58017";
		String actual_ID = driver.findElement(By.xpath("/html/body/app-root/app-employee/div/form/div[2]/table/tbody/tr[6]/th")).getText();
		if(expected_ID.equals(actual_ID))
			System.out.println("Test 4 successful.");
		else
			System.out.println("Test 4 failed.");
		//Tarayıcıyı kapatıyoruz.
		driver.quit();
	}
	@Test
	//Test 5:Silme işlevi düzgün çalışmalı.
	public void Test05(){
		//Üzerinde çalışacağımız tarayıcı için gerekli olan driverları set ettik.
		System.setProperty("webdriver.chrome.driver","D:\\Browser drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
										
		//Test ediceğimiz siteye ulaştık.
		driver.get("http://localhost:4200/login");
		driver.findElement(By.xpath("/html/body/app-root/app-login/div/div/div[2]/a[1]/button")).click();
		driver.findElement(By.xpath("/html/body/app-root/app-employee/div/form/div[1]/a[1]")).click();
		driver.findElement(By.xpath("/html/body/app-root/app-employee/div/form/div[2]/table/tbody/tr[6]/a/mat-icon")).click();
				
		String expected_ID = "";
		String actual_ID = driver.findElement(By.xpath("/html/body/app-root/app-employee/div/form/div[2]/table/tbody/tr[6]/th")).getText();
		if(expected_ID.equals(actual_ID))
			System.out.println("Test 5 successful");
		else
			System.out.println("Test 5 failed");
		//Tarayıcıyı kapatıyoruz.
		driver.quit();
	}
	@Test
	//Test 6:Çalışan, arama özelliği düzgün çalışmalı.
	public void Test06(){
		
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
	@Test
	//Test 7:Menajerler için Add butonu düzgün çalışmalı.
	public void Test07(){
		
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
		driver.findElement(By.id("email")).sendKeys("egemen@arma.com");
		driver.findElement(By.id("departmentName")).sendKeys("AR");
		driver.findElement(By.xpath("/html/body/app-root/app-manager/div/form/button")).click();
				
		//Eklenen menajerin id'si sonda çıkmalıdır.
		String expected_ID = "10004";
		String actual_ID = driver.findElement(By.xpath("/html/body/app-root/app-manager/div/form/div[2]/table/tbody/tr[4]/th")).getText();
		if(expected_ID.equals(actual_ID))
			System.out.println("Test 7 successful.");
		else
			System.out.println("Test 7 failed.");
		//Tarayıcıyı kapatıyoruz.
		driver.quit();
	}
	@Test
	//Test 8:Menajerler için silme işlevi testi.
	public void Test08(){

		//Üzerinde çalışacağımız tarayıcı için gerekli olan driverları set ettik.
		System.setProperty("webdriver.chrome.driver","D:\\Browser drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
								
		//Test ediceğimiz siteye ulaştık.
		driver.get("http://localhost:4200/login");
		driver.findElement(By.xpath("/html/body/app-root/app-login/div/div/div[2]/a[1]/button")).click();
		driver.findElement(By.xpath("/html/body/app-root/app-employee/div/form/div[1]/a[2]")).click();
		driver.findElement(By.xpath("/html/body/app-root/app-manager/div/form/div[2]/table/tbody/tr[4]/a/mat-icon")).click();
		
		//Eğer çalışan silindiyse önceki bulunduğu konumdaki id'si boş olmalı.
		String expected_ID = "";
		String actual_ID = driver.findElement(By.xpath("/html/body/app-root/app-manager/div/form/div[2]/table/tbody/tr[4]/th")).getText();
		if(expected_ID.equals(actual_ID))
			System.out.println("Test 8 successful");
		else
			System.out.println("Test 8 failed");
		//Tarayıcıyı kapatıyoruz.
		driver.quit();		
	}
	@Test
	//Test 9:Menajerlerin, arama özelliği düzgün çalışmalı.
	public void Test09(){
		//Üzerinde çalışacağımız tarayıcı için gerekli olan driverları set ettik.
		System.setProperty("webdriver.chrome.driver","D:\\Browser drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
								
		//Test ediceğimiz siteye ulaştık.
		driver.get("http://localhost:4200/login");
		driver.findElement(By.xpath("/html/body/app-root/app-login/div/div/div[2]/a[1]/button")).click();
		driver.findElement(By.xpath("/html/body/app-root/app-employee/div/form/div[1]/a[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"managerName\"]")).sendKeys("oro");
				
		//İlk sıradaki id orospeza isimli menajerin id'si ile eşleşmeli
		String expected_ID = "10003";
		String actual_ID = driver.findElement(By.xpath("/html/body/app-root/app-manager/div/form/div[2]/table/tbody/tr[1]/th")).getText();
		if(expected_ID.equals(actual_ID))
			System.out.println("Test 9 successful");
		else
			System.out.println("Test 9 failed");
		//Tarayıcıyı kapatıyoruz.
		driver.quit();
	}
	@Test
	//Test 10:Menajer emaillerinde @ olmalıdır.
	public void Test10(){
		//Üzerinde çalışacağımız tarayıcı için gerekli olan driverları set ettik.
		System.setProperty("webdriver.chrome.driver","D:\\Browser drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
						
		//Test ediceğimiz siteye ulaştık.
		driver.get("http://localhost:4200/login");
		driver.findElement(By.xpath("/html/body/app-root/app-login/div/div/div[2]/a[1]/button")).click();
		driver.findElement(By.xpath("/html/body/app-root/app-employee/div/form/div[1]/a[2]")).click();
		
		driver.findElement(By.id("managerId")).sendKeys("58046");
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
	@Test
	//Test 11:Ürünlerin puanları 100 ile 1000 arasında bulunmalıdır.
	public void Test11(){
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
	@Test
	//Test 12:İndirim miktarı 0 ile 99 arasında olmak zorundadır.
	public void Test12(){

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
	@Test
	//Test 13:Ürün ekleme işlevi testi
	public void Test13(){

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
	@Test
	//Test 14:Ürün silme işlevi testi
	public void Test14(){

		//Üzerinde çalışacağımız tarayıcı için gerekli olan driverları set ettik.
		System.setProperty("webdriver.chrome.driver","D:\\Browser drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		//Test ediceğimiz siteye ulaştık.
		driver.get("http://localhost:4200/login");
		driver.findElement(By.xpath("/html/body/app-root/app-login/div/div/div[2]/a[1]/button")).click();
		driver.findElement(By.xpath("/html/body/app-root/app-employee/div/form/div[1]/a[3]")).click();
		driver.findElement(By.xpath("/html/body/app-root/app-product/form/div[2]/table/tbody/tr[4]/a/mat-icon")).click();
		
		//Eğer ürün silindiyse önceki bulunduğu konumdaki id'si boş olmmalı.
		String expected_ID = "";
		String actual_ID = driver.findElement(By.xpath("/html/body/app-root/app-product/form/div[2]/table/tbody/tr[4]/th")).getText();
		if(expected_ID.equals(actual_ID))
			System.out.println("Test 14 successful");
		else
			System.out.println("Test 14 failed");
		//Tarayıcıyı kapatıyoruz.
		driver.quit();	
	}
	@Test
	//Test 15:Contact us bölümünde e-mail adresi Türkçe özel karakter içermez.
	public void Test15(){
		
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

