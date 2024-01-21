public class Arrays {public static void main(String[] args) {
    int[] array1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
    arrayOne(array1);
    printArray(array1);


    int[] array2 = new int[100];
    arrayTwo(array2);
    printArray(array2);


    int[] array3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
    arrayThree(array3);
    printArray(array3);


    int array4Size = 4;
    int[][] arrayFour = arrayFour(array4Size);
    printMatrix(arrayFour);


}

    private static void arrayOne(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0){
                array[i] = 1;
            } else {
                array[i] = 0;
            }
        }
    }

    private static void arrayTwo(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
    }

    private static void arrayThree(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }
    }

    private static int[][] arrayFour(int size) {
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            matrix[i][i] = 1;
        }
        return matrix;
    }

    private static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
