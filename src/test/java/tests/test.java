package tests;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import utilities.ConfigurationReader;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.core.StringContains.containsString;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class test {

    @BeforeAll
    public static void setup() {
        baseURI = ConfigurationReader.getProperty("baseUri");

    }

      /*
    Verify sorting hat
1. Send a get request to /sortingHat. Request includes :
2. Verify status code 200, content type application/json; charset=utf-8
3. Verify that response body contains one of the following houses:
"Gryffindor", "Ravenclaw", "Slytherin", "Hufflepuff"

       */

    @Test
    public void Verify_SortingHat() {

        Response response = given().pathParam("Mahriban", "sortingHat").when().get("/{Mahriban}");
        assertEquals(200,response.statusCode());
        assertEquals("application/json; charset=utf-8",response.contentType());
        List<String> houses = new ArrayList<>(Arrays.asList("\"Gryffindor\"", "\"Ravenclaw\"", "\"Slytherin\"", "\"Hufflepuff\""));
        assertTrue(houses.contains(response.getBody().asString()));

    }

/*
Verify bad key
 1.Send a get request to /characters.
  Request includes :
  •Header Accept with value application/json
  •Query param key with value invalid
  2.Verify status code 401, content type application/json; charset=utf-8
  3.Verify response status line include message Unauthorized
  4.Verify that response body says"error":"APIKeyNotFound"
 */
    @Test
    public void verify_Bad_Key(){
        given().accept(ContentType.JSON).
                when().queryParam("key", "invalid").
                get("/characters").prettyPeek()
                .then().assertThat().statusCode(401).
                contentType("application/json; charset=utf-8").
                statusLine(containsString("Unauthorized")).
                body("error", is("API Key Not Found"));
    }


    /*
    Verify no key
    1.Send a get request to /characters.
    Request includes :
    •Header Accept with value application/json
    2.Verify status code 409, content type application/json; charset=utf-8
    3.Verify response status line include message Conflict
    4.Verify that response body says"error":"MustpassAPIkeyforrequest"
     */
    @Test
    public void verify_no_Key(){
        given().accept(ContentType.JSON).get("/characters")
                .then().assertThat().statusCode(409).contentType("application/json; charset=utf-8")
                .statusLine(containsString("Conflict"))
                .body("error", is("Must pass API key for request"));
    }


    /*
    Verify number of characters
    1.Send a get request to /characters.
     Request includes :
     •Header Accept with value application/json
     •Query param key with value {{apiKey}}
     2.Verify status code 200, content type application/json; charset=utf-8
     3.Verify response contains 194 characters
     */
    @Test
    public void verify_Number_of_characters( ){

      given().accept(ContentType.JSON).
                when().queryParam("key", "$2a$10$cKpTYy0TaiByxOxcjQw3eeAYAOz.wbsJWo9.XYtvXBie2dwp4WV7S").
                get("/characters").prettyPeek()
                .then().assertThat().statusCode(200)
                .contentType("application/json; charset=utf-8")
                .body("response.characters", hasSize(194));

    }


}
