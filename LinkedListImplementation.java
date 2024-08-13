class Linkedlist {
    Node head;
    class Node {
        int data;
        Node next;
    
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // add elements to linkedlist
    void add(int data) {
        Node temp = new Node(data);
        if (head == null) {
            head = temp;
            return;
        } else {
            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = temp;
        }
    }

    // print linkedlist
    void printList() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        } else {
            Node curr = head;
            while (curr != null) {
                System.out.print(curr.data + "-->");
                curr = curr.next;
            }
            System.out.println("null");
        }
    }

    // add element at first
    void addFirst(int data) {
        Node temp = new Node(data);
        if (head == null) {
            head = temp;
            return;
        } else {
            Node curr = head;
            temp.next = curr;
            head = temp;
        }
    }

    // add element at last
    void addLast(int data) {
        add(data);
    }

    // remove first element
    void removeFirst() {
        if (head == null) {
            System.out.println("empty list");
        } else {
            Node curr = head;
            curr = curr.next;
            head = curr;
        }
    }

    // remove last element
    void removeLast() {
        if (head == null) {
            System.out.println("Empty list");
        } else {
            Node curr = head;
            while (curr.next.next != null) {
                curr = curr.next;
            }
            curr.next = null;
        }
    }

    // size of the list
    int size() {
        if (head == null) {
            return -1;
        } else {
            int count = 1;
            Node curr = head;
            while (curr.next != null) {
                count++;
                curr = curr.next;
            }
            return count;
        }
    }

    // reverse linkedlist
    void reverseList() {
        Node prev = head.next;
        Node next = head.next.next;

        head.next=null;

        while(prev!=null){
            prev.next=head;
            head=prev;
            prev=next;
            if(next!=null){
            next=next.next;
            }
        }  
    }
}

public class LinkedListImplementation {
    public static void main(String[] args) {
        Linkedlist list = new Linkedlist();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
       
        list.printList();

    }
}