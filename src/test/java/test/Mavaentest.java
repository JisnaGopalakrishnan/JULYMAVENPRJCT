package test;


	
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	public class Mavaentest {
		WebDriver driver;

		@BeforeTest
		public void setUp() {
			driver = new ChromeDriver();
			driver.get("https://www.google.co.in");
		}
		
		@Test
		public void titleVerification() {
			
			String txt = driver.getTitle();
			if(txt.equals("Google")) {
				
			System.out.println("Title is :" + txt);
			}
			else {
				System.out.println("Failed");
			}
			
		}
	}


