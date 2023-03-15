package cwiczenia.TabliceJednowymiarowe.Ćwiczenie1;

public class OneDimensionalArray {

    public static void main(String[] args) {

        ArrayUtils arrayUtils = new ArrayUtils();

        int[] firstArray = {6, 7, 8};
        int[] secondArray = {1, 2, 3};

        int sum = firstArray[0] + firstArray[1] + firstArray[2] +
                secondArray[0] + secondArray[1] + secondArray[2];

        System.out.println("pierwszy wynik:");
        System.out.println(sum);

        System.out.println("wynik z metody:");
        System.out.println(arrayUtils.sumOfTwoArrays(firstArray,secondArray));

    }
}
