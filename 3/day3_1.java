import java.lang.reflect.Array;
import java.util.Scanner;

public class day3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        String temp = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char[] order = temp.toCharArray();
        while (sc.hasNext()) {
            String s = sc.next();
            String sub1 = s.substring(0, s.length() / 2);
            String sub2 = s.substring(s.length() / 2, s.length());
            char same = ' ';

            for (Character a : sub1.toCharArray()) {
                for (Character b : sub2.toCharArray()) {
                    if (a == b) {
                        same = a;
                        break;
                    }
                }
            }
            for (int i = 0; i < order.length; i++) {
                if (same == order[i]) {
                    sum += i + 1;
                }
            }
        }
        System.out.println(sum);
    }
}
