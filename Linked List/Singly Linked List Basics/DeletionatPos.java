package SinglyLinkedList;

public class DeletionatPos {
    private ListNode head;

    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
        }
    }

    public void deleteatpos(int pos) {
        if (pos == 1){
            System.out.println("Node deleted: "+head.data);
            head = head.next;
            return;
        }

        ListNode prev = head;
        int count = 1;

        while(count < pos-1){
            prev = prev.next;
            count++;
        }
        ListNode current = prev.next;
        
        System.out.println("Node deleted: "+current.data);
        prev.next = current.next;

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
        DeletionatPos list = new DeletionatPos();

        list.head = new ListNode(10);
        ListNode two = new ListNode(20);
        ListNode three = new ListNode(30);
        ListNode four = new ListNode(40);
        ListNode five = new ListNode(50);

        list.head.next = two;
        two.next = three;
        three.next = four;
        four.next = five;

        list.deleteatpos(3);
    }
}
