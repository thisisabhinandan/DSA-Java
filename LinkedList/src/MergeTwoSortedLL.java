import java.util.List;

public class MergeTwoSortedLL {
    public static Node Merge(Node List1,Node List2)
    {
        if(List1==null)  return List2;

        if(List2==null)  return List1;

        if(List1.data<=List2.data)
        {
            List1.next=Merge(List1.next,List2);
            return List1;
        }
        else
        {
            List2.next=Merge(List1,List2.next);
            return List2;
        }

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

        Node List1=new Node(1);
        List1.next=new Node(2);
        List1.next.next=new Node(3);
        List1.next.next.next=new Node(4);

        Node List2=new Node(1);
        List2.next=new Node(2);
        List2.next.next=new Node(3);
        List2.next.next.next=new Node(4);

        System.out.print("The first LL is: ");
        display(List1);
        System.out.print("The second LL is: ");
        display(List2);
        Node ans=Merge(List1,List2);
        System.out.print("After Merging: ");
        display(ans);
    }
}
