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
	    if (source.Count < 2) return source;

	    T temp;
	    for (var node = source.First; node != null && node.Next != null; node = node.Next.Next)
	    {
		temp = node.Value;
		node.Value = node.Next.Value;
		node.Next.Value = temp;
	    }

	    return source;
}


