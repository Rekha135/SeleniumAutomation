**UI and API automation for https://www.sogeti.com**


**Setup Process:**
Download and install Java JDK and Apache Maven, and set up the home paths.
Download and install an IDE such as IntelliJ or Eclipse.
Clone and import the project and add pugins for Cucumber for Java, TestNG, and Gherkin.


**Execution:**
Update the project and run mvn clean install.
For execution, run the runner class (src/test/java/Runner/RunnerClass.java) by specifying the tags in the feature file (src/test/resources/Features).
Run as TestNG. Once execution is completed, the report will be generated in the target folder.

**observations: **
1) UI Testtest case 2, it is not possible to automate ticking the check box which pops up asking the user to verify if they are human by clicking on images of it’s specification.
The workaround solution for this is:
2) API test case 2: For the country ‘ca’ and the postal code B2B, the response code is ‘404’ which is page not found while it should actually be ‘200’ as per the requirement.
3) For both the API test cases , the response time must be 1 second as per requirement whereas it is more than 1 second but lesser than 2 seconds.

