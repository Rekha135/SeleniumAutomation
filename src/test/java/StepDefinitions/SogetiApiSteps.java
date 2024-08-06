package StepDefinitions;

import Utils.ExcelUtils;
import io.cucumber.java.en.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;

import java.io.IOException;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class SogetiApiSteps {
    private Response response;
    private String country;
    private String postalCode;
    private String placeName;

    @Given("I send a GET request to the Zippopotam API")
    public void iSendAGETRequestToTheZippopotamAPI() {
        RestAssured.baseURI = "http://api.zippopotam.us";
        response = given().when().get("/de/bw/stuttgart");
    }

    @And("verify response country is {string} and state {string}")
    public void verifyResponseCountryIsAndState(String expectedCountry, String expectedState) {
        String actualCountry = response.jsonPath().getString("country");
        Assert.assertEquals(actualCountry,expectedCountry);

        String actualState = response.jsonPath().getString("state");
        Assert.assertEquals(actualState,expectedState);
    }

    @Then("verify response for {string} and place name has {string}")
    public void verifyResponsePostCodeIsAndPlaceNameHas(String postCode, String expectedPlace) {
        String actualPlace = response.jsonPath().getString("places.find { it.'post code' == '" + postCode + "' }.'place name'");
        Assert.assertEquals(actualPlace,expectedPlace);
    }

    @And("the response status code should be 200, content type in JSON and  response time lessthan 1sec")
    public void the_response_status_code_should_be_200() {
        response.then().statusCode(200);
        response.then().contentType("application/json");
        //response.then().time(lessThan(1000L));
    }

    @Given("I have test data from Excel sheet {string} row {int}")
    public void iHaveTestDataFromExcelSheetRow(String sheetName, int rowNumber) throws IOException {
        String filePath = "src/test/java/Data/TestData.xlsx";
        Object[] rowData = ExcelUtils.readRowData(filePath, sheetName, rowNumber);

        this.country = (String) rowData[0];
        this.postalCode = (String) rowData[1];
        this.placeName = (String) rowData[2];
    }

    @When("I send a API request")
    public void APIRequestIsSent() {
        String endpoint = String.format("http://api.zippopotam.us/%s/%s", country, postalCode);
        System.out.println("Endpoint: " + endpoint);
        RestAssured.baseURI = "http://api.zippopotam.us";
        response = RestAssured.given().when().get(endpoint);

        System.out.println("Response Status Code: " + response.getStatusCode());
        System.out.println("Response Body: " + response.getBody().asString());
    }

    @Then("Verify in Response Place Name for given Country and Postal Code")
    public void verifyInResponsePlaceNameForGivenCountryAndPostalCode() {
        String actualPlaceName = response.jsonPath().getString("places[0].'place name'");
        Assert.assertEquals(actualPlaceName,placeName);
    }
}
