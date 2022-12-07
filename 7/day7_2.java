import java.util.Scanner;

public class day7_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int sizeoToFree = 8690120;// 30000000 - (70000000 - 48690120);
        System.out.println(sizeoToFree);
        String[] path = new String[1000];
        int[] size = new int[1000];
        int index = 0;

        int indexOfDir = 0;
        int difference = Integer.MAX_VALUE;
        String name = "";

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
                        if (size[index - 1] - sizeoToFree < difference && size[index - 1] - sizeoToFree >= 0) {
                            difference = size[index - 1] - sizeoToFree;
                            indexOfDir = index - 1;
                            name = path[index - 1];
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
            if (size[i] <= 100000) {
                sum += size[i];
            }
            if (size[i] - sizeoToFree < difference && size[i] - sizeoToFree >= 0) {
                difference = size[i] - sizeoToFree;
                // indexOfDir = index - 1;
                name = path[i];
            }
        }
        System.out.println(sizeoToFree + difference);

    }
}