public class BmiService {
    public double calculate(int mass, double height) {
        double heightSquared = height * height;
        double bmi = mass / heightSquared;
        return bmi;
    }
}
