package Test.Pages;

import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class todoPages extends PageObject {


    @FindBy(xpath = "//input[@class='new-todo']")
    WebElement toDoFied;
    public void addToDoList(String todo){
        element(toDoFied).waitUntilVisible();
        element(toDoFied).sendKeys(todo);
    }

    public void pressEnterButton(){
        element(toDoFied).sendKeys(Keys.ENTER);
    }

    public List<WebElement> getTodoItems() {
        return getDriver().findElements(By.xpath("//ul[@class='todo-list']/li"));
    }

    public void verifyTodoListContains(String todo) {
        List<WebElement> todoItems = getTodoItems();

        List<String> labels = new ArrayList<>();

        for (WebElement item : todoItems) {
            labels.add(item.findElement(By.xpath(".//label")).getText());
        }

        Assert.assertTrue(labels.contains(todo));

    }



    public void iClickTheCheckboxNextTo(String todo){
        // Get all todo items
        List<WebElement> items = getDriver().findElements(By.xpath("//ul[@class='todo-list']/li"));

        for(int i = 0; i < items.size(); i++) {

            // Get item text
            String text = items.get(i).findElement(By.xpath(".//label")).getText();

            // Check if it contains expected text
            if(text.contains(todo)) {

                // Build xpath with index
                String checkboxXpath = "//ul[@class='todo-list']/li[" + (i+1) + "]//input[@class='toggle']";

                // Click the checkbox for this item
                getDriver().findElement(By.xpath(checkboxXpath)).click();

                // Verify completed class is present
                String completedXpath = "//li[@class='completed']//input[@class='toggle']";
                List<WebElement> completed = getDriver().findElements(By.xpath(completedXpath));
                Assert.assertTrue(completed.size() > 0);

                break;
            }
        }
    }

    @FindBy(xpath = "//a[.='Completed']") WebElement buttonCompleted;
    public void shouldBeMarkedAsCompleted(){
        element(buttonCompleted).click();
    }

    @FindBy(xpath = "//a[.='Active']") WebElement buttonActive;
    public void filterActive(){
        element(buttonActive).click();
    }


    @FindBy(xpath = "//ul[@class='todo-list']/li") WebElement todoList;
    Actions actions = new Actions(getDriver());

    public void deleteToDo(String todo){
        List<WebElement> items = getDriver().findElements(By.xpath("//ul[@class='todo-list']/li"));


        actions.moveToElement(todoList).perform();
        for(int i = 0; i < items.size(); i++) {

            // Get item text
            String text = items.get(i).findElement(By.xpath(".//label")).getText();

            // Check if it contains expected text
            if(text.contains(todo)) {

                // Build xpath with index
                String deleteButton = "//li["+ (i+1) + "]//button[@class='destroy']";

                // Click the checkbox for this item
                getDriver().findElement(By.xpath(deleteButton)).click();

                // Verify completed class is present

//                Assert.assertFalse(text.contains(todo));

                break;
            }
        }

    }


    public void assertToDoDeleted(String todo){
        List<WebElement> todoItems = getTodoItems();

        List<String> labels = new ArrayList<>();

        for (WebElement item : todoItems) {
            labels.add(item.findElement(By.xpath(".//label")).getText());
        }

        Assert.assertFalse(labels.contains(todo));
    }





}
