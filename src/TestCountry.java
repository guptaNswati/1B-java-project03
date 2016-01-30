/**
 *  Tests the Country class by creating multiple objects.
 *  Creates one object of type CSVReader class, which reads input from a CSV file. Uses
 *  the attributes stored in CSVReader object to create objects of type Country class.
 *
 * @author Foothill College, [Swati Gupta]
 *
 * 
 */
public class TestCountry 
{

    /**
     * Includes test examples for class Country.
     */
    public static void main(String[] args) 
    {

        final String FILENAME = "resources/cellular.csv";	// Directory path for Mac OS X
      
        //final String FILENAME = "resources\\cellular.csv";    // Directory path for Windows OS (i.e. Operating System)
        //final int NUM_COUNTRIES_TO_TEST = 3;            // Note: Include test cases in addition to 3

        // Parse the CSV data file

        CSVReader parser = new CSVReader(FILENAME);

        String [] countryNames = parser.getCountryNames();
        int [] yearLabels = parser.getYearLabels();
        double [][] parsedTable = parser.getParsedTable();		

        // Create and set objects of type Country 

        Country [] countries;
        
      //countries = new Country[NUM_COUNTRIES_TO_TEST];   // Note: Use this for initial testing of your implementation.

        countries = new Country[countryNames.length];				 

        Country current;

        for (int countryIndex = 0; countryIndex < countries.length; countryIndex++)
        {
            int numberOfYears = yearLabels.length;   // OR numberOfYears = dataTable[countryIndex].length;

            current = new Country(countryNames[countryIndex], numberOfYears);

            for (int yearIndex = 0; yearIndex < numberOfYears; yearIndex++)
            {
                double [] allSubscriptions = parsedTable[countryIndex];
                double countryData = allSubscriptions[yearIndex];
                current.addSubscriptionYear(yearLabels[yearIndex], countryData);

            }
            countries[countryIndex] = current;

        }
        
        // Test cases for Country.toString()

        System.out.println(countries[5].toString());
        
        System.out.println(countries[101].toString());
        
        System.out.println(countries[18].toString());

        // Test cases

        double totalSubscriptions = countries[1].getNumSubscriptionsForPeriod(1958, 2012);
        System.out.printf(countryNames[1] + " (1958 to 2012): %.2f \n \n", totalSubscriptions);

        totalSubscriptions = countries[10].getNumSubscriptionsForPeriod(1960, 2013);
        System.out.printf(countryNames[10] + " (1960 to 2013): %.2f \n \n", totalSubscriptions);


        totalSubscriptions = countries[29].getNumSubscriptionsForPeriod(1960, 2012);
        System.out.printf(countryNames[29] + " (1960 to 2012): %.2f \n \n", totalSubscriptions);

        totalSubscriptions = countries[113].getNumSubscriptionsForPeriod(1980, 2000);
        System.out.printf(countryNames[113] + " (1980 to 2000): %.2f \n \n", totalSubscriptions);


        // given cases

        totalSubscriptions = countries[0].getNumSubscriptionsForPeriod(1960, 2012);
        System.out.printf(countryNames[0] + " (1960 to 2012): %.2f \n \n", totalSubscriptions);
        // the output is:
        // Aruba (1960 to 2012): 1170.50


        totalSubscriptions = countries[100].getNumSubscriptionsForPeriod(1960,2012);
        System.out.printf(countryNames[100] + " (1960 to 2012): %.2f \n \n", totalSubscriptions);
        // the output is:
        // Hungary (1960 to 2012): 1246.58


        totalSubscriptions = countries[200].getNumSubscriptionsForPeriod(1960,2012);
        System.out.printf(countryNames[200] + " (1960 to 2012): %.2f \n \n", totalSubscriptions);
        // the output is:
        // Singapore (1960 to 2012): 1582.80

    }
}
