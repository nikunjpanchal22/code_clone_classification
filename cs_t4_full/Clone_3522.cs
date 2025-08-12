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




public static LinkedList<T> SwapPairwise<T>(this LinkedList<T> source)
	{
	    if (source == null) throw new ArgumentNullException("source");

	    LinkedListNode<T> current = source.First;
	    LinkedListNode<T> next;

	    while (current != null && current.Next != null)
	    {
		next = current.Next;
		current.Value = next.Value;
		next.Value = current.Value;

		current = next.Next;
	    }

	    return source;
}


