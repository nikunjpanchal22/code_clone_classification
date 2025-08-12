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
    LinkedListNode<T> start = source.First;
    while (start != null && start.Next != null)
    {
        T temp = start.Value;
        start.Value = start.Next.Value;
        start.Next.Value = temp;
        start = start.Next.Next;
    }
}


