package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddCoursePage extends PageBase{
    public AddCoursePage(WebDriver driver) {
        super(driver);
    }
    By courseNameTextField = By.id("txtCourseName");
    By courseGradesList = By.id("courseGrade");
    By teacherslist = By.id("teacherOnBehalf");
    By teacherNameFromList = By.cssSelector("h5[title='nada rehan']");
    By createCourseButton = By.id("btnSaveAsDraftCourse");

    public void enterCourseName(String courseName){
        setElementText(courseNameTextField,courseName);
    }
    public void selectGrade(String gradeValue){
        selectFromDropDownByValue(courseGradesList,gradeValue);
    }
    public void selectTeacher( ){
        clickOnElement(teacherslist);
        clickOnElement(teacherNameFromList);
    }
    public void clickOnCreateButton(){
        clickOnElement(createCourseButton);
    }


}
