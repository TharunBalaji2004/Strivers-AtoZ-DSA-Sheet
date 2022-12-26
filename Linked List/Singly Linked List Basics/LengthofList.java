package SinglyLinkedList;

public class LengthofList {

    private ListNode head;

    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    public void length(){
        int n=0;
        ListNode temp = head;
        
        while (temp != null) {
            temp = temp.next;
            n++;
        }

        System.out.println("Length of Linked List: "+n);
    }

    public static void main(String[] args) {
        LengthofList list = new LengthofList();

        list.head = new ListNode(10);
        ListNode two = new ListNode(20);
        ListNode three = new ListNode(30);
        ListNode four = new ListNode(40);
        ListNode five = new ListNode(50);
        
        list.head.next = two;
        two.next = three;
        three.next = four;
        four.next = five;

        list.length();
    }
}
