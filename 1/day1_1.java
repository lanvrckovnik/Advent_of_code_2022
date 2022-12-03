import java.util.Scanner;

public class day1_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int t = 0;
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            if (s.isEmpty()) {
                max = max > t ? max : t;
                t = 0;
            } else {
                t += Integer.parseInt(s);
            }
        }
        System.out.println(max);
    }
}
