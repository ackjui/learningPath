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

    public Node removeDuplicates(SinglyLinkedList sll)
    {
        HashSet<Integer> hashSet = new HashSet<Integer>();
        Node n = sll.head;
        Node prev = null;

        while(n != null)
        {
            if(hashSet.contains(n.item))
            {
                prev.next = n.next;
                size--;
            }else
            {
                hashSet.add(n.item);
                prev = n;
            }
            n = n.next;
        }
        return prev;
    } 

    public static void main(String[] args)
    {
            SinglyLinkedList linkedList = new SinglyLinkedList();
            linkedList.add(1);
            linkedList.add(2);
            linkedList.add(2);
            linkedList.add(4);
            linkedList.add(5);

            linkedList.print(linkedList.head);

            System.out.println("Size : " + linkedList.size);

            //linkedList.removeDuplicates(linkedList);
            //linkedList.delete(3);
            linkedList.print(linkedList.removeDuplicates(linkedList));
            System.out.println("Size : " + linkedList.size);
    }
}