import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));

        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 != 0) {
                System.out.print(nums.get(i)+" ");
            }
        }
        System.out.println();
        Collections.sort(nums);
        int prevNum = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num % 2 == 0 && num != prevNum) {
                System.out.print(num + " ");
                prevNum = num;
            }
        }
        System.out.println();
        List<String> set1 = new ArrayList<>(List.of("qwer", "asdf", "qwer", "zxcv", "trt", "asdf"));
        Set<String> set2 = new HashSet<>(set1);
        System.out.println(set2);

        System.out.println(set1.size() - set2.size());
    }
}