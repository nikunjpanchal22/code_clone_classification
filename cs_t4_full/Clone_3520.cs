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

	    LinkedListNode<T> previous = null;
	    LinkedListNode<T> current = source.First;
	    while (current != null && current.Next != null)
	    {
		if (previous != null)
		    previous.Next = current.Next;
		else
		    source.First = current.Next;

		LinkedListNode<T> nextItem = current.Next.Next;
		current.Next.Next = current;
		current.Next = nextItem;
		previous = current;
		current = nextItem;
	    }
	    return source;
}


