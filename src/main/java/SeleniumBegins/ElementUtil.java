package SeleniumBegins;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementUtil {

	private WebDriver driver;
	
	public ElementUtil (WebDriver driver) {
		this.driver = driver;
	}
	
	public void nullCheck(String value) {
		if (value == null) {
			throw new ElementException("Values is null" + value);
		}
		
	}
	//sendKeys
	public void doSendKeys(By locator , String value) {
		getElement(locator).sendKeys(value);
	}
	
	//findElement
	public WebElement getElement(By locator) {
		try {
		WebElement element =  driver.findElement(locator);
		return element;
		}catch(NoSuchElementException e) {
			System.out.println("Element is not present on the page  " + locator);
			e.printStackTrace();
			return null;
		}
		
	}
	
		
	//click()
	public void doclick(By locator) {
		getElement(locator).click();
	}
	//getText()
	public String doGetText(By locator) {
		return getElement(locator).getText();
	}
	//getAttribute( )
	public String doGetAttribute(By locator , String attName) {
		return getElement(locator).getAttribute(attName);
	}
	//isDisplayed
	public boolean doIsDisplayed(By locator) {
		try{
			boolean flag = getElement(locator).isDisplayed();
			System.out.println("Element is displayed" + locator);
			return flag;
		}catch(NoSuchElementException e){
			System.out.println("Element is not avaiable" + locator);
			return false;
			
		}
		
	}
	
	//
	
	//findElements
	public List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	//get size()
	public int getElementsCount(By locator) {
		return getElements(locator).size();
	}
	
	//get webElements list 
	public List<String> getElementsTextList(By locator) {
		int a=0, b=0;
		List<String> eleTextList = new ArrayList<String>();
		List<WebElement> eleList = getElements(locator);
		
		for(WebElement e : eleList) {
			String text = e.getText();
			if(text.length()!=0) {
				eleTextList.add(text);
				b++;
			}else {
				a++;
				
			}
		}
		System.out.println("Total number of links with out text = "+ a);
		System.out.println("Total number of links with text = "+ b);
		return eleTextList;
	}
	
	//Web Elements get attribute list
	public List<String> getWebElementAttribute(By locator , String attribute) {
		List<String> eleAttList = new ArrayList<String>();
		List<WebElement> eleAttri = getElements(locator);
		
		for(WebElement e : eleAttri) {
			String attriValue = e.getAttribute(attribute);
			if(attriValue!= null && attriValue.isEmpty()) {
				eleAttList.add(attriValue);
			}
		}
		return eleAttList;
		
	}
	//Select
	public void doSelectByIndex(By locator, int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
		
	}
	public void doSelectByValue(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
		
	}
	public void doSelectByVisibleText(By locator, String visibleText) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(visibleText);
		
	}
	
	//get all the drop down list count
	public int getDropDownOptionsCount(By locator) {
		Select select = new Select(getElement(locator));
		return select.getOptions().size();
	}
	//get all the drop down list values
	public List<String> getDropDownOptionsTextList(By locator) {
		Select select = new Select(getElement(locator));
		List<WebElement> optionsList = select.getOptions();
		List<String> optionsTextList = new ArrayList<String>();
		for(WebElement e : optionsList) {
			String text = e.getText();
			optionsTextList.add(text);
		}
		return optionsTextList;
	}
	
	
	//DeSelect
	
	public void doDeselectAll(By locator) {
		Select select = new Select(getElement(locator));
		select.deselectAll();
	}
	
	public void doDeselectByIndex(By locator, int index) {
		Select select = new Select(getElement(locator));
		select.deselectByIndex(index);
	}
	
	public void doDeselectByValue(By locator , String value) {
		Select select = new Select(getElement(locator));
		select.deselectByValue(value);
	}
	public void doDeselectByVisibleText(By locator , String visibleText) {
		Select select = new Select(getElement(locator));
		select.deselectByVisibleText(visibleText);
	}
	
	
	/**
	 * Navigate from Main menu to sub menu 
	 * @param parentLocator
	 * @param childLocator
	 * @throws InterruptedException
	 */
	public void handleParentSubMenu(By parentLocator, By childLocator) throws InterruptedException {
		Actions act = new Actions(driver);
		act.moveToElement(getElement(parentLocator)).perform();
		Thread.sleep(3000);
		doclick(childLocator);
		
	}
	/**
	 * This method perform Drag and Drop function
	 * @param sourse
	 * @param target
	 */
	
	public void doDragAndDrop(By sourse , By target) {
		Actions act = new Actions(driver);
		act.dragAndDrop(getElement(sourse), getElement(target)).perform();
	}
	/**
	 * This Method performing right click/Context Click
	 * @param locator
	 */
	public void doContextClick(By locator) {
		Actions act = new Actions(driver);
		act.contextClick(getElement(locator)).perform();
	}
	
	/**
	 * This method perform sendKeys with Actions  
	 * @param locator
	 * @param value
	 */
	public void sendKeysWithActions(By locator, String value) {
		Actions act = new Actions(driver);
		act.sendKeys(getElement(locator),value).perform();
	}
	
	public void sendKeysWithActions(By locator, String value, int duration) {
		Actions act = new Actions(driver);
		act.sendKeys(getElement(locator),value).pause(duration).perform();
	}
	
	
	
	// *******************Wait Utils***************//

		/**
		 * An expectation for checking that an element is present on the DOM of a page.
		 * This does not necessarily mean that the element is visible.
		 * 
		 * @param locator
		 * @param timeOut
		 * @return
		 */
		public WebElement waitForElementPresence(By locator, int timeOut) {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
			return wait.until(ExpectedConditions.presenceOfElementLocated(locator));

		}

		/**
		 * An expectation for checking that an element is present on the DOM of a page
		 * and visible. Visibility means that the element is not only displayed but also
		 * has a height and width that is greater than 0.
		 * 
		 * @param locator
		 * @param timeOut
		 * @return
		 */
		public WebElement waitForElementVisible(By locator, int timeOut) {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
			return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

		}

		/**
		 * An expectation for checking an element is visible and enabled such that you
		 * can click it.
		 * 
		 * @param locator
		 * @param timeOut
		 */
		public void clickWhenReady(By locator, int timeOut) {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
			wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
		}

		public String waitForTitleContains(String titleFraction, int timeOut) {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));

			try {
				if (wait.until(ExpectedConditions.titleContains(titleFraction))) {
					return driver.getTitle();
				}
			} catch (TimeoutException e) {
				System.out.println("title not found");
			}
			return driver.getTitle();
		}

		public String waitForTitleToBe(String titleVal, int timeOut) {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));

			try {
				if (wait.until(ExpectedConditions.titleIs(titleVal))) {
					return driver.getTitle();
				}
			} catch (TimeoutException e) {
				System.out.println("title not found");
			}
			return driver.getTitle();
		}

		public String waitForURLContains(String urlFraction, int timeOut) {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));

			try {
				if (wait.until(ExpectedConditions.urlContains(urlFraction))) {
					return driver.getCurrentUrl();
				}
			} catch (TimeoutException e) {
				System.out.println("URL not found");
			}
			return driver.getCurrentUrl();
		}

		public String waitForURLToBe(String urlValue, int timeOut) {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));

			try {
				if (wait.until(ExpectedConditions.urlToBe(urlValue))) {
					return driver.getCurrentUrl();
				}
			} catch (TimeoutException e) {
				System.out.println("URL not found");
			}
			return driver.getCurrentUrl();
		}
		
		public Alert waitForJSAlert(int timeOut) {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
			return wait.until(ExpectedConditions.alertIsPresent());
		}

		public String getAlertText(int timeOut) {
			Alert alert = waitForJSAlert(timeOut);
			String text = alert.getText();
			alert.accept();
			return text;
		}

		public void acceptAlert(int timeOut) {
			waitForJSAlert(timeOut).accept();
		}

		public void dismissAlert(int timeOut) {
			waitForJSAlert(timeOut).dismiss();
		}

		public void alertSendKeys(int timeOut, String value) {
			Alert alert = waitForJSAlert(timeOut);
			alert.sendKeys(value);
			alert.accept();
		}
		
		
		//wait for iframes/frame:
		/**
		 * An expectation for checking whether the given frame is available to switch
		 * to. If the frame is available it switches the given driver to the specified
		 * frame.
		 * 
		 * @param frameLocator
		 * @param timeOut
		 */
		public void waitForFrameByLocator(By frameLocator, int timeOut) {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameLocator));

		}

		public void waitForFrameByIndex(int frameIndex, int timeOut) {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameIndex));

		}

		public void waitForFrameByIndex(String frameIDOrName, int timeOut) {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameIDOrName));

		}

		public void waitForFrameByIndex(WebElement frameElement, int timeOut) {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameElement));

		}
		
		
		public boolean waitForWindowsToBe(int totalWindows, int timeOut) {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
			return wait.until(ExpectedConditions.numberOfWindowsToBe(totalWindows));
		}
	
	
	
	
	
	
	
	
	
	
	
}
