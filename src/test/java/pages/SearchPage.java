package pages;

import org.openqa.selenium.By;

public class SearchPage extends BasePage {

    private By searchBox = By.name("q");

    public void search(String text) {
        driver.findElement(searchBox).sendKeys(text);
    }
}