import java.util.*;

public class Exercise4 {
    Collection<Student> students = Arrays.asList(
            new Student ("Дмитрий", 17, Gender.MAN),
            new Student ("Максим", 17, Gender.MAN),
            new Student ("Екатерина", 17, Gender.WOMAN),
            new Student ("Михаил", 28, Gender.MAN)
    );
    private enum Gender {
        MAN,
        WOMAN
    }

    private static class Student {
        private final String name;
        private final Integer age;
        private final Gender gender;

        public Student(String name, Integer age, Gender gender) {
            this.name = name;
            this.age = age;
            this.gender = gender;
        }

        public String getName() {
            return name;
        }

        public Integer getAge() {
            return age;
        }

        public Gender getGender() {
            return gender;
        }

        public String toString() {
            return "{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", gender=" + gender +
                    "}";
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Student)) return false;
            Student student = (Student) o;
            return Objects.equals(name, student.name) &&
                    Objects.equals(age, student.age) &&
                    gender == student.gender;
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age, gender);
        }
    }


    public double getAverageAgeOfMaleStudents() {
        double sumAge = 0;
        int countMaleStudents = 0;
        for (Student student : students) {
            if (student.getGender() == Gender.MAN) {
                sumAge += student.getAge();
                countMaleStudents++;
            }
        }
        if (countMaleStudents == 0) return 0;
        return sumAge / countMaleStudents;
    }


    public List<Student> getStudentsEligibleForConscription() {
        List<Student> conscriptionCandidates = new ArrayList<>();
        for (Student student : students) {
            if (student.getGender() == Gender.MAN && student.getAge() >= 18 && student.getAge() <= 27) {
                conscriptionCandidates.add(student);
            }
        }
        return conscriptionCandidates;
    }

    public static void main(String[] args) {
        Exercise4 task = new Exercise4();

        // Операция 1: Средний возраст студентов мужского пола
        double averageAgeOfMaleStudents = task.getAverageAgeOfMaleStudents();
        System.out.println("Средний возраст студентов мужского пола: " + averageAgeOfMaleStudents);

        // Операция 2: Студенты мужского пола, которым грозит призыв
        List<Student> conscriptionCandidates = task.getStudentsEligibleForConscription();
        System.out.println("Студенты мужского пола, которым грозит призыв в этом году:");
        for (Student student : conscriptionCandidates) {
            System.out.println(student);
        }
    }
}
