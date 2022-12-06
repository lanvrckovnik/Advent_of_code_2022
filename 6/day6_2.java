import java.util.Scanner;

public class day6_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(s);
        char[] sArr = s.toCharArray();
        Boolean found = false;
        int index = 0;
        for (int i = 13; i < sArr.length; i++) {
            found = true;
            for (int j = 0; j < 14; j++) {
                for (int j2 = 0; j2 < 14; j2++) {
                    if (sArr[i - j] == sArr[i - j2] && i - j != i - j2) {
                        found = false;
                        break;
                    }
                }
            }
            if (found) {
                index = i;
                break;
            }
        }
        System.out.println(index);
    }
}