package org.example.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.LoginPage;
import org.example.utilities.BrowserUtils;
import org.example.utilities.ConfigurationReader;
import org.example.utilities.Driver;
import org.junit.Assert;

public class LoginStepDefs {
       @Given("the user is on the login page")
        public void the_user_is_on_the_login_page() throws InterruptedException {
            String url = ConfigurationReader.get("url");
            //WebDriver driver = Driver.get();
            Driver.get().get(url);

        }

        @When("the user enters the standard_user information")
        public void the_user_enters_the_standard_user_information() throws InterruptedException {
            String username = ConfigurationReader.get("standard_user");
            String password = ConfigurationReader.get("password");

            LoginPage loginPage = new LoginPage();
            loginPage.login(username,password);
        }

        @Then("the user should be able to login")
        public void the_user_should_be_able_to_login() throws InterruptedException {
            BrowserUtils.waitFor(3);
            String actualTitle = Driver.get().getTitle();
            Assert.assertEquals("Dashboard",actualTitle);

        }

        @When("the user enters the locked_out_user information")
        public void the_user_enters_the_locked_out_user_information() throws InterruptedException {
            String username = ConfigurationReader.get("locked_out_user");
            String password = ConfigurationReader.get("password");

            LoginPage loginPage = new LoginPage();
            loginPage.login(username,password);

        }

        @When("the user enters the problem_user information")
        public void the_user_enters_the_problem_user_information() {
            String username = ConfigurationReader.get("problem_user");
            String password = ConfigurationReader.get("password");

            LoginPage loginPage = new LoginPage();
            loginPage.login(username,password);
        }

      @When("the user enters the performance_glitch_user information")
        public void the_user_enters_the_performance_glitch_user_information() {
        String username = ConfigurationReader.get("performance_glitch_user");
        String password = ConfigurationReader.get("password");

        LoginPage loginPage = new LoginPage();
        loginPage.login(username,password);
    }
        @When("the user logs in using {string} and {string}")
        public void the_user_logs_in_using_and(String username, String password) {
            LoginPage loginPage = new LoginPage();
            loginPage.login(username,password);
        }

        @Then("the title contains {string}")
        public void the_title_contains(String expectedTitle) {
            System.out.println("expectedTitle = " + expectedTitle);
            BrowserUtils.waitFor(2);
            Assert.assertTrue(Driver.get().getTitle().contains(expectedTitle));

        }

}


