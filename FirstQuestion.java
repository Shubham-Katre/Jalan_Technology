import java.util.*;

public class FirstQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
//        int[] nums = {-4, 1, 3, -2, -1};

        int[] result = findZeroSumElements(nums);
        if (result.length > 0) {
            for (int num : result) {
                System.out.print(num + " ");
            }
        } else {
            System.out.println("No elements found.");
        }
    }

    public static int[] findZeroSumElements(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = -nums[i];
            if (map.containsKey(complement)) {
                return new int[]{nums[i], complement};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}
