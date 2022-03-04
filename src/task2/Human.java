package task2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Human {
    public int age;
    public String firstName = "";
    public String lastName = "";
    public LocalDate birthDate;
    public int width;

    public Human() {
        this.age = (int)(Math.random() * 60 + 10);
        for (int i = 0; i < 5; i++) {
            this.firstName += (char)(Math.random() * 25 + 65);
            this.lastName += (char)(Math.random() * 25 + 65);
        }
        this.birthDate = LocalDate.of((int)(Math.random() * 50 + 1970), (int)(Math.random() * 11 + 1), (int)(Math.random() * 28 + 1));
        this.width = (int)(Math.random() * 60 + 30);
    }

    public int getAge() {
        return age;
    }

    public String getFirstName() {
        return firstName;
    }

    @Override
    public String toString() {
        return "Human{" +
                "age=" + age +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate=" + birthDate +
                ", width=" + width +
                '}';
    }

    public static void main(String[] args) {
        List<Human> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Human human = new Human();
            list.add(human);
        }
//        first task
        Stream<Human> stream = list.stream();
        System.out.println("Первое задание: сортировка по имени в обратном порядке.");
        stream.sorted(Comparator.comparing(Human::getFirstName, Comparator.reverseOrder())).forEach(System.out::println);
//        second task
        stream = list.stream();
        System.out.println("\nВторое задание: фильтрация по возрасту (больше 20).");
        stream.filter(human -> human.getAge() > 20).forEach(System.out::println);
//        third task
        stream = list.stream();
        System.out.println("\nТретье задание: вывод первых трех элементов списка.");
        stream.limit(3).forEach(System.out::println);
//        forth task
        stream = list.stream();
        System.out.println("\nЧетвертое задание: конкатенация имен в строку через пробел.");
        StringBuilder buf = new StringBuilder();
        stream.forEach(human -> buf.append(human.getFirstName()).append(" ").toString());
        System.out.println(buf);
        stream.close();
    }
}

