package ćwiczenia.TabliceWielowymiarowe;

public class TwoDimensionalArray {

    public static void main(String[] args) {

        double[][] twoDimensionalArray = new double[3][3];

        twoDimensionalArray[0][0] = 1.0;
        twoDimensionalArray[0][1] = 1.5;
        twoDimensionalArray[0][2] = 2.0;
        twoDimensionalArray[1][0] = 1.5;
        twoDimensionalArray[1][1] = 2.0;
        twoDimensionalArray[1][2] = 2.5;
        twoDimensionalArray[2][0] = 2.0;
        twoDimensionalArray[2][1] = 2.5;
        twoDimensionalArray[2][2] = 3.0;

        double sumaIloczynówPrzekątnychTablicy =
                (twoDimensionalArray[0][0] * twoDimensionalArray[1][1] * twoDimensionalArray[2][2]) +
                        (twoDimensionalArray[0][2]* twoDimensionalArray[1][1] * twoDimensionalArray[2][0]);


        double iloczynSumyŚrodkowegoWierszaIŚrodkowejKolumny =
                (twoDimensionalArray[1][0] + twoDimensionalArray[1][1] + twoDimensionalArray[1][2]) *
                        (twoDimensionalArray[0][1] + twoDimensionalArray[1][1] + twoDimensionalArray[2][1]);

        double sumaElementówPrzyKrawędziach = twoDimensionalArray[0][0] + twoDimensionalArray[0][1] +
                twoDimensionalArray[0][2] + twoDimensionalArray[1][0] + twoDimensionalArray[1][2] +
                twoDimensionalArray[2][0] + twoDimensionalArray[2][1] + twoDimensionalArray[2][2];

        System.out.println("Suma iloczynów przekątnych tablicy wynosi: " + sumaIloczynówPrzekątnychTablicy);
        System.out.println("Iloczyn sum środkowego wiersza i środkowej kolumny tablicy wynosi: " +
                iloczynSumyŚrodkowegoWierszaIŚrodkowejKolumny);
        System.out.println("suma wszystkich elementów znajdujących się przy krawędzi tablicy wynosi: " +
                sumaElementówPrzyKrawędziach);
    }
}
