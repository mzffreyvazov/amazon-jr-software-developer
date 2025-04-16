// BMICalculator class is a utility class that's used to calculate the BMI value in both Imperial and Metric systems
public class BMICalculator {

    // Please declare 4 attributes/properties to represent weight in pounds, height in inches, weight in kilos and height in meters
    private double weightPounds;
    private double heightInches;
    private double weightKilos;
    private double heightMeters;


    // Please use this default no arguments constructor to initialize the 4 properties to some initial values
    public BMICalculator() {
        this.weightPounds = 0;
        this.heightInches = 0;
        this.weightKilos = 0;
        this.heightMeters = 0;

    }

    // Please implement the calculateBmiImperial() method to take in weight and height to calculate and return the BMI value in the Imperial system
    public double calculateBmiImperial(double weightPounds, double heightInches) {
        // Formula to calculate BMI in Imperial system: (weight in pounds / (height in inches * height in inches)) * 703
        this.weightPounds = weightPounds;
        this.heightInches = heightInches;
        return (weightPounds / (heightInches * heightInches)) * 703;

    }

    // Please implement the calculateBmiMetric() method to take in weight and height to calculate and return the BMI value in the Metric system
    public double calculateBmiMetric(double weightKilos, double heightMeters) {
        // Formula to calculate BMI in Metric system: weight in kilos / (height in meters * height in meters)
        this.weightKilos = weightKilos;
        this.heightMeters = heightMeters;
        return weightKilos / (heightMeters * heightMeters);

    }

    // Please implement the getBMICategory() method so that it takes the BMI value and returns the BMI category based on it
    public String getBMICategory(double bmi) {

        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi < 25) {
            return "Normal weight";
        } else if (bmi >= 25 && bmi < 30) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }
}
