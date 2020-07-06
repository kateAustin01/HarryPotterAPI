package tests;

import io.restassured.response.Response;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import utilities.ConfigurationReader;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.*;

public class test {
    /*
    Verify sorting hat
1. Send a get request to /sortingHat. Request includes :
2. Verify status code 200, content type application/json; charset=utf-8
3. Verify that response body contains one of the following houses:
"Gryffindor", "Ravenclaw", "Slytherin", "Hufflepuff"




     */
    @BeforeAll
    public static void setup() {
        baseURI = ConfigurationReader.getProperty("baseUri");

    }

    @Test
    public void Verify_SortingHat() {
        Response response = given().pathParam("id","sortingHat").when().get("/{id}");
        System.out.println(response.prettyPrint());
    }
}
