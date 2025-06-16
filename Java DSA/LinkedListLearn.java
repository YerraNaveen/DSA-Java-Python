class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

class LinkedList {

    Node head = null;
    
    void insert(int num) {
        Node node = new Node(num);
        if(head == null)
            head = node;
        else {
            Node temp = head;
            head = node;
            head.next = temp;
        }
    }

    public void print() {
        Node temp = head;
        while(temp != null) {
            System.out.println(temp.val);
            temp = temp.next;
        }
    }

    public void reverse() {
        Node prev = null;
        Node current = head;

        while(current != null) {
            Node temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }
        head = prev;
    }

    public int getValue() {
        return head.val;
    }
}


public class LinkedListLearn {

    public static LinkedList mergeTwoLists(LinkedList l1, LinkedList l2) {
        Node head1 = l1.head;
        Node head2 = l2.head;

        LinkedList newList = new LinkedList();

        while(head1 != null && head2 != null) {
            if(head1.val < head2.val) {
                newList.insert(head1.val);
                head1 = head1.next;
            } else {
                newList.insert(head2.val);
                head2 = head2.next;
            }
        }
        // newList
        return newList;
    }

    public static void main(String[] args) {


        LinkedList l1 = new LinkedList();
        l1.insert(1);
        l1.insert(3);
        l1.insert(5);
        // l1.print();

        LinkedList l2 = new LinkedList();
        l2.insert(2);
        l2.insert(4);
        l2.insert(6);
        // l2.print();

        LinkedList merged  = mergeTwoLists(l1, l2);
        merged.print();

        // System.out.println(l1.head.val);

        // Node node = new Node(1);
        // Node node2 = new Node(2);
        // node2.next = node;

        // Node head = node2;

        // while(head != null) {
            
        //     System.out.println(head.val);
        //     head = head.next;


        // }
        
    }
    
}
