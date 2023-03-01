import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();

    }
    private static Map<String, String> map (User [] users) {
        Map<String, String> map = new HashMap<>();
        for (User user : users) {
            map.put(user.getPhoneNumber(), user.getName());
        }
        return map;
    }

    private static void task2() {
        System.out.println();
        System.out.println("Задание №2");
        User user1 = new User("Филипп Киркоров", 60, "89999999990");
        User user2 = new User("Николай Басков", 66, "89999999991");
        User user3 = new User("Олег Газманов", 18, "89999999992");
        User user4 = new User("Алла Борисовна", 60, "89999999993");
        User user5 = new User("Максим Галкин", 55, "89999999994");

        User[] users = new User[] {user1, user2, user3, user4, user5};
        System.out.println(Arrays.toString(users));
        System.out.println();
        System.out.println(map(users));

    }

    private static void task1() {
        System.out.println("Задание №1");
        System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextInt();
        long [] fibonachi = new long[(int) n];

        fibonachi [0] = 0;
        fibonachi [1] = 1;
        for (int i = 2; i < fibonachi.length; ++i) {
            fibonachi[i] = fibonachi [i-1] + fibonachi [i-2];
            System.out.println(fibonachi[i]);
        }
    }
}