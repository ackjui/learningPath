public class DoublyLinkedList{

    int size = 0;
    Node first;
    Node last;

    public DoublyLinkedList()
    {}

    private static class Node {
        int item;
        Node next;
        Node prev;

        Node (Node prev, int item, Node next)
        {
            this.item = item;
            this.prev = prev;
            this.next = next;
        }
    }

    public void linkFirst(int item)
    {
        Node f = first; 
        Node newNode = new Node(null, item, f);

        first = newNode;
        if(f == null)
        {   
            last = newNode;
        }else
        {
            f.prev = newNode;
        }
        size++;
    }

    public void linkLast(int item)
    {
        Node l = last;
        Node newNode = new Node(l, item, null);

        last = newNode;
        if(l == null)
        {
            first = newNode;
        }else
        {
            l.next = newNode;
        }
        size++;
    }

    public void size()
    {
        System.out.println("Size: " + this.size);
    }

    static void print(Node first)
    {
        while(first != null)
        {
            System.out.println(first.item);
            first = first.next;
        }
    }

    public void delete(int item, DoublyLinkedList dll)
    {
        for(Node n = dll.first; n != null; n = n.next)
        {
            if(n.item == item)
            {
                unlink(n);
                System.out.println("Deleted : " + item);
            }
        }

        Node list = dll.first;
        while(list != null)
        {
            System.out.println(list.item);
            list = list.next;
        }
        size--;
    }

    private void unlink(Node n) {
        final Node prev = n.prev;
        final Node next = n.next;

        if(prev == null)
        {
            first = next;
        }
        else
        {
            prev.next = next;
            n.prev = null;
        }

        if(next == null)
        {
            last = prev;
        }else
        {
            next.prev = prev;
            n.next = null;
        }
    }
}