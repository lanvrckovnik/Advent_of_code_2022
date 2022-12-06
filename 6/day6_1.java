import java.util.Scanner;

public class day6_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(s);
        char[] sArr = s.toCharArray();
        int index = 0;
        for (int i = 0; i < sArr.length; i++) {
            if (i > 3) {
                if (sArr[i] != sArr[i - 1] && sArr[i] != sArr[i - 2] && sArr[i] != sArr[i - 3]) {
                    if (sArr[i - 1] != sArr[i - 2] && sArr[i - 1] != sArr[i - 3]) {
                        if (sArr[i - 2] != sArr[i - 3]) {
                            index = i;
                            System.out.println();
                            System.out.print(sArr[i - 3]);
                            System.out.print(sArr[i - 2]);
                            System.out.print(sArr[i - 1]);
                            System.out.print(sArr[i]);
                            System.out.println();
                            break;
                        }
                    }
                }
            }
        }
        System.out.println(index);
    }
}