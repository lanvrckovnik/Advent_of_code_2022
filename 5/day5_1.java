import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class day5_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        char[][] pos = new char[100][9];
        char[] temp7 = { 'N', ' ', 'C', ' ', ' ', ' ', ' ', 'Q', ' ' };
        char[] temp6 = { 'W', ' ', 'J', 'L', ' ', ' ', ' ', 'J', 'V' };
        char[] temp5 = { 'F', ' ', 'N', 'D', ' ', 'L', ' ', 'S', 'W' };
        char[] temp4 = { 'R', 'S', 'F', 'G', ' ', 'R', ' ', 'V', 'Z' };
        char[] temp3 = { 'Z', 'G', 'Q', 'C', ' ', 'W', 'C', 'F', 'G' };
        char[] temp2 = { 'S', 'Q', 'V', 'P', 'S', 'F', 'D', 'R', 'S' };
        char[] temp1 = { 'M', 'P', 'R', 'Z', 'P', 'D', 'N', 'N', 'M' };
        char[] temp0 = { 'D', 'W', 'W', 'F', 'T', 'H', 'Z', 'W', 'R' };

        pos[0] = temp0;
        pos[1] = temp1;
        pos[2] = temp2;
        pos[3] = temp3;
        pos[4] = temp4;
        pos[5] = temp5;
        pos[6] = temp6;
        pos[7] = temp7;

        for (int i = 0; i < 10; i++) {
            sc.nextLine();
        }
        while (sc.hasNextLine()) {
            String a = sc.nextLine();
            int num = Integer.parseInt(a.split(" ", 7)[1].strip());
            int from = Integer.parseInt(a.split(" ", 7)[3].strip()) - 1;
            int to = Integer.parseInt(a.split(" ", 7)[5].strip()) - 1;
            char moving = ' ';

            for (int i = 0; i < num; i++) {
                boolean found = false;
                int j = 0;
                while (!found) {
                    if ((pos[j + 1][from]) == ' ' || pos[j + 1][from] == '\u0000') {
                        moving = pos[j][from];
                        pos[j][from] = ' ';
                        found = true;
                    }
                    j++;
                }

                found = false;
                j = 0;
                while (!found) {
                    if (pos[j][to] == ' ' || pos[j][to] == '\u0000') {
                        pos[j][to] = moving;
                        found = true;
                    }
                    j++;
                }
            }
        }
        for (char[] cs : pos) {
            for (char cs2 : cs) {

                System.out.print(cs2);
            }
            System.out.println();
        }
    }
}