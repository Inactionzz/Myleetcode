public class Solution {
    //存在一个按升序排列的链表，给你这个链表的头节点 head ，请你删除所有重复的元素，使每个元素只出现一次 。
    //
    //返回同样按升序排列的结果链表。
    public ListNode deleteDuplicates(ListNode head){
        //终止条件，链表空
        if(head==null||head.next==null)
            return head;
        //每层返回:链表当前层的head
        if (head.next.val==head.val)
            head = head.next;
        head.next = deleteDuplicates(head.next);
        return  head;

    }
}
