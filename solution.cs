public class LinkedList
{
    private Node head;

    public void AddToLast(char data)
    {
        if (head == null)
        {
            head = new Node(data);
        }
        else
        {
            Node current = head;
            while (current.Next != null)
            {
                current = current.Next;
            }
            current.Next = new Node(data);
        }
    }
}