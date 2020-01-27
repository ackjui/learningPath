import java.util.HashSet;

public class SinglyLinkedList {
    int size;
    Node head;

    public SinglyLinkedList()
    {}

    private static class Node
    {
        int item;
        Node next;

        public Node(int item)
        {
            this.item = item;
            this.next = null;
        }
    }

    public void add(int e)
    {
        Node node = head;
        Node newNode = new Node(e);
        if(head == null)
        {
            head = newNode;
        }else
        {
            while(node.next != null)
            {
                node = node.next;
            }
            node.next = newNode;
        }
        size++;
    }

    public void print(Node head)
    {
        while(head != null)
        {
            System.out.println(head.item);
            head = head.next;
        }
    }

    public void delete(int e)
    {
        Node temp = head, prev = null;

        if(head != null && head.item == e)
        {
            head = head.next;
            return;
        }

        while(temp.next != null && temp.item != e)
        {
            prev = temp;
            temp = temp.next;
        }

        prev.next = temp.next;
        size--;
    }

    public void removeDuplicates()
    {
        Node p1 = null, p2 = null, dup = null;
        p1 = head;

        /* Pick elements one by one */
        while(p1 != null && p1.next != null)
        {
            p2 = p1;

            /* Compare the picked element with rest 
                of the elements */
            while(p2.next != null)
            {
                /* If duplicate then delete it */
                if(p1.item == p2.next.item)
                {
                    /* sequence of steps is important here */
                    dup = p2.next;
                    p2.next = p2.next.next;
                    //System.gc();
                    size--;
                }
                else    /* This is tricky */
                {
                    p2 = p2.next;
                }
            }
            p1 = p1.next;
        }

        while(head != null)
        {
            System.out.println(head.item);
            head = head.next;
        }
    }

    public void kthToLast(int kth)
    {
        Node n = head;
        int i = 1;

        for(Node x = head; i <= size - kth; x = x.next)
        {
            if(x != null)
            {
                n = x;
                i++;
            }
        }

        if(head != null && kth < size)
        {
            System.out.println("Kth To Last is : " + n.item);
        }
    }

    pubic boolean removeNode(Node n)
    {
        if(n == null || n.next == null)
        {
            System.out.println("Please provide valid Node entry.");
            return false;
        }

        Node next = n.next;
        n.item = next.item;
        n.next = next.next;

        return true;
    }

    //tested with passing head
    public Node partition(Node node, int x)
    { // 1 -> 5 -> 8 -> 7 -> 4 -> 3 -> 10
        // 1 -> 3-> 4 -> 5 -> 7 -> 8 -> 10
        Node head = node;
        Node tail = node;

        while(node != null)
        {
            Node next = node.next;
            if(node.item >= x)
            {
                tail.next = node;
                tail = node;
            }else
            {
                node.next = head;
                head = node;
            }
            node = next;
        }
        tail.next = null;

        return head;
    }

    public static void main(String[] args)
    {
            SinglyLinkedList linkedList = new SinglyLinkedList();
            linkedList.add(1);
            linkedList.add(2);
            linkedList.add(3);
            linkedList.add(4);
            linkedList.add(5);

            linkedList.print(linkedList.head);

            System.out.println("Size : " + linkedList.size);

            //linkedList.removeDuplicates(linkedList);
            //linkedList.delete(3);
            //linkedList.removeDuplicates();
            //linkedList.kthToLast(7);
            //linkedList.removeNode();
            System.out.println("Size : " + linkedList.size);
    }
}