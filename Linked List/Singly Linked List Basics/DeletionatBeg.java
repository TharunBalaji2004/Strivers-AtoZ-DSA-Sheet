package SinglyLinkedList;

public class DeletionatBeg {
    private ListNode head;

    static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void deleteatbeg() {
        if (head == null) {
            System.out.println("List is Empty!!");
            return;
        } 
        
        ListNode temp = head;
        head = head.next;
        System.out.println("Node deleted: "+temp.data);

        display();
    }

    public void display() {
        ListNode temp = head;
        while (temp != null){
            System.out.print(temp.data + "-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DeletionatBeg list = new DeletionatBeg();

        list.head = new ListNode(10);
        ListNode two = new ListNode(20);
        ListNode three = new ListNode(30);
        ListNode four = new ListNode(40);

        list.head.next = two;
        two.next = three;
        three.next = four;

        list.deleteatbeg();
    }
}
