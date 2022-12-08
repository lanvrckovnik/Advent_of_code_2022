import java.util.Scanner;

public class day8_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int rSum = 0;
        int index = 0;
        int[][] trees = new int[99][99];
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            char[] c = s.toCharArray();
            for (int i = 0; i < c.length; i++) {
                trees[index][i] = Integer.parseInt(String.valueOf(c[i]));

            }
            index++;
        }
        boolean visible = true;
        for (int i = 0; i < trees.length; i++) {
            for (int j = 0; j < trees[i].length; j++) {

                visible = true;
                for (int j2 = 0; j2 < j; j2++) {
                    if (trees[i][j2] >= trees[i][j] && j2 != j) {
                        visible = false;
                        break;
                    }
                }
                if (visible) {
                    sum++;
                    continue;
                }
                visible = true;
                for (int j2 = trees[i].length - 1; j2 > j; j2--) {
                    if (trees[i][j2] >= trees[i][j] && j2 != j) {
                        visible = false;
                        break;
                    }
                }
                if (visible) {
                    sum++;
                    continue;
                }
                visible = true;
                for (int j2 = 0; j2 < i; j2++) {
                    if (trees[j2][j] >= trees[i][j] && j2 != i) {
                        visible = false;
                        break;
                    }
                }
                if (visible) {
                    sum++;
                    continue;
                }
                visible = true;
                for (int j2 = trees.length - 1; j2 > i; j2--) {
                    if (trees[j2][j] >= trees[i][j] && j2 != i) {
                        visible = false;
                        break;
                    }
                }
                if (visible) {
                    sum++;
                    continue;
                }
            }

        }

        System.out.println(sum);
    }
}