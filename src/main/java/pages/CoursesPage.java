package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;

public class CoursesPage extends PageBase{

    public CoursesPage(WebDriver driver) {
        super(driver);
    }
    By addCourseButton = By.id("btnListAddCourse");
    By searchCourseTextField = By.id("txtCourseSearch");
    By coursesTitlesList = By.id("lnkListCourseSelcted");
    public void clickOnAddCourseButton (){
        clickOnElement(addCourseButton);
    }
    public void setSearchCourseTextField (String searchCourseName){
        setElementText(searchCourseTextField,searchCourseName);
        submitElement(searchCourseTextField);
    }
    public List<String> getCoursesTitleText(){
        List <String> coursesTitles = new ArrayList<>();
        for (int i = 0; i<findElementsList(coursesTitlesList).size(); i++){
            String str = findElementsList(coursesTitlesList).get(i).getText();
            coursesTitles.add(str);
        }
        return coursesTitles;
    }
}
