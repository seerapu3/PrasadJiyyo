package accelerators;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Actiondrivers extends Base{
	
	public void enterTextAtEditor(WebDriver lDriver, By locator, String Text)
	{
		WebElement metadescription = lDriver.findElement(locator);
		lDriver.switchTo().frame(metadescription);
		WebElement editablemetadescription = lDriver.switchTo().activeElement();
		copyToClipbord(Text);
		editablemetadescription.click();
		editablemetadescription.sendKeys(Keys.chord(Keys.CONTROL, "v"), "");
		lDriver.switchTo().defaultContent();
	}
	
	public void copyToClipbord(String copyTo)
	{
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		StringSelection str = new StringSelection(copyTo);
		clipboard.setContents(str, null );
	}
	
	public void enterMultipleValues(WebDriver lDriver,By locator,String list, int elm)
	{
		ArrayList aList= new ArrayList(Arrays.asList(list.split(",")));
		List < WebElement > values = lDriver.findElements(locator);
		System.out.println(values.size());
		System.out.println(aList.size());

		for(int j=0;j<aList.size();j++)
		{
			String ptagvalue=String.valueOf(aList.get(j));
			System.out.println(ptagvalue);
			values.get(elm).click();
			values.get(elm).sendKeys(ptagvalue);
			values.get(elm).sendKeys(Keys.ENTER);
		}
		
	}
	
	public void enterMultipleValues1(WebDriver lDriver,By locator,String list, int elm)
	{
		ArrayList aList= new ArrayList(Arrays.asList(list.split(" ")));
		List < WebElement > values = lDriver.findElements(locator);
		System.out.println(values.size());
		System.out.println(aList.size());

		for(int j=0;j<aList.size();j++)
		{
			String ptagvalue=String.valueOf(aList.get(j));
			System.out.println(ptagvalue);
			values.get(elm).click();
			values.get(elm).sendKeys(ptagvalue);
			values.get(elm).sendKeys(Keys.ENTER);
		}
		
	}


}
