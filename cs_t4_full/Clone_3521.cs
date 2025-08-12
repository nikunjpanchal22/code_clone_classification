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
	    if (source.First != null)
	    {
		LinkedListNode<T> current = source.First;
		while (current != null && current.Next != null) 
		{
		    T temp = current.Value;
		    current.Value = current.Next.Value;
		    current.Next.Value = temp;
		}
		current = (current?.Next)?.Next;
	    }
	    return source;
}


