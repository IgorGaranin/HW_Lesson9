package study8;

public class Programm {

    public static void main(String[] args) {

        String strName = "Mrs. John";

        System.out.println(gender(strName));

    }

    public static String gender(String strName){
        String result = "";

         if (strName.contains("Mr.")) {
            result = "This is male";
        }else if (strName.contains("Mrs.")) {
            result = "This is female";
        } else {
             result = "unknown gender";
         }

        return result;
    }
}
