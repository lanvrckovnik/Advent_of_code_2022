import java.util.Scanner;

public class day9_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int[][] T = new int[10][2];
        int[][] space = new int[1000][1000];
        space[500][500] = 1;
        while (sc.hasNext()) {
            String dir = sc.next();
            int dist = sc.nextInt();
            for (int i = 0; i < dist; i++) {
                switch (dir) {
                    case "R":
                        T[0][0]++;
                        break;
                    case "L":
                        T[0][0]--;
                        break;
                    case "U":
                        T[0][1]++;
                        break;
                    case "D":
                        T[0][1]--;
                        break;
                }

                for (int j = 1; j < 10; j++) {
                    if ((Math.pow(T[j - 1][0] - T[j][0], 2) + Math.pow(T[j - 1][1] - T[j][1], 2)) > 2) {
                        if (T[j - 1][0] - T[j][0] == 0) {
                            T[j][1] += (T[j - 1][1] - T[j][1]) / 2;
                        } else if (T[j - 1][1] - T[j][1] == 0) {
                            T[j][0] += (T[j - 1][0] - T[j][0]) / 2;
                        } else {
                            T[j][0] += Math.abs(T[j - 1][0] - T[j][0]) > 1 ? (T[j - 1][0] - T[j][0]) / 2
                                    : T[j - 1][0] - T[j][0];
                            T[j][1] += Math.abs(T[j - 1][1] - T[j][1]) > 1 ? (T[j - 1][1] - T[j][1]) / 2
                                    : T[j - 1][1] - T[j][1];
                        }
                    }
                }
                space[500 - T[9][0]][500 - T[9][1]] = 1;
            }
        }

        for (int[] is : space) {
            for (int is2 : is) {
                sum += is2;
            }
        }
        System.out.println(sum);
    }
}