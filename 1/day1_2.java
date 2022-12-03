import java.util.Scanner;

public class day1_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] max = { 0, 0, 0 };
        int t = 0;
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            if (s.isEmpty()) {
                if (t > max[0]) {
                    max[2] = max[1];
                    max[1] = max[0];
                    max[0] = t;
                } else if (t > max[1]) {
                    max[2] = max[1];
                    max[1] = t;
                } else if (t > max[2]) {
                    max[2] = t;
                }
                t = 0;
            } else {
                t += Integer.parseInt(s);
            }
        }
        System.out.println(max[0] + max[1] + max[2]);
    }
}
