package SinglyLinkedList;

public class InsertionatEnd {
    
    private ListNode head;

    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void insertatend(int value) {
        ListNode newnode = new ListNode(value);

        if (head == null) {
            head = newnode;
            return;
        }
        ListNode temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newnode;
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
        InsertionatEnd list = new InsertionatEnd();

        list.head = new ListNode(10);
        ListNode two = new ListNode(20);
        ListNode three = new ListNode(30);

        list.head.next = two;
        two.next = three;

        list.insertatend(40);
        list.insertatend(50);
    }
}
