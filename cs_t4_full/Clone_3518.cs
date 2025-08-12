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

	    LinkedListNode<T> node1 = source.First;
	    LinkedListNode<T> node2 = node1.Next;
	    T temp = default(T);

	    while (node2 != null)
	    {
		temp = node1.Value;
		node1.Value = node2.Value;
		node2.Value = temp;

		if (node2.Next == null) break;
		node1 = node2.Next;
		node2 = node1.Next;
	    }
	    return source;
}


