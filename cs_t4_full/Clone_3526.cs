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

	    for(var pair = source.TakePairs(); pair.Any(); pair = source.TakePairs())
	    {
		var temp = pair.First.Value;
		pair.First.Value = pair.Second.Value;
		pair.Second.Value = temp;
	    }
	    return source;
}


