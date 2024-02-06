public class Employee {
    private final String name;
    private final String position;
    private final String mail;
    private final String phone;
    private final int salary;
    private final int age;

    public Employee(String name, String position, String mail, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.mail = mail;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void printEmployeeInfo() {
        System.out.println("ФИО: " + name);
        System.out.println("Должность: " + position);
        System.out.println("email: " + mail);
        System.out.println("Телефон: " + phone);
        System.out.println("Зарплата: " + salary);
        System.out.println("Возвраст: " + age);
    }

    public static void main(String[] args) {
        Employee[] array = new Employee[5];
        array[0] = new Employee("Смирнов Петр Алексеевич", "Разработчик", "qwer@mail.ru", "88003002323", 140000, 22);
        array[1] = new Employee("Медведев Владимир Степанович", "Системный аналитик", "sold@mail.ru", "88003002323", 240000, 33);
        array[2] = new Employee("Иванов Иван Иванович", "Тимлид", "byrw@mail.ru", "88002341212", 440000, 26);
        array[3] = new Employee("Дуров Иван Андреевич", "Тестировщик", "ada@mail.ru", "88002221212", 240000, 25);
        array[4] = new Employee("Томас Андерсон", "Системный администратор", "cdc@mail.ru", "88003222444", 40000, 24);
        for (Employee employee : array) {
            employee.printEmployeeInfo();
        }
    }
}
