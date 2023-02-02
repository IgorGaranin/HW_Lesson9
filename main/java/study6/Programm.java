package study6;

public class Programm {
    public static void main(String[] args) {

        int numberToSearch = 4;
        int[] arrForSearch = new int[] {1, 2, 3, 4, 5};

        System.out.println(searchNumberInArr(numberToSearch, arrForSearch));

    }

    public static int searchNumberInArr(int numberToSearch, int[] arrForSearch){

        int result = -1;

        for (int i = 0; i < arrForSearch.length; i++) {
            if (numberToSearch == arrForSearch[i]){
                result = i;
                break;
            }
        }


        return result;
    }

}
