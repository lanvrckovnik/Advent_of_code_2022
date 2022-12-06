import java.util.Scanner;

public class day4_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            int a1 = Integer.parseInt(s.split(",")[0].split("-")[0]);
            int a2 = Integer.parseInt(s.split(",")[0].split("-")[1]);

            int b1 = Integer.parseInt(s.split(",")[1].split("-")[0]);
            int b2 = Integer.parseInt(s.split(",")[1].split("-")[1]);

            int[] a = new int[a2 - a1 + 1];
            int[] b = new int[b2 - b1 + 1];

            for (int i = a1; i <= a2; i++) {
                a[i - a1] = i;
            }
            for (int i = b1; i <= b2; i++) {
                b[i - b1] = i;
            }
            boolean flag = false;
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < b.length; j++) {
                    if (a[i] == b[j] && !flag) {
                        sum++;
                        flag = true;
                    }
                }
            }
        }
        System.out.println(sum);
    }
}
