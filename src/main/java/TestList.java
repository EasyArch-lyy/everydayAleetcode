import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个单链表，把所有的奇数节点和偶数节点分别排在一起。请注意，这里的奇数节点和偶数节点指的是节点编号的奇偶性，而不是节点的值的奇偶性。
 *
 * 请尝试使用原地算法完成。你的算法的空间复杂度应为 O(1)，时间复杂度应为 O(nodes)，nodes 为节点总数。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/odd-even-linked-list
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * 示例 1:
 *
 * 输入: 1->2->3->4->5->NULL
 * 输出: 1->3->5->2->4->NULL
 *
 */
public class TestList {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
//
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list = test(list);
        for (Integer s : list) {
            System.out.println(s);
        }
    }

    public static List<Integer> test(List<Integer> list) {

        int w = 1;
        for (int i = 0; i < list.size(); i++) {
            // 奇数节点
            if ((i + 1) % 2 != 0 && i != 0) {
                list.add(w, list.get(i));
                list.remove(i + 1);
                w++;
            }
        }
        return list;
    }
}
