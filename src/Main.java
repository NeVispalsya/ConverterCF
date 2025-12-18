public class Main {

    private static final double CONV_F_C = 32;

    public static void main(String[] args) {
        System.out.println("App for Celsius and Fahrenheit");
        double fah = 32;
        double celsius = convFToC(fah);
        System.out.println(
                "Result is " + celsius + " Celsius"
        );
    }

    private static double convFToC(double fah){
        return (fah-32) * 5 / 9;
    }
}