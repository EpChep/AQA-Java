// Класс Animal (родительский класс)
class Animal {
    private static int totalNumAnimals = 0;
    String name;

    public Animal(String name) {
        this.name = name;
        totalNumAnimals++;
    }
    public void run(int obstacleLength) {
        int maxRunLength = maxRunLength();
        if (obstacleLength <= maxRunLength) {
            System.out.println(name + " пробежал " + obstacleLength + " м.");
        } else {
            System.out.println(name + " не может пробежать больше " + maxRunLength + " м.");
        }

    }

    public void swim(int obstacleLength) {
        int maxSwimmingLength = maxSwimmingLength();
        if (obstacleLength < maxSwimmingLength) {
            System.out.println(name + " проплыл " + obstacleLength + " м.");
        } else {
            System.out.println(name + " не умеет плавать");
        }

    }

    protected int maxRunLength() {
        return 0;
    }

    protected int maxSwimmingLength() {
        return 0;
    }

    public static int intTotalNumAnimals() {
        return totalNumAnimals;
    }
}

// Класс Dog (наследник от Animal)
class Dog extends Animal {
    private static int totalNumDogs = 0;
    public Dog(String name) {
        super(name);
        totalNumDogs++;

    }


    @Override
    protected int maxRunLength() {
        return 500;
    }

    @Override
    protected int maxSwimmingLength() {
        return 10;
    }

    public static int intTotalNumDogs() {
        return totalNumDogs;
    }
}

// Класс Cat (наследник от Animal)
class Cat extends Animal {
    private static int totalNumCat = 0;
    private int satiety;

    public Cat(String name) {
        super(name);
        totalNumCat++;
        satiety = 0;
    }


    @Override
    protected int maxRunLength() {
        return 200;
    }

    @Override
    protected int maxSwimmingLength() {
        return 0;
    }

    public boolean stillHungry() {
        return satiety < 100;
    }

    public void eat(Bowl bowl, int portion) {
        if (satiety < 100) {
            if (bowl.feed(this, portion)) {
                satiety += portion;
                System.out.println(this.name + " поел и его уровень сытости теперь " + satiety + "%.");
            } else {
                System.out.println(this.name + " не может поесть, в миске недостаточно еды для кормления. ");
            }
        } else {
            System.out.println(this.name + " не голоден, ему не нужна еда.");
        }
    }

    public static int intTotalNumCat() {
        return totalNumCat;
    }

    static class Bowl {
        private int foodInBowl;

        public Bowl(int initialFoodAmount) {
            this.foodInBowl = Math.max(0, initialFoodAmount);
        }

        public boolean feed(Cat cat, int portion) {
            if (foodInBowl >= portion) {
                System.out.println("Кот поел из миски.");
                foodInBowl -= portion;
                return true;
            } else {
                System.out.println("В миске недостаточно еды для кормления.");
                return false;
            }
        }

        public void addFood(int addFood) {
            if (addFood > 0) {
                System.out.println("Добавлено " + addFood + " еды в миску.");
                foodInBowl += addFood;
            } else {
                System.out.println("Нельзя добавить отрицательное количество еды.");
            }
        }

    }
}
public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Бобик");
        Dog dog2 = new Dog("Шарик");

        Cat[] cats = new Cat[]{
                new Cat("Мурзик"),
                new Cat("Барсик"),
                new Cat("Вася")
        };




        System.out.println("Общее количество животных: " + Animal.intTotalNumAnimals());
        System.out.println("Общее количество собак: " + Dog.intTotalNumDogs());
        System.out.println("Общее количество котов: " + Cat.intTotalNumCat());

        dog1.run(400); // пробегает максимум 500 м.
        dog2.swim(9);  // плывет максимум 10 м.

        cats[1].run(222);
        cats[2].swim(15);

        Cat.Bowl bowl = new Cat.Bowl(100); // Начальное кол-во еды в миске

        for (Cat cat : cats) {
            cat.eat(bowl, 50);
        }


        System.out.println("\nИнформация о сытости котов:");
        for (Cat cat : cats) {
            System.out.println(cat.name + ": " + (cat.stillHungry() ? "голоден" : "сыт"));
        }

        bowl.addFood(100); // добавим еду в миску

        System.out.println("\nПосле добавления еды в миску:");
        for (Cat cat :cats) {
            cat.eat(bowl, 30);
        }

        bowl.addFood(100);
        cats[2].eat(bowl,70);

        System.out.println("\nФинальная информация о сытости котов:");
        for (Cat cat : cats) {
            System.out.println(cat.name + ": " + (cat.stillHungry() ? "голоден" : "сыт"));
        }
    }


    }



