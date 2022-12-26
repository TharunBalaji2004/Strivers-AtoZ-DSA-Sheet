package SinglyLinkedList;

public class Node {
    
    private ListNode head;   // Creating head as instance variable

    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }
    
}
