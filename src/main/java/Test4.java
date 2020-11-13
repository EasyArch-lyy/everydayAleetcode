public class Test4 {
}

class ListNode {

    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution4 {
    public ListNode oddEvenList(ListNode head){
        if (head == null || head.next == null) {
            return head;
        }

        ListNode pre = head;
        ListNode evenNum = head.next;
        ListNode next = evenNum;
        while (next != null && next.next != null) {
            pre.next = next.next;
            pre = pre.next;
            next = pre.next;
            next = next.next;
        }
        pre.next = evenNum;
        return head;
    }
}
