package pakage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Test1 extends Thread
{
public void run()
{
	System.setProperty("webdriver.chrome.driver","F:\\kumar\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	driver.get("http://www.google.co.in");
	driver.close();
}
public static void main(String[] args)
{
	Test1 o=new Test1();
	o.start();
	System.setProperty("webdriver.chrome.driver","F:\\kumar\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.facebook.com");
	driver.close();
}
}
