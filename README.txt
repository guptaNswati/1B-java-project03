project folder:
project03_swatig/


Brief description of submitted files:

src/CSVReader.java
    - CSVReader Class with three private fields.
    - constructor that takes in filename, reads the cellular.csv file and sets its members data. 
    - getters for members.   


src/SubscriptionYear.java
    - SubscriptionYear Class having two private instance variables, year of type int & subscriptions of type double 
    - A constructor that takes in the year and number of subscriptions. 
    - Include getter() and setter() for instance variable year.
    - Include getter() and setter() for instance variable subscriptions.
    - Include toString() which returns the number of subscriptions. 
 

src/Country.java
    - CountryClass having three private instance variables, name of type String, subscriptions a one dimensional array of type SubscriptionYear & count of type int.
    - A constructor that takes in the country name and number of years.
    - Include getter() and setter() for instance variable name.
    - Include getter() and setter() for instance variable subscriptions. 
    - Includes addSubscriptionYear() that create a new SubscriptionYear object and save it in subscriptions array.
    - Includes getNumSubscriptionsForPeriod() returns total number of subscriptions for a specified period.
    - Includes toString() which overrides SubscriptionClass.toString() and returns a representation of the country with its data.
    

src/TestCountry.java
    - Includes main() for running the application.
    - Creates one object of type CSVReader class, which reads input from a CSV file. 
    - Uses the SubscriptionYearClass by creating multiple objects of SubscriptionYear in Country Class.
    - Tests the CountryClass by creating multiple Country objects, using the attributes stored in CSVReader object.
    - Includes printf() that prints the total number of subscriptions for a specified country in a specified period.
        

resources/cellular.csv
    - A CSV (Comma Separated Value) file containing cellular data of 252 countries from 1960-2012
    - Row contains the data of each country 
    - First Column contains the country name, followed by its data in a given year 
 
resources/cellular_short.csv 
    - A short CSV file containing cellular data of 3 countries from 1960-2012 
    - Row contains the data of each country 
    - First Column contains the country names, followed by its data in a given year
    
       
resources/RUN.txt
    - console output of CSVReader.java, SubscriptionYear.java, Country.java & TestCountry.java

README.txt
    - description of submitted files