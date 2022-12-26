package SinglyLinkedList;

public class ReverseLinkedList {
    private ListNode head;

    private static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void reverselist(){
        ListNode newHead = null;
        ListNode temp = head;

        while(head != null){
            head = head.next;
            temp.next = newHead;
            newHead = temp;
            temp = head;
        }

        display(newHead);
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
        ReverseLinkedList list = new ReverseLinkedList();

        list.head = new ListNode(10);
        ListNode two = new ListNode(20);
        ListNode three = new ListNode(30);
        ListNode four = new ListNode(40);
        ListNode five = new ListNode(50);

        list.head.next = two;
        two.next = three;
        three.next = four;
        four.next = five;

        list.reverselist();
    }
}
