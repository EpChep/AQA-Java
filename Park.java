public class Park {

    public class Attraction {
        private String name;
        private String workingHours;
        private double cost;


        public Attraction(String name, String workingHours, double cost) {
            this.name = name;
            this.workingHours = workingHours;
            this.cost = cost;
        }


        public void displayAttractionInfo() {
            System.out.println("Аттракцион: " + name);
            System.out.println("Время работы: " + workingHours);
            System.out.println("Стоимость: " + cost + " рублей");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Park park = new Park();


        Park.Attraction attraction1 = park.new Attraction("Колесо обозрения", "10:00 - 20:00", 200);
        Park.Attraction attraction2 = park.new Attraction("Летающий ковер", "12:00 - 18:00", 150);
        Park.Attraction attraction3 = park.new Attraction("Водный человек", "09:00 - 17:00", 180);


        attraction1.displayAttractionInfo();
        attraction2.displayAttractionInfo();
        attraction3.displayAttractionInfo();
    }
}


