import java.io.*;

public class AppData {
    private String[] header;
    private int[][] data;

    public AppData(String[] header, int[][] data) {
        this.header = header;
        this.data = data;
    }

    public void save(String filePath) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            // Записываем заголовок
            writer.write(String.join(";", header));
            writer.newLine();

            // Записываем данные
            for (int[] row : data) {
                writer.write(String.join(";", convertIntArrayToStringArray(row)));
                writer.newLine();
            }

            System.out.println("Данные успешно сохранены в файл: " + filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void load(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            // Считываем заголовок
            header = reader.readLine().split(";");

            // Считываем данные
            String line;
            int rowCount = 0;
            while ((line = reader.readLine()) != null) {
                String[] values = line.split(";");
                data[rowCount] = convertStringArrayToIntArray(values);
                rowCount++;
            }

            System.out.println("Данные успешно загружены из файла: " + filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Вспомогательный метод для преобразования int[] в String[]
    private String[] convertIntArrayToStringArray(int[] array) {
        String[] result = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = String.valueOf(array[i]);
        }
        return result;
    }

    // Вспомогательный метод для преобразования String[] в int[]
    private int[] convertStringArrayToIntArray(String[] array) {
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = Integer.parseInt(array[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        // Пример использования
        String[] header = {"Name", "Age", "Salary"};
        int[][] data = {
                {1, 25, 50000},
                {2, 30, 60000},
                {3, 35, 70000}
        };

        AppData appData = new AppData(header, data);

        // Сохранение данных в CSV файл
        appData.save("data.csv");

        // Загрузка данных из CSV файла
        appData.load("data.csv");
    }
}
