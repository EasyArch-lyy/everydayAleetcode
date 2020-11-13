import java.util.ArrayList;
import java.util.List;

/**
 * 删除排序数组中的重复项
 * 给定一个排序数组，你需要在 原地 删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
 * <p>
 * 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
 * <p>
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/x2gy9m/
 * 来源：力扣（LeetCode）
 * <p>
 * <p>
 * 给定数组 nums = [1,1,2],
 * 函数应该返回新的长度 2, 并且原数组 nums 的前两个元素被修改为 1, 2。
 * 你不需要考虑数组中超出新长度后面的元素。
 */
public class Test2 {
    public static void main(String[] args) {

        int[] a = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4, 6};
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (i == a.length - 1) {
                    if(i == j){
                        list.add(a[i]);
                    }
                }
                if (i == j) {
                    continue;
                }
                if (a[i] == a[j]) {
                    break;
                }
                if (j == a.length - 1) {
                    list.add(a[i]);
                }
            }
        }
        for (Integer s : list) {
            System.out.print(s + "  ");
        }
    }
}

class Solution2 {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 1) {
            return nums.length;
        }
        int i = 0, j = 1;
        while (j < nums.length) {
            if (nums[i] == nums[j]) {
                j++;
            } else {
                i++;
                nums[i] = nums[j];
                j++;
            }
        }
        return i + 1;
    }
}

class SolutionT {
    public int removeDulicates(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums[j])
                nums[++j] = nums[i];
        }
        return j + 1;
    }
}
