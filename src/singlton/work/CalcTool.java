package singlton.work;

public class CalcTool {
    public static int totalBMICalculated = 0;
    public static int numberOfCalculations = 0;
    enum MeasurementSystem {METRIC, ENGLISH}

    public static double calcBMI(double height, double weight, MeasurementSystem measurementSystem) {
        double bmi = weight / Math.pow(height,2);
        if (measurementSystem == MeasurementSystem.ENGLISH) {
            bmi *= 703;
        }
        totalBMICalculated += bmi;
        numberOfCalculations++;

        return bmi;
    }

    public static double averageBMI() {
        return totalBMICalculated / numberOfCalculations;
    }

}
