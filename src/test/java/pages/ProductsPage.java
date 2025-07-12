package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.*;
import java.util.stream.Collectors;

public class ProductsPage{
	private WebDriver driver;
	
	private By sortDropdown=By.className("product_sort_container");
	private By productPrices=By.className("inventory_item_price");
	
	public ProductsPage(WebDriver driver) {
        this.driver = driver;
    }
	
	public void selectFilter(String filterOption) {
		driver.findElement(sortDropdown).click();
		driver.findElement(By.xpath("//option[text()='" + filterOption + "']")).click();
		
	}
	
	public List<Double> getDisplayedPrices(){
		List<WebElement> priceElements=driver.findElements(productPrices);
		return priceElements.stream()
                .map(e -> Double.parseDouble(e.getText().replace("$", "")))
                .collect(Collectors.toList());
	}
	
	 public boolean isSortedLowToHigh() {
	        List<Double> prices = getDisplayedPrices();
	        List<Double> sorted = new ArrayList<>(prices);
	        Collections.sort(sorted);
	        return prices.equals(sorted);
	    }

	    public boolean isSortedHighToLow() {
	        List<Double> prices = getDisplayedPrices();
	        List<Double> sorted = new ArrayList<>(prices);
	        sorted.sort(Collections.reverseOrder());
	        return prices.equals(sorted);
	    }
}