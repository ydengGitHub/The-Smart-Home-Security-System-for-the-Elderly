# The-Smart-Home-Security-System-for-the-Elderly
Designed and implemented a Smart Home Security system to help the older adults to handle different kinds of security issues automatically and efficiently without extra cost (no monthly fee). The goal of the project is to help the elderly lives safely and securely in their own house for as long as possible. 

Environments requirement:
	1. Windows 7 or higher 
	2. Java SE 1.7 or higher
	3. Eclipse (optional)
	4. Android phone: Android 4.0 or higher
	5. IP camera: Hootoo H210
	6. Internet connection 
	7. Skype and SkypID
	8. Skype balance (optional)

Steps to set up application:
	PC side:
	1. Connect PC to Internet, connect IP camera to Internet, log in skype using your skype ID and password.
	2. Open eclipse, import our project
	3. Add jars included in the package
	4. Choose the file ProMain.java to run the application

	APP side:
	1. install the apk file on Android phone/tablet
	2. Connects the phone/tablet to internet
	3. Run the app on your phone/tablet and Copy the token shown on the screen
4. Add the following line to com.hmkcode package/App.java file/ createContent() method: 
c.addRegId("your token");


You may need to modify:
	1. admin password of webcam in the code 
	2. URL in code to open webcam (vision control) and URL to change password
	3. you may also need to change the parameters in the URL to change password, different webcam has different format and parameters:
		"String changePwd" in homeSecurityMain.java and String changePwdBack in changePwd.java.

How to use application
	After running the PorMain.java, you will see the main window of our project, to use it:
	1. in "System Configuration", configure your contacts and delay time of each alarm. The contact could be phone numbers or skype ID.
	   If you use phone numbers, your skype account used to make calls should have credit.
	2. Record your greeting messages buy press "Record Sound" button.
	3. Record your alarm sounds in this window (this part is hard coded).
	3. Press "Run Program", then the system will keep monitoring the alarms in the background.

	4. In case of alarms, a window will popup in PC and Phone/tablet to inform you which kind of alarm is detected and you can cancel it before the counter counts to 0.

Warning: you must check your home first and if there is nothing abnormal you can cancel the alarm. 
	
	5. You can also cancel the alarm in your Android phone (currently not working).
 	6. If you do not turn off your alarm within the given time, the system will call your contacts using Skype.
       
	

Hardware requirement: 
	1. monoxide alarm
	2. smoke alarm
	3. window alarm
	4. PAN/TILT IP Camera, can be accessed using HTTP protocol
  	5. wireless router (optional)
	6. computer running windows OS with microphone and speaker


External resource links:
	skype API
