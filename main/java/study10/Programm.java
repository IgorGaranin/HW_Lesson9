package study10;

public class Programm {

    public static void main(String[] args) {

        String arithmeticOperation = "2 + 3 + 5 - 22 = -12";

        System.out.println(checkArithmeticOperation(arithmeticOperation));

    }

    public static String checkArithmeticOperation(String aritmeticOperation) {

        String strResult = "";

        String strNumbers = "0123456789";
        String strArithmeticOperations = "/*-+";

        String firstOperand = "";
        String secondOperand = "";
        String equalOperand = "";
        int result = 0;
        int resultCheck = 0;
        String operator = "";
        boolean checkEquals = false;
        boolean signResultCheck = false;

        for (int i = 0; i < aritmeticOperation.length(); i++){

            if ((strNumbers.indexOf(aritmeticOperation.charAt(i)) > -1) && !checkEquals) {

                if (operator == "") {
                    firstOperand = firstOperand + Character.toString(aritmeticOperation.charAt(i));
                } else {
                    secondOperand = secondOperand + Character.toString(aritmeticOperation.charAt(i));
                }

            } else if ((strArithmeticOperations.indexOf(aritmeticOperation.charAt(i)) > -1) && !checkEquals) {

                if (secondOperand.equals("")){
                    operator = Character.toString(aritmeticOperation.charAt(i));
                    continue;
                }

                if (operator.equals("+")) {
                    result = Integer.parseInt(firstOperand) + Integer.parseInt(secondOperand);
                } else if (operator.equals("-")) {
                    result = Integer.parseInt(firstOperand) - Integer.parseInt(secondOperand);
                } else if (operator.equals("/")) {
                    if (Integer.parseInt(secondOperand) != 0) {
                        result = Integer.parseInt(firstOperand) / Integer.parseInt(secondOperand);
                    } else
                        result = result + 0;
                } else if (operator.equals("*")) {
                    result = Integer.parseInt(firstOperand) * Integer.parseInt(secondOperand);
                } else {
                    continue;
                }

                firstOperand = Integer.toString(result);
                secondOperand = "";
                operator = Character.toString(aritmeticOperation.charAt(i));

            }else if ((Character.toString(aritmeticOperation.charAt(i)).equals("=")) && !checkEquals){

                if (operator.equals("+")) {
                    result = Integer.parseInt(firstOperand) + Integer.parseInt(secondOperand);
                } else if (operator.equals("-")) {
                    result = Integer.parseInt(firstOperand) - Integer.parseInt(secondOperand);
                } else if (operator.equals("/")) {
                    if (Integer.parseInt(secondOperand) != 0) {
                        result = Integer.parseInt(firstOperand) / Integer.parseInt(secondOperand);
                    } else
                        result = result + 0;
                } else if (operator.equals("*")) {
                    result = Integer.parseInt(firstOperand) * Integer.parseInt(secondOperand);
                } else {
                    continue;
                }

                checkEquals = true;
            } else if (checkEquals) {
                if (strNumbers.indexOf(aritmeticOperation.charAt(i)) > -1) {
                    equalOperand = equalOperand + Character.toString(aritmeticOperation.charAt(i));

                    if (Character.toString(aritmeticOperation.charAt(i-1)).equals("-")) {
                        equalOperand = "-" + equalOperand;
                    }

                }
            } else continue;
        }

        resultCheck = Integer.parseInt(equalOperand);

        if (result == resultCheck) {
            strResult = "Верно";
        } else{
            strResult = "Неверно";
        }

        return strResult;

    }
}
