package WebAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Task1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver;
		String SiteURL= "http://automationpractice.com/index.php";


		//driver path set
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		//Launch driver
		driver = new ChromeDriver();
		//set browser size
		driver.manage().window().maximize();

		//set mouse action 
		Actions act = new Actions(driver);

		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebDriverWait wait = new WebDriverWait(driver,30);


		//Go to URL
		driver.get(SiteURL);

		//locate signin option
		WebElement SignInOption = driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a"));
		SignInOption.click();

		// explicit wait - to wait for the title to be Login

		wait.until(ExpectedConditions.titleContains("Login"));

		//locate scroll text
		WebElement ScrollText = driver.findElement(By.xpath("//*[@id=\"create-account_form\"]/h3"));
		js.executeScript("arguments[0].scrollIntoView(true);", ScrollText);

		//locate email option
		WebElement Email = driver.findElement(By.xpath("//*[@id=\"email_create\"]"));
		Email.sendKeys("fasoga9053@jasmne.com");

		//locate create option
		WebElement Create = driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]"));
		Create.click();

		// explicit wait - to wait for the URL contains account creation

		wait.until(ExpectedConditions.urlContains("#account-creation"));


		//locate title option -Mrs
		WebElement Title = driver.findElement(By.xpath("//*[@id=\"id_gender2\"]"));
		Title.click();
		js.executeScript("arguments[0].scrollIntoView(true);", Title);
		Thread.sleep(2000);

		//locate First name option
		WebElement FirstName = driver.findElement(By.xpath("//*[@id=\"customer_firstname\"]"));
		FirstName.sendKeys("AAA");	

		//locate Last name option
		WebElement LastName = driver.findElement(By.xpath("//*[@id=\"customer_lastname\"]"));
		LastName.sendKeys("ZZZ");	

		//locate password option
		WebElement Password = driver.findElement(By.xpath("//*[@id=\"passwd\"]"));
		Password.sendKeys("123456");
		js.executeScript("arguments[0].scrollIntoView(true);", Password);
		Thread.sleep(2000);

		//Select date option
		Select DropDate = new Select(driver.findElement(By.name("days")));
		DropDate.selectByValue("6");

		//Select month option
		Select DropMonth = new Select(driver.findElement(By.name("months")));
		DropMonth.selectByValue("4");

		//Select year option
		Select DropYear = new Select(driver.findElement(By.name("years")));
		DropYear.selectByValue("1995");


		//locate company option
		WebElement Company = driver.findElement(By.xpath("//*[@id=\"company\"]"));
		Company.sendKeys("BBb");
		js.executeScript("arguments[0].scrollIntoView(true);", Company);
		Thread.sleep(2000);

		//locate Address 1 option
		WebElement Add1 = driver.findElement(By.xpath("//*[@id=\"address1\"]"));
		Add1.sendKeys("BBbsffs");


		//locate Address 2 option
		WebElement Add2 = driver.findElement(By.xpath("//*[@id=\"address2\"]"));
		Add2.sendKeys("BBbrrh");

		//locate City option
		WebElement City = driver.findElement(By.xpath("//*[@id=\"city\"]"));
		City.sendKeys("BBbrrh");

		//Select state option
		Select State = new Select(driver.findElement(By.name("id_state")));
		State.selectByValue("4");

		//locate ZIP option
		WebElement ZIP = driver.findElement(By.xpath("//*[@id=\"postcode\"]"));
		ZIP.sendKeys("98765");
		js.executeScript("arguments[0].scrollIntoView(true);", ZIP);
		Thread.sleep(2000);

		//Select Country option
		Select Country = new Select(driver.findElement(By.name("id_country")));
		Country.selectByValue("21");

		//locate Additional Information option
		WebElement AddInfo = driver.findElement(By.xpath("//*[@id=\"other\"]"));
		AddInfo.sendKeys("test data");

		//locate Home phone option
		WebElement Hphn = driver.findElement(By.xpath("//*[@id=\"phone\"]"));
		Hphn.sendKeys("098765432");

		//locate Mobile phone option
		WebElement Mphn = driver.findElement(By.xpath("//*[@id=\"phone_mobile\"]"));
		Mphn.sendKeys("123456789");
		js.executeScript("arguments[0].scrollIntoView(true);", Mphn);
		Thread.sleep(2000);

		//locate Alias address option
		WebElement Alias = driver.findElement(By.xpath("//*[@id=\"alias\"]"));
		Alias.sendKeys("assfsdf");

		//locate register option
		WebElement Register = driver.findElement(By.xpath("//*[@id=\"submitAccount\"]"));
		Register.click();

		// explicit wait - to wait for the title to be My account
		wait.until(ExpectedConditions.titleContains("My account"));

		//Go to Product 1 URL
		driver.get("http://automationpractice.com/index.php?id_product=1&controller=product");

		// explicit wait - to wait for the title to be My account
		wait.until(ExpectedConditions.titleContains("Faded Short"));

		//locate scroll text2
		WebElement ScrollText2 = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/div/div[3]/h1"));
		js.executeScript("arguments[0].scrollIntoView(true);", ScrollText2);	


		//locate add to cart option
		WebElement AddToCart = driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button"));
		AddToCart.click();

		//locate add to cart option
		WebElement ContinueShopping = driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span"));
		// explicit wait - to wait for the title to be My account
		wait.until(ExpectedConditions.elementToBeClickable(ContinueShopping));
		ContinueShopping.click();
		Thread.sleep(1000);



		//Go to Product 1 URL
		driver.get("http://automationpractice.com/index.php?id_product=2&controller=product");

		// explicit wait - to wait for the title to be My account
		wait.until(ExpectedConditions.titleContains("Blouse"));

		//locate scroll text2
		WebElement ScrollText3 = driver.findElement(By.xpath("//*[@id=\"product_reference\"]"));
		js.executeScript("arguments[0].scrollIntoView(true);", ScrollText3);	


		//locate add to cart option
		WebElement AddToCart2 = driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button"));
		AddToCart2.click();


		//locate add to cart option
		WebElement ProceedToCheckout = driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a"));
		// explicit wait - to wait for the title to be My account
		wait.until(ExpectedConditions.elementToBeClickable(ProceedToCheckout));
		ProceedToCheckout.click();

		// explicit wait - to wait for the title to be My account
		wait.until(ExpectedConditions.titleContains("Order"));

		//locate scroll text2
		WebElement ScrollText4 = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[3]/div[1]"));
		js.executeScript("arguments[0].scrollIntoView(true);", ScrollText4);	


		//locate add to cart option
		WebElement Checkout = driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]"));
		Checkout.click();

		// explicit wait - to wait for the title to be My account
		wait.until(ExpectedConditions.urlContains("order&step=1"));

		//locate scroll text2
		WebElement ScrollText5 = driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/div/div[1]/div[1]/div/label"));
		js.executeScript("arguments[0].scrollIntoView(true);", ScrollText5);	

		//locate scroll text2
		WebElement ScrollText6 = driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/div/p/a"));
		js.executeScript("arguments[0].scrollIntoView(true);", ScrollText6);


		//locate add to cart option
		WebElement Checkout2 = driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button"));
		Checkout2.click();

		// explicit wait - to wait for the title to be My account
		wait.until(ExpectedConditions.urlContains("=order"));

		//locate scroll text2
		WebElement ScrollText7 = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div[2]/p"));
		js.executeScript("arguments[0].scrollIntoView(true);", ScrollText7);	

		//locate Terms of service option
		WebElement TOS = driver.findElement(By.xpath("//*[@id=\"cgv\"]"));
		TOS.click();

		//locate add to cart option
		WebElement Checkout3 = driver.findElement(By.xpath("//*[@id=\"form\"]/p/button"));
		Checkout3.click();

		// explicit wait - to wait for the title to be My account
		wait.until(ExpectedConditions.urlContains("order&multi-shipping"));

		//locate scroll text2
		WebElement ScrollText8 = driver.findElement(By.xpath("//*[@id=\"center_column\"]/h1"));
		js.executeScript("arguments[0].scrollIntoView(true);", ScrollText8);	

		//locate scroll text2
		WebElement ScrollText9 = driver.findElement(By.xpath("//*[@id=\"cart_summary\"]/tfoot/tr[5]"));
		js.executeScript("arguments[0].scrollIntoView(true);", ScrollText9);


		//locate Pay by bank wire option
		WebElement BankWire = driver.findElement(By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a"));
		BankWire.click();

		// explicit wait - to wait for the title to be My account
		wait.until(ExpectedConditions.urlContains("=bankwire&controller=payment"));

		//locate scroll text2
		WebElement ScrollText10 = driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/div/h3"));
		js.executeScript("arguments[0].scrollIntoView(true);", ScrollText10);

		//locate Confirm option
		WebElement Confirm = driver.findElement(By.xpath("//*[@id=\"cart_navigation\"]/button"));
		Confirm.click();

		// explicit wait - to wait for the title to be My account
		wait.until(ExpectedConditions.titleContains("Order confirmation"));

		//close driver
		driver.close();
	}

}
