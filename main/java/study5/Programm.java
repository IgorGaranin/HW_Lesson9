package study5;

public class Programm {
    public static void main(String[] args) {

        int a = 3, b = 4, c = 5;

        System.out.println(isTreangle(a, b ,c));
    }

    public static Boolean isTreangle(int a, int b, int c){

        boolean result = false;

        if ((a < b + c) && (b < c + a) && (c < b + a)) {
            result = true;
        }

        return result;
    }

}
