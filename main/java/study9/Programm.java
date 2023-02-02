package study9;

public class Programm {

    public static void main(String[] args) {

        double height = 1.75, weight = 75;

        System.out.println(calculationIMT(weight, height));

    }

    public static String calculationIMT(double weight, double height) {

        String result = "";

        double imt = weight / (height * height);

        if (imt <= 18.5) {
            result = "\"Недостаток веса\" (имт <= 18,5)";
        } else if (imt <= 25.0) {
            result = "\"Норма\" (имт <= 25.0)";
        } else if (imt <= 30.0) {
            result = "\"Избыток веса\" (имт <= 30.0)";
        } else {
            result = "\"Ожирение\" (имт > 30)";
        }

        return result;

    }
}
