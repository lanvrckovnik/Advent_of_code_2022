import java.util.Scanner;

public class day10_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int X = 1;
        int index = 1;
        while (sc.hasNext()) {
            String command = sc.next();

            if (command.equals("noop")) {
                index += 1;

            } else {
                int num = Integer.parseInt(sc.next().strip());
                if ((index - 19) % 40 == 0) {
                    sum += X * (index + 1);
                }
                X += num;
                index += 2;
            }
            if ((index - 20) % 40 == 0) {
                sum += X * index;
            }
        }
        System.out.println(sum);
    }
}