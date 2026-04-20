package pages;

import utils.ConfigReader;

public class HomePage extends BasePage {

    public void openHomePage() {
        driver.get(ConfigReader.get("baseUrl"));
    }
}