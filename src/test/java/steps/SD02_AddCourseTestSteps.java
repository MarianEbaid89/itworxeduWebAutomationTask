package steps;

import base.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AddCoursePage;
import pages.AdminstrationPage;
import pages.CoursesPage;
import pages.LoginPage;

public class SD02_AddCourseTestSteps extends TestBase {
    LoginPage loginPage = new LoginPage(driver);
    AdminstrationPage adminstrationPage = new AdminstrationPage(driver);
    CoursesPage coursesPage = new CoursesPage(driver);
    AddCoursePage addCoursePage = new AddCoursePage(driver);
    @Given("user is logged in on the courses page")
    public void user_is_logged_in_on_the_courses_page() {
        /*loginPage.navigateHomePage();
        loginPage.enterValidUsernameField("testregister@aaa.com");
        loginPage.enterPasswordField("Wakram_123");
        loginPage.clickOnLogin();*/
        adminstrationPage.clickOnCourses();
    }

    @When("user clicks on add course button")
    public void user_clicks_on_add_course_button() {
        coursesPage.clickOnAddCourseButton();
    }
    @When("user fills course info {string} {string}")
    public void user_fills_course_info(String courseName, String gradeValue) {
        addCoursePage.enterCourseName(courseName);
        addCoursePage.selectGrade(gradeValue);
        addCoursePage.selectTeacher();
    }
    @When("user clicks on create button")
    public void user_clicks_on_create_button() {
        addCoursePage.clickOnCreateButton();
    }
    @Then("a new course {string} should added successfully")
    public void a_new_course_should_added_successfully(String courseName) {
        adminstrationPage.clickOnCourses();
        coursesPage.setSearchCourseTextField(courseName);
    }

}
