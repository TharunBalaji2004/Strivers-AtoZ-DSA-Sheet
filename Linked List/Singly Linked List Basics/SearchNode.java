package SinglyLinkedList;

public class SearchNode {
    private ListNode head;

    private static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public boolean searchElement(int value){
        if (head == null){
            return false;
        }

        ListNode temp = head;
        while(temp != null){
            if (temp.data == value){
                return true;
            }
            temp = temp.next;
        }

        return false;
    }

    public static void main(String[] args) {
        SearchNode list = new SearchNode();

        list.head = new ListNode(10);
        ListNode two = new ListNode(20);
        ListNode three = new ListNode(30);
        ListNode four = new ListNode(40);

        list.head.next = two;
        two.next = three;
        three.next = four;

        int value = 30;

        if (list.searchElement(value)){
            System.out.println("Element found!!");
        }
        else {
            System.out.println("Element not found!!");
        }
    }
    
}
