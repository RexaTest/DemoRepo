/*********************************************************************************
 * Name: Aseer Saabiq
 * Course: CS170-0X
 * Lab #: Lab 1 
 * Submission Date: 10:00 pm, Wed (9/21) 
 * Brief Description: Driver class to run KilogramPoundConverter,
 * create its object and call its methods
 * 
 *********************************************************************************/
public class WeightConverterApp {

	public static void main(String[] args) {
		// create object of class
		KilogramPoundConverter obj = new KilogramPoundConverter();
		// initialize weight in kg
		double weightInKg = 52;
		// convert kg weight to pound
		obj.convertKilogramToPound(weightInKg);
		// initialize weight in pound
		double weightInPound = 34;
		// convert pound weight to kg
		obj.convertPoundToKilogram(weightInPound);
	}
}
