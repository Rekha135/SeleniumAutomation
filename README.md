**UI and API automation for https://www.sogeti.com**


**Setup Process:**
1) Download and install Java JDK and Apache Maven, and set up the home paths.
2) Download and install an IDE such as IntelliJ or Eclipse.
3) Clone and import the project and add pugins for Cucumber for Java, TestNG, and Gherkin.


**Execution:**
1) Update the project and run mvn clean install.
2) For execution, run the runner class (src/test/java/Runner/RunnerClass.java) by specifying the tags in the feature file (src/test/resources/Features).
3) Run as TestNG. Once execution is completed, the report will be generated in the target folder.

**Observations:**
1) UI test case 2 - Contact Us form submission cannot be automated due to Google CAPTCHA, which is explicitly designed to prevent automation and distinguish between human users and automated bots. It is good practice not to automate CAPTCHA in production.
The workaround solution for this is: Disable the CAPTCHA in the test environment for testing.
2) API Test Case 2: For the country 'ca' and the postal code 'B2B', the response code is '404' (Page Not Found), while it should be '200' as per the requirement.
3) For both API test cases, the response time must be 1 second as per the requirement. However, the response time is more than 1 second but less than 2 seconds.

