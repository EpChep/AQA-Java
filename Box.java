import java.util.ArrayList;

public class Box<T extends Fruit> {
    private ArrayList<T> fruits = new ArrayList<>();

    public void addFruit(T fruit) {
        fruits.add(fruit);
    }

    public float getWeight() {
        if (fruits.isEmpty()) return 0;
        float weight = 0;
        for (T fruit : fruits) {
            weight += fruit.getWeight();
        }
        return weight;
    }

    public boolean compare(Box<?> anotherBox) {
        return Math.abs(this.getWeight() - anotherBox.getWeight()) < 0.0001;
    }

    public void transferFruitsToAnotherBox(Box<T> anotherBox) {
        if (this == anotherBox) return; // Нельзя пересыпать фрукты в ту же самую коробку
        if (!fruits.isEmpty() && fruits.get(0).getClass() == anotherBox.fruits.get(0).getClass()) {
            anotherBox.fruits.addAll(this.fruits);
            fruits.clear();
        } else {
            System.out.println("Невозможно пересыпать фрукты, типы коробок не совпадают или текущая коробка пуста");
        }
    }
}
