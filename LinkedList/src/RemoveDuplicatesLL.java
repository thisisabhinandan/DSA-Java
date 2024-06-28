class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }

}
public class RemoveDuplicatesLL {

    public static Node RemoveDuplicates(Node head) {
        if (head == null) {
            return head;
        }

        Node curr = head;

        while (curr.next != null) {
            if (curr.data == curr.next.data) {
                curr.next = curr.next.next; // Skip the duplicate node
            } else {
                curr = curr.next;
            }
        }
        return head;
    }

    public static void display(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + "->");
            curr = curr.next;
        }
        System.out.print("null");
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(2);
        head.next.next.next = new Node(3);
        head.next.next.next.next = new Node(3);
        head.next.next.next.next.next = new Node(4);

        System.out.println("Original list:");
        display(head);

        head = RemoveDuplicates(head);

        System.out.println("List after removing duplicates:");
        display(head);
    }
}