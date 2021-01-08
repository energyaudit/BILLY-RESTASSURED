# API-Testing-REST-Assured-Framework
# Steps to Import the project in eclipse and execute test suite 

**Technology Used:**
1. RestAssured Java API
2. TestNG Framework 
3. Report and logger for generating reports and logs.


**Steps to import project**
- Download repo from [https://github.com/hemantc09/API-Testing-REST-Assured-Framework] [FoxApiTestingTest.zip]  unzip it
- Go to Eclipse > File > Import > Existing Projects into Workspace
- Click on Next 
- Click on Browse
- Select the Folder “FoxApiTestingTest”
- Click on Open
- Click Finish



**Note:**
Once you have same folder structure imported wait for a while until maven download all the dependencies. 

**Now you all set to run the project.**

### It has following this implemented. 
1. Register Test Case Class
2. Login Test Case Class
3. Reset Test Case Class

Each Test Class has multiple test cases created . Also I have added comments in each class.


**1. Steps to Run the Test suite using Maven**

------------


- Right click on pom.xml file in the project directory level
- Select Run As > 6.Maven Test
-or double click the test in maven in intellij

*Note: Now your test suit is running. It will log all the success or errors on the eclipse console*

**Steps to see the results using report.html**

Go to Report Directory
Right click foxReport.html > Open With WebBrowser
This will open the report in WebBrowser and it will show the entire test suite report

**2. Steps to Run the Test suite using TestNG**

------------



- Right click on tsetng.xml file in the project directory level
Select Run As >  TestNG Suite

*Note: Now your test suit is running. It will log all the success or errors on the eclipse console*


**Steps to see the results using report.html**

- Go to test-output Directory
- Right click index.html > Open With WebBrowser
- This will open the index.html in WebBrowser and it will show the entire test suite report



**Note:**
- Entire test suite is verified and work as expected with no errors. 
- you might see authentication key error or email id errors. make sure to update those






