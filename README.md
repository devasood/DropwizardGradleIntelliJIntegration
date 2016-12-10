Run with command line
-------------------------------------------
Go to the project home and run -
> gradle run

Run on IntelliJ
-------------------------------------------
Edit Run Configurations:

Add Defaults -> Application 
Add Main Class
Add Program arguments - 
> server /Path/to/abc.yml
Add Working Directory as the Project home.

Set the classpath of the module as the App_main option
Set JRE
Apply changes and exit run configurations

Run the Application 



![alt tag](https://github.com/devasood/DropwizardGradleIntelliJIntegration/blob/master/IntelliJ%20Config.png)



Server should run on localhost:8080/helloWorld

Admin port localhost:8941
