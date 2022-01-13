public class Solution {
    class MyLinkedList {
        //size存储链表元素的个数
        int size;
        //设置虚拟头结点
        ListNode head;
        //初始化链表
        public MyLinkedList() {
            //链表元素初始化为0
            size=0;
            //虚拟头结点初始化
            head = new ListNode(0);

        }
        //获取链表中第 index 个节点的值。如果索引无效，则返回-1
        //注意这里的index 0 代表第一个结点，不是虚拟头节点
        public int get(int index) {
            //如果index非法，返回-1
            if (index<0||index>=size){
                return -1;
            }
            ListNode curNode = head;
            //包含虚拟头结点，故向前走index+1步，循环i+index次
            for (int i = 0; i <= index ; i++) {
                curNode = curNode.next;
            }
            return curNode.val;

        }
        //在链表的第一个元素之前添加一个值为 val 的节点。插入后，新节点将成为链表的第一个节点。
        public void addAtHead(int val) {
            /*size++;
            ListNode newNode = new ListNode(val);
            newNode.next =head.next;
            head.next = newNode;
             */
            addAtIndex(0,val);

        }
        //addAtTail(val)：将值为 val 的节点追加到链表的最后一个元素
        public void addAtTail(int val) {
            addAtIndex(size,val);

        }
        //在链表中第indeex个结点之前添加值为val的结点。如果index等于链表的长度，则该节点将附加到链表的末尾。如果 index 大于链表长度，则不会插入节点。如果index小于0，则在头部插入节点。

        public void addAtIndex(int index, int val) {
            //index>size则直接返回
            if (index>size){
                return;
            }
            //index<0则在第一个结点之前添加
            if (index<0){
                index = 0;
            }
            size++;
            //首先找到插入结点的前驱结点
            ListNode preNode = head;
            //前驱故i不能等于index
            for (int i = 0; i<index;i++){
                preNode = preNode.next;
            }
            ListNode newNode = new ListNode(val);
            //插入
            newNode.next = preNode.next;
            preNode.next = newNode;



        }
        //删除第index个结点
        public void deleteAtIndex(int index) {
            if (index<0||index>=size){
                return;
            }
            //调用一次记录删除一个
            size--;
            ListNode preNode = head;
            //
            for(int i= 0;i<index;i++){
                preNode = preNode.next;

            }
            preNode.next = preNode.next.next;

        }
    }
}
