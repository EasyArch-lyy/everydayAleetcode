/**
 * 给定一个非负整数数组 A， A 中一半整数是奇数，一半整数是偶数。
 * <p>
 * 对数组进行排序，以便当 A[i] 为奇数时，i 也是奇数；当 A[i] 为偶数时， i 也是偶数。
 * <p>
 * 你可以返回任何满足上述条件的数组作为答案。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/sort-array-by-parity-ii
 * <p>
 * 输入：[4,2,5,7]
 * 输出：[4,5,2,7]
 * 解释：[4,7,2,5]，[2,5,4,7]，[2,7,4,5] 也会被接受。
 */
public class Test1 {
    public static int[] sortArrayByParityII(int[] A) {
        // 有n个奇数位
        int n = A.length / 2;
        int[] m = new int[n];    // 奇数数组
        int[] o = new int[n];    // 偶数数组
        int e = 0; // 奇数数组下标
        int w = 0; // 偶数数组下标
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 > 0) {
                m[e] = A[i];
                e++;
            } else {
                o[w] = A[i];
                w++;
            }
        }
        int f = 0;
        int d = 0;
        for (int i = 0; i < A.length; i++) {
            if (i % 2 > 0) {
                A[f + f + 1] = m[f];
                f++;
            } else {
                A[d * 2] = o[d];
                d++;
            }
        }
        for (int s : A) {
            System.out.println(s);
        }
        return A;
    }

}
/**
 * 用按位&判断奇偶
 * 原理分析：一个数的奇偶性由这个数的二进制最后一位决定,最后一位是1,就是奇数，是0就是偶数;利用按位与的清零功能判断
 *    用按位原理：参与运算的两数各对应的二进位相与。只要对应的二个二进位都为1时，结果位就为1
 * (a & 1) = 1  -----奇数
 * (A[i] & 1) != 0 --奇数
 *
 */
class Solution {
    public int[] sortArrayByParityII(int[] A) {
        int j = 1;
        for (int i = 0; i < A.length - 1; i = i + 2) {
            // 按位与   0001
            if ((A[i] & 1) == 1) {  // 奇数 (下标位偶数)
                while ((A[j] & 1) == 1) {  // 下标位奇数 判断值位奇数
                    j = j + 2;
                }
                int tmp = A[i];
                A[i] = A[j];
                A[j] = tmp;
            }
        }
        return A;
    }
}
