public static LinkedList < T > SwapPairwise < T > (this LinkedList < T > source) {
    if (source == null)
        throw new ArgumentNullException ("source");
    var current = source.First;
    if (current == null)
        return source;
    while (current.Next != null) {
        current.SwapWith (current.Next);
        current = current.Next;
        if (current != null)
            current = current.Next;
    }
    return source;
}


	public static void SwapPairwise<T>(LinkedList<T> source)
{
    if (source == null)
        throw new ArgumentNullException("source");
    LinkedListNode<T> fast = source.First;
    LinkedListNode<T> slow = source.First;

    while (slow.Next != null && fast.Next != null)
    {
        T temp = slow.Value;
        slow.Value = fast.Next.Value;
        fast.Next.Value = temp;
        slow = slow.Next.Next;
        fast = fast.Next.Next;
    }
}


