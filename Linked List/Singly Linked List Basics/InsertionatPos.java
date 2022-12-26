package SinglyLinkedList;

public class InsertionatPos {
    
    private ListNode head;

    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void insertatpos(int pos, int value) {
        ListNode newnode = new ListNode(value);

        if (pos == 1) {
            newnode.next = head;
            head = newnode;
            return;
        }

        ListNode prev = head;
        int count=1;
        
        while (count < pos-1) {
            prev = prev.next;
            count++;
        }

        ListNode front = prev.next;

        newnode.next = front;
        prev.next = newnode;

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
        InsertionatPos list = new InsertionatPos();

        list.head = new ListNode(10);
        ListNode two = new ListNode(20);
        ListNode three = new ListNode(30);
        ListNode four = new ListNode(40);
        ListNode five = new ListNode(50);
        
        list.head.next = two;
        two.next = three;
        three.next = four;
        four.next = five;

        int pos = 3;
        int data = 100;

        list.insertatpos(pos, data);
    }
}
