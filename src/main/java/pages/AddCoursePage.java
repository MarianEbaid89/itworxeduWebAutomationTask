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
    By createCourseButton = By.id("btnSaveAsDraftCourse");
    By successMessage = By.cssSelector("div.result");
    public void enterCourseName(String courseName){
        setElementText(courseNameTextField,courseName);
    }
    public void selectGrade(String gradeValue){
        selectFromDropDownByValue(courseGradesList,gradeValue);
    }
    public void selectTeacher(int teacherIndex){
        selectFromDropDownByIndex(teacherslist,teacherIndex);
    }
    public void clickOnCreateButton(){
        clickOnElement(createCourseButton);
    }
    public String getSuccessMessage(){
        return getElementText(successMessage);
    }


}
