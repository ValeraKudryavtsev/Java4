package task3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws Exception {
        Set<String> hashSet = new HashSet<>();
        MySetList mySet = new MySetList();

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                hashSet.add("i" + i);
                mySet.add("i" + i);
            }
        });
        Thread thread2 = new Thread(() -> {
            for (int i = 1000; i < 2000; i++) {
                hashSet.add("i" + i);
                mySet.add("i" + i);
            }
        });

        thread1.start();
        thread2.start();
        Thread.sleep(5000);

        System.out.println("Set size: " + hashSet.size());
        System.out.println("MySet size: " + mySet.size());

//        ------------------------------------------------

        List<String> list = new ArrayList<>();
        MyList myList = new MyList();

        Thread thread3 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                list.add("i" + i);
                myList.add("i" + i);
            }
        });
        Thread thread4 = new Thread(() -> {
            for (int i = 1000; i < 2000; i++) {
                list.add("i" + i);
                myList.add("i" + i);
            }
        });

        thread3.start();
        thread4.start();
        Thread.sleep(5000);

        System.out.println("List size: " + list.size());
        System.out.println("MyList size: " + myList.size());
    }
}
