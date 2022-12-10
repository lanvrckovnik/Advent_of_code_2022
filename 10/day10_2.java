import java.util.Scanner;

public class day10_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = 1;
        int index = 1;
        while (sc.hasNext()) {
            String command = sc.next();

            if (command.equals("noop")) {
                if (Math.abs(index - X - 1) <= 1) {
                    System.out.print('#');
                } else {
                    System.out.print('.');
                }
                index++;

            } else {
                int num = Integer.parseInt(sc.next().strip());
                if (Math.abs(index - X - 1) <= 1) {
                    System.out.print('#');
                } else {
                    System.out.print('.');
                }
                index++;
                if ((index - 1) % 40 == 0) {
                    System.out.println();
                    index = 1;
                }
                if (Math.abs(index - X - 1) <= 1) {
                    System.out.print('#');
                } else {
                    System.out.print('.');
                }
                index++;
                X += num;
            }

            if ((index - 1) % 40 == 0) {
                System.out.println();
                index = 1;
            }
        }
    }
}