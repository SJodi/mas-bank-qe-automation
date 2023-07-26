package Test.Tests;

import Test.Steps.todoSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class todoTest {

    @Steps
    Test.Steps.todoSteps todoSteps;

    @Given("I am on the to-do list page")
    public void iAmOnTheToDoListPage() {
        todoSteps.iAmOnTheToDoListPage();
    }

    @When("I enter {string} in the new to-do field")
    public void iEnterInTheNewToDoField(String todo) {
        todoSteps.iEnterInTheNewToDoField(todo);
    }

    @When("I click the enter button")
    public void iClickTheEnterButton() {
        todoSteps.iClickTheEnterButton();
    }

    @Then("I should see {string} in my to-do list")
    public void iShouldSeeInMyToDoList(String todo) {
        todoSteps.iShouldSeeInMyToDoList(todo);

    }

    @Given("I have {string} in my to-do list")
    public void iHaveInMyToDoList(String todo) {
        todoSteps.iAmOnTheToDoListPage();
        todoSteps.iEnterInTheNewToDoField(todo);
        todoSteps.iClickTheEnterButton();
        todoSteps.iShouldSeeInMyToDoList(todo);
    }

    @When("I click the checkbox next to {string}")
    public void iClickTheCheckboxNextTo(String todo) {
        todoSteps.iClickTheCheckboxNextTo(todo);
    }

    @Then("{string} should be marked as completed")
    public void shouldBeMarkedAsCompleted(String todo) {
        todoSteps.shouldBeMarkedAsCompleted(todo);
    }

    @Given("I have to-dos {string} and {string}")
    public void iHaveToDosAnd(String todo, String todo2) {
        todoSteps.iAmOnTheToDoListPage();
        todoSteps.iEnterInTheNewToDoField(todo);
        todoSteps.iClickTheEnterButton();
        todoSteps.iEnterInTheNewToDoField(todo2);
        todoSteps.iClickTheEnterButton();
        todoSteps.iShouldSeeInMyToDoList(todo);
        todoSteps.iShouldSeeInMyToDoList(todo2);
    }

    @Given("{string} is completed")
    public void isCompleted(String todo2) {
        todoSteps.iClickTheCheckboxNextTo(todo2);
    }

    @When("I filter for active to-dos")
    public void iFilterForActiveToDos() {
        todoSteps.iFilterForActiveToDos();
    }

    @Then("I should only see {string}")
    public void iShouldOnlySee(String todo) {
        todoSteps.iShouldSeeInMyToDoList(todo);
    }


    @When("I click the delete button for {string}")
    public void iClickTheDeleteButtonFor(String todo) {
        todoSteps.iEnterInTheNewToDoField("asdf");
        todoSteps.iClickTheEnterButton();
        todoSteps.iClickTheDeleteButtonFor(todo);
    }

    @Then("{string} should be removed from my to-do list")
    public void shouldBeRemovedFromMyToDoList(String todo) {
        todoSteps.shouldBeRemovedFromMyToDoList(todo);
    }


}
