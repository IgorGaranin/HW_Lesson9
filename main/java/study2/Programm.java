package study2;

public class Programm {
    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 3, 4, 5};
        int[] subarr = new int[]{3, 4, 5};

        System.out.println(checkForSubArray(arr, subarr));
    }

    private static String checkForSubArray(int[] arr, int[] subarr) {
        String result = "";

        int i = 0;
        int lengthSubarr = subarr.length;
        boolean isSubArr = false;

        for (int j = 0; j < arr.length; j++) {

            if ((i < subarr.length) && (subarr[i] == arr[j])) {
                i++;
                lengthSubarr--;
            } else {

                i = 0;

            }

            if (lengthSubarr==0) {
                isSubArr = true;
                break;
            }

            if (lengthSubarr - 1 < 0) {
                lengthSubarr = -1;
                break;
            }

        }

        if ((lengthSubarr == -1) || (isSubArr == false)) {
            result = "Не является подмассивом";
        } else if ((lengthSubarr == 0) && (isSubArr)){
            result = "Является подмассивом";
        }


        return result;
    }
}
