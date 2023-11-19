package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminstrationPage extends PageBase{
    public AdminstrationPage(WebDriver driver) {
        super(driver);
    }
    By coursesListLink = By.id("btnMyCoursesList");
    By pageTitle = By.id("lblTenantDisplayName");
    public void clickOnCourses(){
        clickOnElement(coursesListLink);
    }
    public String getPageTitle(){
        return getElementText(pageTitle);
    }
}
