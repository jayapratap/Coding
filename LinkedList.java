public class LinkedList {
    Node head;
    static class Node {
        Node next;
        int value;
    
        public Node(int data) {
            this.value = data;
            this.next = null;
        }
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list = insertNodeAtTail(list, 1);
        list = insertNodeAtTail(list, 2);
        list = insertNodeAtTail(list, 3);
        list = insertNodeAtTail(list, 4);
        printLinkedList(list);
    }

    private static LinkedList insertNodeAtTail(LinkedList list, int i) {
        Node new_list = new Node(i);
        new_list.next = null;

        if(list.head == null) {
            list.head = new_list;
        } else {
            Node last = list.head;
            while(last.next!=null) {
                last = last.next;
            }
            last.next = new_list;
        }
        return list;
    }

    private static void printLinkedList(LinkedList list) {
        Node printlist = list.head;
        while(printlist != null) {
            System.out.print(printlist.value);
            if(printlist.next!=null) {
                System.out.print(" -> ");
            }
            printlist = printlist.next;
        }
    }

    
}