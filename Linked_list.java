class Node {
    int data;
    Node next;
}

class Linkedlist {

    Node head;

    public void insert(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;

        if (head == null) {
            head = node;
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
    }

    public void InsertAtStart(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;
        node.next = head;
        head = node;
    }

    public void InsertAtIndex(int index, int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;

        Node n = head;
        if (index == 0) {
            InsertAtStart(data);
        } else {
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            node.next = n.next;
            n.next = node;
        }
    }

    public void deleteAt(int index){
        if(index==0){
            head = head.next;
        }
        else{
            Node n = head;
            Node n1 = null;

            for(int i=0; i<index-1; i++){
                n = n.next;
            }
            n1 = n.next;
            n.next = n1.next;
            n1=null;
        }
    }

    public void show() {
        Node node = head;
        while (node.next != null) {
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);

    }

}

public class Linked_list {
    public static void main(String[] args) {
        Linkedlist list = new Linkedlist();
        list.insert(5);
        list.insert(24);
        list.insert(53);
        list.insert(123);
        list.InsertAtIndex(2, 110);
        list.InsertAtStart(23);
        list.InsertAtStart(11);
        list.deleteAt(4);
        list.show();
    }
}
