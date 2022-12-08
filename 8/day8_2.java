import java.util.Scanner;

public class day8_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int top = 0;
        int bottom = 0;
        int left = 0;
        int right = 0;
        int index = 0;
        long max = 0;
        int[][] trees = new int[99][99];
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            char[] c = s.toCharArray();
            for (int i = 0; i < c.length; i++) {
                trees[index][i] = Integer.parseInt(String.valueOf(c[i]));
            }
            index++;
        }
        for (int i = 0; i < trees.length; i++) {
            for (int j = 0; j < trees[i].length; j++) {
                left = 0;
                right = 0;
                top = 0;
                bottom = 0;

                for (int j2 = j + 1; j2 < trees[i].length; j2++) {
                    left++;
                    if (trees[i][j2] >= trees[i][j]) {
                        break;
                    }
                }

                for (int j2 = j - 1; j2 >= 0; j2--) {
                    right++;
                    if (trees[i][j2] >= trees[i][j]) {
                        break;
                    }
                }

                for (int j2 = i + 1; j2 < trees.length; j2++) {
                    top++;
                    if (trees[j2][j] >= trees[i][j]) {
                        break;
                    }
                }

                for (int j2 = i - 1; j2 >= 0; j2--) {
                    bottom++;
                    if (trees[j2][j] >= trees[i][j]) {
                        break;
                    }
                }
                max = left * right * top * bottom > max ? left * right * top * bottom : max;
            }

        }

        System.out.println(max);
    }
}