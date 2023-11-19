package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CoursesPage extends PageBase{

    public CoursesPage(WebDriver driver) {
        super(driver);
    }
    By addCourseButton = By.id("btnListAddCourse");
    By searchCourseTextField = By.id("txtCourseSearch");
    public void clickOnAddCourseButton (){
        clickOnElement(addCourseButton);
    }
    public void setSearchCourseTextField (String searchCourseName){
        setElementText(searchCourseTextField,searchCourseName);
    }
}
