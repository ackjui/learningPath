import java.util.HashSet;

public class RemoveDuplicates
{
    public SinglyLinkedList removeDuplicates(Node sll)
    {
        HashSet<Integer> hashSet = new HashSet<Integer>();
        SinglyLinkedList prev = null;

        while(sll != null)
        {
            if(hashSet.contains(sll.item))
            {
                prev.next = sll.next;
            }else
            {
                hashSet.add(sll.item);
                prev = sll;
            }
            sll = sll.next;
        }
        return prev;
    }
}