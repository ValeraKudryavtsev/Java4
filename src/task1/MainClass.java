package task1;

import java.util.Scanner;

public class MainClass implements Predicate {
    public static void main(String[] args) {
        Integer num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number: ");
        num = sc.nextInt();
        Predicate<Integer> predicate = x -> testFunc(x);
        System.out.println(predicate.test(num));
    }

    public static boolean testFunc(Integer num) {
        while (num != 1 && num % 2 == 0) {
            num /= 2;
        }
        if (num==1)
            return true;
        else
            return false;
    }

    @Override
    public boolean test(Integer value) {
        return false;
    }
}