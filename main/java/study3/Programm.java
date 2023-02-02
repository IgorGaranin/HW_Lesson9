package study3;

import java.util.Arrays;

public class Programm {
    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 3, 4, 5};
        int[] subarr = new int[]{2, 2, 4};

        System.out.println(Arrays.toString(summTwoArrays(arr, subarr)));

    }

    private static int[] summTwoArrays(int[] arr, int[] subarr) {

        int lenght1 = arr.length;
        int lenght2 = subarr.length;
        int lenght3 = lenght1 + lenght2;

        int [] resultArr = new int[lenght3];

        int j = 0;

        for (int i = 0; i < lenght1; i++){
            j = i;
            resultArr[j] = arr[i];
        }

        for(int i = 0; i < lenght2; i++){
            j++;
            resultArr[j] = subarr[i];
        }

        return resultArr;
    }
}
