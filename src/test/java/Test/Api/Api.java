package Test.Api;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class Api {

    @Steps ApiSteps ApiSteps;
    @Given("user on end point  create")
    public void userOnEndPointCreate() {
        ApiSteps.userOnEndPointCreate();
    }

    @When("user post {string} and {string}")
    public void userPostAnd(String name, String job) {
        ApiSteps.userPostAnd(name , job);
    }

    @Then("success create new user")
    public void successCreateNewUser() {
        ApiSteps.successCreateNewUser();
    }


    @Given("user on end point update")
    public void userOnEndPointUpdate() {
        ApiSteps.userOnEndPointUpdate();
    }

    @When("user put {string} and {string}")
    public void userPutAnd(String name, String job) {
        ApiSteps.userPutAnd(name, job);
    }

    @Then("success update user")
    public void successUpdateUser() {
        ApiSteps.successUpdateUser();
    }

    @Given("user on delete endpoint")
    public void userOnDeleteEndpoint() {
        ApiSteps.userOnEndPointCreate();
    }

    @When("user send delete")
    public void userSendDelete() {
        ApiSteps.userSendDelete();
    }

    @Then("validate delete response")
    public void validateDeleteResponse() {
        ApiSteps.validateDeleteResponse();
    }

}
