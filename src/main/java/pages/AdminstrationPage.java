package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminstrationPage extends PageBase{
    public AdminstrationPage(WebDriver driver) {
        super(driver);
    }
    By coursesListLink = By.id("btnMyCoursesList");
    By pageTitleText = By.id("lblTenantDisplayName");
    public void clickOnCourses(){
        clickOnElement(coursesListLink);
    }
    public String getPageTitleText(){
        return getElementText(pageTitleText);
    }
}
