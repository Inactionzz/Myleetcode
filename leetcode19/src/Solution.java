public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //双指针，快指针到慢指针差n
        //创建一个虚拟头结点
        ListNode dummy = new ListNode(0,head);
        ListNode slow = dummy;
        ListNode fast = head;
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        while (fast!=null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        ListNode ans = dummy;
        return ans;
    }


}
