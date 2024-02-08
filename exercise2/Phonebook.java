import java.util.*;

public class Phonebook {
    private Map<String, List<String>> directory;

    public Phonebook() {
        directory = new HashMap<>();
    }

    public void add(String lastName, String phoneNumber) {
        if (!directory.containsKey(lastName)) {
            directory.put(lastName, new ArrayList<>());
        }
        directory.get(lastName).add(phoneNumber);
    }

    public List<String> get(String lastName) {
        return directory.getOrDefault(lastName, new ArrayList<>());
    }

    public static void main(String[] args) {
        Phonebook phoneDirectory = new Phonebook();


        phoneDirectory.add("Иванов", "+7 999-999-99-99");
        phoneDirectory.add("Смирнов", "+7 999-999-99-88");
        phoneDirectory.add("Степаненко", "+7 999-999-99-11");
        phoneDirectory.add("Литвин", "+7 999-999-99-22");
        phoneDirectory.add("Володин", "+7 999-999-99-00");
        phoneDirectory.add("Литвин", "+7 999-999-22-22");
        phoneDirectory.add("Иванов", "+7 999-999-99-55");


        Scanner sc = new Scanner(System.in);
        System.out.println("Введите фамилию для поиска номера(ов) телефона:  ");
        String a = sc.nextLine();
        List<String> numbers = phoneDirectory.get(a);
        if (!numbers.isEmpty()) {
            System.out.println("Номера телефонов для фамилии " + a + ":");
            for (String phoneNumber : numbers) {
                System.out.println(phoneNumber);
            }
        } else {
            System.out.println("Номера телефонов для указанной фамилии не найдены.");
        }
    }

}
