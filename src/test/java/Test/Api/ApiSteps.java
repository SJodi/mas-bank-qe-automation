package Test.Api;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class ApiSteps {

    private Response response; // Declare the response variable

    public void userOnEndPointCreate() {
        RestAssured.baseURI = "https://reqres.in/api";
    }

    public void userPostAnd(String name, String job) {
        Map<String, Object> body = new HashMap<>();
        body.put("name", name);
        body.put("job", job);

        RequestSpecification request = given()
                .contentType(ContentType.JSON)
                .body(body);

        response = request.post("/users");
    }

    public void successCreateNewUser() {
        response.then()
                .assertThat()
                .statusCode(201);

        // Extract the "name" value from the response body
        String name = response.path("name");
        String job = response.path("job");
        Assert.assertEquals("Setiawan Jodi", name);
        Assert.assertEquals("Test Engineer", job);
    }


    public void userOnEndPointUpdate() {
        RestAssured.baseURI = "https://reqres.in/api";
    }

    public void userPutAnd(String name, String job) {

        Map<String, Object> body = new HashMap<>();
        body.put("name", name);
        body.put("job", job);

        response = given()
                .contentType(ContentType.JSON)
                .body(body)
                .when()
                .put("/users/2"); // Use PUT instead of POST

    }

    public void successUpdateUser() {

        response.then()
                .assertThat()
                .statusCode(200);

        String updatedName = response.path("name");
        String updatedJob = response.path("job");


        Assert.assertEquals("Setiawan Jodi", updatedName);
        Assert.assertEquals("Test Engineer", updatedJob);

    }

    public void userSendDelete() {

        response = given()
                .when()
                .delete("/users/2");

    }

    public void validateDeleteResponse() {

        response.then()
                .assertThat()
                .statusCode(204);

    }
}
