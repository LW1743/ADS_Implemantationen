package Datastructures.List;

public class List {

    Node head;

    public List() {
        this.head = null;
    }

    public Node search(int key) {
        Node temp = this.head;
        while (temp != null && temp.key != key) {
            temp = temp.next;
        }
        return temp;
    }

    public Node insert(int key) {
        Node temp = new Node(key, this.head);
        if(head != null) {
            this.head.prev = temp;
        }
        this.head = temp;
        return temp;
    }

    public void delete(Node toDelete) {
        if(toDelete.prev==null) {
            this.head = head.next;
        }
        else {
            toDelete.prev.next = toDelete.next;
        }
        if(toDelete.next != null) {
            toDelete.next.prev = toDelete.prev;
        }
    }

    public void DeleteMulti(int k) {
        Node current = head;
        while (current != null) {
            if (current.key <= k) {
                delete(current);
            }
                current = current.next;
        }
    }

    public void printList() {
        Node temp = this.head;
        while(temp!=null) {
            System.out.print(temp.key + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
