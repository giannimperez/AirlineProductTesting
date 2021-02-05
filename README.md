# Airline Testing Program

## Getting Started

- Prerequisite Installations:
	 - [ ] IntelliJ IDEA Ultimate
	 - [ ] SDK 11
	 - [ ] MySQL (use password for password)
 
 - Once the prerequisite installations have been met, use the steps below to begin setup:
	 - [ ] Clone the project from GitHub in IntelliJ
	 - [ ] Go to File->Project Structure->Modules->Dependencies
	 - [ ] At the bottom, click the "+" button and select JARs or Directories
	 - [ ] Add the 5 JAR files that I have pinned in the Discord channel
	 - [ ] Open the "Database" menu on the right side and select "Data Source Properties"
	 - [ ] Select "MySQL" from the list of options and download any missing drivers
   - [ ] At the top left, click the "+" and choose "MySQL"
   - [ ] Click "Test Connection" and enter "root" for username and "password" for password
   - [ ] Select "Apply" and then "OK"
   - [ ] Right click the MySQL data source just created and select "Jump to Query Console"
   - [ ] Open the "SQL" folder in the program directory on the left hand side and open the "airline.sql" file
   - [ ] Copy the contents inside that file and paste it into the query console
   - [ ] Run just the "CREATE DATABASE IF NOT EXISTS AIRLINE;"
   - [ ] A new schema should be in the data source named airline
   - [ ] Right click the airline schema just created and select "Jump to Query Console"
   - [ ] Paste the same SQL statements in this new console and run all commands
   - [ ] Verify that the tables and columns have correctly been made
