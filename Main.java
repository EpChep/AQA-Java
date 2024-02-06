public class Main {
    public static void main(String[] args){
        String[][] array = {
                {"42", "5", "3", "4"},
                {"5", "35", "537", "8"},
                {"9", "130", "131", "ad"},
                {"1335", "14", "135", "453"}
        };
        try {
            int sum = calculateSum(array);
            System.out.println("Сумма элементов массива: " + sum);
        } catch (MyArraySizeException e) {
            System.out.println("Ошибка размера массива: " + e.getMessage());
        } catch (MyArrayDataException e) {
            System.out.println("Ошибка данных в ячейке: " + e.getMessage());
        }
    }

    public static int calculateSum(String[][] array) throws MyArraySizeException, MyArrayDataException {
        if (array.length != 4 || array[0].length != 4) {
            throw new MyArraySizeException("Размер массива должен быть 4x4");
        }

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("[" + i + "][" + j + "] содержит неверные данные: " + array[i][j]);
                }
            }
        }

        return sum;
    }
}

class MyArraySizeException extends Exception {
    public MyArraySizeException(String message) {
        super(message);
    }
}

class MyArrayDataException extends Exception {
    public MyArrayDataException(String message) {
        super(message);
    }
}

