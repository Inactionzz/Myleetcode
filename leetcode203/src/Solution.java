public class Solution {
    //迭代
    public ListNode removeElements(ListNode head, int val){
        //若头值等于要删的则直接将头节点指向下一个
        while (head!=null&&head.val==val){
            return head.next;
        }
        //已经为null,提前退出
        if (head == null)
            return head;
        //已经确定当前的head.val！=val
        ListNode pre = head;
        ListNode cur = head.next;
        while(cur!=null){
            if (cur.val==val){
                //删除
                pre.next = cur.next;
            }else {
                pre = cur;
            }
            cur = cur.next;
        }
        return head;
    }
}
