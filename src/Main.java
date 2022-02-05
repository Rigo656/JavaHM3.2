public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double bmi = service.calculate(61, 1.67);
        System.out.format("Ваш индекс массы тела = " + "%.1f", bmi);
    }
}
