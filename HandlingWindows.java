package week3day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindows {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/window.xhtml");
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> lst=new ArrayList<String>(windowHandles);
		driver.switchTo().window(lst.get(1));
		System.out.println(driver.getTitle());
		driver.switchTo().window(lst.get(0));
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
		driver.switchTo().window(lst.get(2));
		System.out.println(driver.getTitle());
		
		
						
		
		
		
		
		
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
