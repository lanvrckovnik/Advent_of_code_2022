import java.util.Scanner;

public class day4_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            int a1 = Integer.parseInt(s.split(",")[0].split("-")[0]);
            int a2 = Integer.parseInt(s.split(",")[0].split("-")[1]);

            int b1 = Integer.parseInt(s.split(",")[1].split("-")[0]);
            int b2 = Integer.parseInt(s.split(",")[1].split("-")[1]);

            if ((a1 <= b1 && a2 >= b2) || (a1 >= b1 && a2 <= b2)) {
                sum++;
            }
        }
        System.out.println(sum);
    }
}
