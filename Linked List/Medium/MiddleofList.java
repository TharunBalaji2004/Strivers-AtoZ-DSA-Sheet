package SinglyLinkedList;

// Leetcode Solution: https://leetcode.com/problems/middle-of-the-linked-list/solutions/2945981/

public class MiddleofList {
    private ListNode head;

    private static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void middleNode(){
        ListNode tortoise = head;
        ListNode rabbit = head;

        while(rabbit != null && rabbit.next != null){
            tortoise = tortoise.next;
            rabbit = rabbit.next.next;
        }
        
        display(tortoise);
    }

    public void display(ListNode tortoise) {
        ListNode temp = tortoise;
        while (temp != null){
            System.out.print(temp.data + "-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        MiddleofList list = new MiddleofList();

        list.head = new ListNode(10);
        ListNode two = new ListNode(20);
        ListNode three = new ListNode(30);
        ListNode four = new ListNode(40);
        ListNode five = new ListNode(50);

        list.head.next = two;
        two.next = three;
        three.next = four;
        four.next = five;

        list.middleNode();
    }
}
