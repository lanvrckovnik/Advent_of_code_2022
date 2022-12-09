import java.util.Scanner;

public class day9_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int[] H = new int[2];
        int[] T = new int[2];
        int[][] space = new int[1000][1000];
        space[500][500] = 1;
        while (sc.hasNext()) {
            String dir = sc.next();
            int dist = sc.nextInt();
            for (int i = 0; i < dist; i++) {
                switch (dir) {
                    case "R":
                        H[0]++;
                        break;
                    case "L":
                        H[0]--;
                        break;
                    case "U":
                        H[1]++;
                        break;
                    case "D":
                        H[1]--;
                        break;
                }

                if ((Math.pow(H[0] - T[0], 2) + Math.pow(H[1] - T[1], 2)) > 2) {
                    if (H[0] - T[0] == 0) {
                        T[1] += (H[1] - T[1]) / 2;
                    } else if (H[1] - T[1] == 0) {
                        T[0] += (H[0] - T[0]) / 2;
                    } else {
                        T[0] += Math.abs(H[0] - T[0]) > 1 ? (H[0] - T[0]) / 2 : H[0] - T[0];
                        T[1] += Math.abs(H[1] - T[1]) > 1 ? (H[1] - T[1]) / 2 : H[1] - T[1];
                    }
                }
                space[500 - T[0]][500 - T[1]] = 1;
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