package Test.Steps;

public class todoSteps {

    Test.Pages.todoPages todoPages;
    public  void iAmOnTheToDoListPage(){
        todoPages.open();
    }

    public void iEnterInTheNewToDoField(String todo){
        todoPages.addToDoList(todo);
    }

    public void iClickTheEnterButton(){
        todoPages.pressEnterButton();
    }

    public void iShouldSeeInMyToDoList(String todo){
        todoPages.verifyTodoListContains(todo);
    }

    public void iClickTheCheckboxNextTo(String todo){
        todoPages.iClickTheCheckboxNextTo(todo);
    }

    public void shouldBeMarkedAsCompleted(String todo){
        todoPages.shouldBeMarkedAsCompleted();
        todoPages.verifyTodoListContains(todo);
    }

    public void iFilterForActiveToDos(){
        todoPages.filterActive();
    }

    public void iClickTheDeleteButtonFor(String todo){
        todoPages.deleteToDo(todo);
    }

    public void shouldBeRemovedFromMyToDoList(String todo){
        todoPages.assertToDoDeleted(todo);
    }
}
