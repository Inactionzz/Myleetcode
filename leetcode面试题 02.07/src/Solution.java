public class Solution {
    //shuan
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        //求出链表A,B的长度
        int lenA=0;
        int lenB=0;
        ListNode curA = headA;
        ListNode curB = headB;
        while (curA != null){
            curA = curA.next;
            lenA++;
        }
        while (curB!=null){
            curB = curB.next;
            lenB++;
        }
        curA = headA;
        curB = headB;
        //将长的链表移到和短链表长度一样的位置
        if (lenA>lenB) {
            for (int i = 0; i < lenA - lenB; i++) {
                curA = curA.next;

            }
            // 遍历curA 和 curB，遇到相同则直接返回
            while (curA != null) {
                if (curA == curB) {
                    return curA;
                }
                curA = curA.next;
                curB = curB.next;
            }
        }else {
            for (int j = 0; j < lenB-lenA; j++) {
                curB = curB.next;
            }
            while (curB!=null){
                if (curB==curA){
                    return curB;
                }
                curA = curA.next;
                curB = curB.next;
            }

        }
        return null;
    }


}
