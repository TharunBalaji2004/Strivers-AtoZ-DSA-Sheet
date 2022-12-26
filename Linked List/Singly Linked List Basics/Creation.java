package SinglyLinkedList;

public class Creation {
    private ListNode head;   

    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        Creation list = new Creation();
        
        // Creating node values
        list.head = new ListNode(10);
        ListNode second = new ListNode(20);
        ListNode third = new ListNode(30);
        ListNode four = new ListNode(40);
        ListNode five = new ListNode(50);

        // Creating connection between nodes
        list.head.next = second;
        second.next = third;
        third.next = four;
        four.next = five;
        five.next = null;
        
        //  10->20->30->40->50
    }
}
