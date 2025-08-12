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
	    if (source.First == null || source.First.Next == null) return source;

	    LinkedListNode<T> previous = null, current = source.First;

	    while (current != null && current.Next != null)
	    {
		var next = current.Next;
		current.Next = next.Next;
		next.Next = current;

		if (previous == null)
		    source.First = next;
		else
		    previous.Next = next;

		previous = current;
		current = current.Next;
	    }
	    return source;
}


