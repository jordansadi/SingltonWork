package singlton.work;

public enum EnumCalcTool {
    INSTANCE;

    private EnumCalcTool() {}

    public static int totalBMICalculated = 0;
    public static int numberOfCalculations = 0;
    enum MeasurementSystem {METRIC, ENGLISH}

    public double calcBMI(double height, double weight, EnumCalcTool.MeasurementSystem measurementSystem) {
        double bmi = weight / Math.pow(height, 2);
        if (measurementSystem == EnumCalcTool.MeasurementSystem.ENGLISH) {
            bmi *= 703;
        }
        totalBMICalculated += bmi;
        numberOfCalculations++;

        return bmi;
    }

    public double averageBMI() {
        return totalBMICalculated / numberOfCalculations;
    }
}
