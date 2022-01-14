public class Solution {
    //根据计算得结论从头结点出发一个指针，从相遇节点 也出发一个指针，这两个指针每次只走一个节点， 那么当这两个指针相遇的时候就是 环形入口的节点
    public ListNode detectCycle(ListNode head) {
        //定义快慢指针
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            //slow指针一次走一步，fast指针走两步
            slow = slow.next;
            fast = fast.next.next;
            //slow指针和fast指针相遇则记录该位置为index1,此时头结点记录为index2
            if (slow == fast) {
                ListNode index1 = fast;
                ListNode index2 = head;
                //两个指针，从头结点和相遇结点，各走一步，直到相遇，相遇处即为环的入口。
                while (index1 != index2) {
                    index1 = index1.next;
                    index2 = index2.next;
                }
                return index1;
            }
        }
    return  null;
    }
}
