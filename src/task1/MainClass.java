package task1;

import java.util.Scanner;

public class MainClass implements Predicate {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number: ");
        num = sc.nextInt();
        Predicate<Integer> predicate = x -> testFunc(x);
        System.out.println(predicate.test(num));
    }

    public static boolean testFunc(int num) {
        while (num != 1 && num % 2 == 0) num /= 2;
        return num == 1;
    }

    @Override
    public boolean test(int value) {
        return false;
    }
}