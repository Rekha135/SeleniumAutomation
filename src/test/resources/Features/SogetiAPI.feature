Feature: Sogeti API

  @testcase1 @test
  Scenario: Verify Zippopotam API for Germany
    Given I send a GET request to the Zippopotam API
    When the response status code should be 200, content type in JSON and  response time lessthan 1sec
    And verify response country is "Germany" and state "Baden-Württemberg"
    Then verify response for "70597" and place name has "Stuttgart Degerloch"

  @testcase2  @test
  Scenario Outline: Validate API responses from Excel data
    Given I have test data from Excel sheet "<sheetName>" row <rowNumber>
    When I send a API request
    And the response status code should be 200, content type in JSON and  response time lessthan 1sec
    Then Verify in Response Place Name for given Country and Postal Code
    Examples:
      | sheetName | rowNumber |
      | Data      | 1         |
      | Data      | 2         |
      | Data      | 3         |

