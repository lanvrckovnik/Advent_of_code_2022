public class day11_2 {
    public static void main(String[] args) {
        long sum[] = new long[8];
        long[][] Monkey = {
                { 61, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                        0, 0, 0, 0 },
                { 76, 92, 53, 93, 79, 86, 81, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                        0, 0, 0, 0, 0, 0 },
                { 91, 99, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                        0, 0, 0, 0, 0 },
                { 58, 67, 66, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                        0, 0, 0, 0, 0 },
                { 94, 54, 62, 73, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                        0, 0, 0, 0, 0 },
                { 59, 95, 51, 58, 58, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                        0, 0, 0, 0, 0, 0 },
                { 87, 69, 92, 56, 91, 93, 88, 73, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                        0, 0, 0, 0, 0, 0, 0 },
                { 71, 57, 86, 67, 96, 95, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                        0, 0, 0, 0, 0, 0 } };
        int[][] devision = { { 5, 7, 4 }, { 2, 2, 6 }, { 13, 5, 0 }, { 7, 6, 1 }, { 19, 3, 7 }, { 11, 0, 4 },
                { 3, 5, 2 }, { 17, 3, 1 } };
        int[] add = { 11, 4, 19, 0, 1, 3, 8, 7 };
        int reducer = 1;
        for (int[] i : devision) {
            reducer *= i[0];
        }
        for (int i = 0; i < 10000; i++) {
            for (int j = 0; j < 8; j++) {
                for (int j2 = 0; j2 < Monkey[j].length; j2++) {
                    if (Monkey[j][j2] == 0) {
                        continue;
                    }
                    sum[j]++;
                    if (j == 3) {
                        Monkey[j][j2] *= Monkey[j][j2];
                    } else if (j == 0 || j == 2) {
                        Monkey[j][j2] *= add[j];
                    } else {
                        Monkey[j][j2] += add[j];
                    }
                    Monkey[j][j2] %= reducer;
                    int index = Monkey[j][j2] % devision[j][0] == 0 ? 1 : 2;

                    for (int k = 0; k < Monkey[devision[j][index]].length; k++) {
                        if (Monkey[devision[j][index]][k] == 0) {
                            Monkey[devision[j][index]][k] = Monkey[j][j2];
                            Monkey[j][j2] = 0;
                            break;
                        }
                    }
                }
            }
        }
        long max1 = 0;
        long max2 = 0;
        for (long i : sum) {
            max1 = i > max1 ? i : max1;
        }
        for (long i : sum) {

            max2 = i > max2 && i != max1 ? i : max2;
        }
        System.out.println((max1 * max2));
    }
}