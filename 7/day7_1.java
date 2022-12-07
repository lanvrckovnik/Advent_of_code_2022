import java.util.Scanner;

public class day7_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        String[] path = new String[1000];
        int[] size = new int[1000];
        int index = 0;

        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            if (s.contains("$")) {
                if (s.contains("cd")) {
                    if (s.contains("/")) {
                        path[0] = "/";
                        index = 1;
                    } else if (s.contains("..")) {
                        if (size[index - 1] <= 100000) {
                            sum += size[index - 1];
                        }
                        path[index - 1] = null;
                        size[index - 1] = 0;
                        index--;
                    } else {

                        path[index] = s.substring(5);
                        index++;
                    }
                } else if (s.contains("ls")) {
                    continue;
                }
            } else if (s.contains("dir")) {
                continue;
            } else {
                int fileSize = Integer.parseInt(s.split(" ")[0]);
                for (int i = 0; i < index; i++) {
                    size[i] += fileSize;
                }
            }
        }
        for (int i = 0; i < index; i++) {
            sum += size[i] <= 100000 ? size[i] : 0;
        }
        System.out.println(sum);
    }
}