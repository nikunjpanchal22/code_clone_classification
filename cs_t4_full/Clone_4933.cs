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


	public static LinkedList<T> SwapPairs<T>(this LinkedList<T> source)
{
    if (source == null)
    {
        throw new ArgumentNullException("source");
    }

    LinkedListNode<T> currentNode = source.First;
    if (currentNode == null)
    {
        return source;
    }

    while (currentNode != null && currentNode.Next != null)
    {
        T temp = currentNode.Value;
        currentNode.Value = currentNode.Next.Value;
        currentNode.Next.Value = temp;
        currentNode = currentNode.Next.Next;
    }
    return source;
}


