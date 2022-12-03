import java.util.Scanner;

public class day2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // A rock 1 X
        // B paper 2 Y
        // C scissors 3 Z
        // DRAW 3, WIN 6

        int sum = 0;
        while (sc.hasNext()) {
            String a = sc.next();
            String b = sc.next();
            System.out.println(a + b);

            if (a.equals("A")) {
                if (b.equals("Z")) {
                    sum += 3;
                } else if (b.equals("Y")) {
                    sum += 6;
                    sum += 2;
                } else {
                    sum += 1;
                    sum += 3;
                }
            } else if (a.equals("B")) {
                if (b.equals("Z")) {
                    sum += 3;
                    sum += 6;
                } else if (b.equals("Y")) {
                    sum += 2;
                    sum += 3;
                } else {
                    sum += 1;
                }
            } else {
                if (b.equals("Z")) {
                    sum += 3;
                    sum += 3;
                } else if (b.equals("Y")) {
                    sum += 2;
                } else {
                    sum += 6;
                    sum += 1;
                }
            }
        }
        System.out.println(sum);
    }
}
