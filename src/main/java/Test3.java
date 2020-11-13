import java.util.HashMap;

/**
 * 。
 * 两数之和
 * <p>
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * <p>
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/two-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * <p>
 * 示例:
 * <p>
 * 给定 nums = [2, 7, 11, 15], target = 9
 * <p>
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/two-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Test3 {

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int[] c = twoSum2(nums,9);
        System.out.println("[ " + c[0] + ", " + c[1] + " ]");
    }

    public static int[] twoSum2(int[] nums, int target) {
        int[] b = new int[2];
        HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (hash.containsKey(nums[i])) {
                b[0] = i;
                b[1] = hash.get(nums[i]);
                return b;
            }
            hash.put(target - nums[i], i);
        }
        return b;
    }

    private static int[] getSum(int[] nums) {
        int j = 0;
        int[] c = new int[2];
        while (j < nums.length-1) {

            for (int i = 0; i < nums.length; i++) {
                if (i == j) {
                    continue;
                } else {
                    if (nums[i] + nums[j] == 9) {
                        if (i > j) {
                            c[0] = j;
                            c[1] = i;
                        } else {
                            c[0] = i;
                            c[1] = j;
                        }
                    }
                }
                if (i == nums.length - 1) {
                    j++;
                }
            }
        }
        return c;
    }
}

class Solution3{

    public static int[] twoSum1(int[] nums, int target) {
        int[] b = new int[2];
        for (int a = 0; a < nums.length; a++) {
            for (int j = a + 1; j < nums.length; j++) {
                if (nums[a] + nums[j] == target) {
                    b[0] = a;
                    b[1] = j;
                    return b;
                }
            }
        }
        return b;
    }
}
