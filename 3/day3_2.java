import java.util.Scanner;

public class day3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        String temp = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char[] order = temp.toCharArray();
        while (sc.hasNext()) {
            String s1 = sc.next();
            String s2 = sc.next();
            String s3 = sc.next();
            // String sub1 = s.substring(0, s.length() / 2);
            // String sub2 = s.substring(s.length() / 2, s.length());
            char same = ' ';

            for (Character a : s1.toCharArray()) {
                for (Character b : s2.toCharArray()) {
                    for (Character c : s3.toCharArray()) {
                        if (a == b && b == c) {
                            same = a;
                            break;
                        }
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
