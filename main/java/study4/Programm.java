package study4;

public class Programm {
    public static void main(String[] args) {

        String fio = "Иванов Петр Иванович";

        System.out.println(returnFormatName(fio));

    }

    private static String returnFormatName(String fio) {

        char[] names = fio.toCharArray();
        String result = "";

        int j = 0;

        for (int i = 0; i < names.length; i++) {
            j = i;

            if (names[i] != ' ') {
                result += names[i];
            } else break;

        }

        j++;
        result += " " +Character.toString(names[j]) + ".";

        for (int i = j; i < names.length; i++) {

            j = i;

            if (names[i] == ' ') {
                break;
            }


        }

        j++;
        result += Character.toString(names[j]) + ".";

        return result;
    }
}