public class Test
{
    public static void main(String[] args)
    {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.linkLast(3);
        dll.linkLast(4);
        dll.linkLast(5);
        dll.linkLast(6);
        dll.linkFirst(7);

        dll.print(dll.first);
        dll.size();
        dll.delete(4, dll);

        dll.size();
    }
}