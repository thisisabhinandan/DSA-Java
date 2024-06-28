public class MiddleOfLL {
    public static int MiddleOfLL(Node head)
    {
        Node fast=head;
        Node slow=head;
        while(fast.next!=null&&fast!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow.data;
    }

    public static void main(String[] args) {
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next.next=new Node(5);
        head.next.next.next.next.next=new Node(6);
        head.next.next.next.next.next.next=new Node(7);

        int ans=MiddleOfLL(head);
        System.out.println("The Middle of LL is: "+ans);
    }
}
