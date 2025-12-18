public class Main {

    private static final double CONV_F_C = 32;
    private static final double CONV_C_F = 1.8;


    public static void main(String[] args) {
        System.out.println("App for Celsius and Fahrenheit");
        double fah = 32;
        double cel= 37;
        double celsius = convFToC(fah);
        double fahrenheit = convCToF(cel);
        System.out.println(
                "Result is "
                        + fahrenheit
                        +"  Fahrenheit and "
                        + celsius + " Celsius"
        );
    }

    private static double convFToC(double fah){
        return (fah-CONV_F_C) * 5 / 9;
    }
    private static double convCToF(double cel){
        return (cel * CONV_C_F) + CONV_F_C;
    }
}