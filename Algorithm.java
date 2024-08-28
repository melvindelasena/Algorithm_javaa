import java.util.Arrays;
import java.util.List;

public class Algorithm {
    public static void main(String[] args) {
        Integer num[] = {23, 56, -18, 100, 45, -78, 98, 45, 69, -7};
        List<Integer> data = Arrays.asList(num);
        System.out.println(delete_algo1(num, -78));
        System.out.println(delete_algo2(data, -78));
    }

    public static String delete_algo1(Integer num[], int del) {
        String hold = del + " is not found. ";

        for (int x = 0; x < num.length; x++) {
            if (num[x] == del) {
                hold = del + " is deleted successfully. ";
                for (int y = x; y < num.length - 1; y++) {
                    num[y] = num[y + 1];
                }
                break;
            }
        }
        return hold;
    }

    public static String delete_algo2(List<Integer> data, int del) {
        if (data.contains(del)) {
            return del + " is deleted successfully. ";
        } else {
            return del + " is not found.";
        }
    }
}
