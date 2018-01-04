									1. Register Student:

	First name | Last name | Date of birth | Degree    | marks | contact Number | emailId		   | Expected Output		   | Output
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
1.	Himanshu   | Pareek    | Sep, 25, 1997 | B.Tech.   | 80    | 9876543210     | himanshu@gmail.com   | "Registered successfully	   | "Registered Successfully"
2.	   -  	   |	-      |	-      |   -       |   -   |    -           |       -              | "Error registering"           | "Email address is not valid"
3.	   -  	   |	-      |	-      |   -       |   -   |    -           |    himanshu          | "Email not valid"             | "Email address is not valid"
4.	   -  	   |	-      |	-      |   -       |   -   |    -           | himanshu@gmail.com   | "Error registering"           | "Contact number is not valid"
5.	   -  	   |	-      |	-      |   -       |   -   | abcd           | himanshu@gmail.com   | "Contact number is not valid" | "Contact number is not valid"
6.	   -  	   |	-      |	-      |   -       |   -   | 1234           | himanshu@gmail.com   | "Contact number is not valid" | "Contact number is not valid"
7.	   -  	   |	-      |	-      |   -       |   -   | 1234569870     | himanshu@gmail.com   | "Choose date of birth"        | "Choose date of birth"
8.	   -  	   |	-      | Sep, 25, 1997 |   -       |   -   | 1234569870     | himanshu@gmail.com   | "Specify degree"		   | "Specify degree"
9.	   -  	   |	-      | Sep, 25, 1997 |Senior Sec.|   -   | 1234569870     | himanshu@gmail.com   | "Fill all the fields"         | "Fill all the fields"
10.	Himanshu   | Pareek    | Sep, 25, 1997 |Senior Sec.| 80    | 1234569870     | himanshu@gmail.com   | "Already registered"	   | "Email already registered"
11.	Aakash	   | Kumar     | Jan, 11, 1998 |M.Tech.    | 86    | 9609751494	    | aakash@yahoo.com     | "Registered successfully"     | "Registered successfully"

									2. Register Company

	Contact Number | Email address | Company name | Company Address | Company profile url 			| Expected Output	| Output
1   | 1234567890       | company1@yahoo.com | CompanyOne  | 44, Vasant Vihar  | https://www.companyone.in	| "Registered Successfylly" | "Registered Successfylly"
							  | Jaipur, Rajasthan |
							  | Pin : 303702      |
							  
2   |       -          |       -            |     -       |        -          |              -                  | "Email is not valid" | "Email is not valid"
3   |       -          | company1 |     -   |        -    |              -    |                                 | "Email is not valid" | "Email is not valid"
4   |       -          |       -            |     -       |        -          |              -                  | "Email is not valid" | "Email is not valid"
5   |       -          | company1@yahoo.com |     -       |        -          |              -                  | "Contact is not valid" | "Contact is not valid"
6   | 1478523690       | company1@yahoo.com |     -       |        -          |              -                  | "All fields are necessary" | "All fields are necessary"
7   | 1478523690       | company1@yahoo.com |CompanyOne   |Some Address       | https://www.urlOfCompany.com    | "All fields are necessary" | "All fields are necessary"	
8   | 1234567890       | company1@yahoo.com | CompanyOne  | Some Address      | https://www.urlOfCompany.in	| "Already registered" | "Already registered"
9   | 7896541230       | company2@yahoo.com | CompanyTwo  | Address           | https://www.myurl.com           | "Success"            | "Success"

									3. Login Student
	Username       | password  	    |   Expected     |     Output
1   | userEMS45654     | 9876543210         | "Success"      | "Success"
2   | userEMS45654     | 4569856324         | "Invalid"      | "Incorrect username or/and password"

									4. Login Company
	Username	   |	password  	|   Expected	 |     Output
1   | companyEMS100000     | 1234567890         | "Success"      | "Success"
2   | companyEMS100000     | 4569856324         | "Invalid"      | "Incorrect username or/and password"	  

									5. Set Password
	Password|	Repass  |      Expected Output	      |    Output							
1   | pass  	| pass  	| "Password set successful"   | "Successful"
2   |   -   	|   -   	| "Fill all the fields"       | "All fields are required"
3   | pass1 	| pass  	| "Password does not match"   | "Password does not match"

	
									6. Update Profile
	Degree|	Marks   |      Expected Output			|     Output
1   | B.Tech. | 80 	| "Success"        			| "Success"
2   | Other   | 80 	| "Specify Degree" 			| "Specify Degeree"
3   | B.Tech. | 100	| "Marks should be in range [0, 100] | "Marks must be in range [0, 100]
