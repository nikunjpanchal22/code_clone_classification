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


	public static LinkedList < T > SwapPairwise < T > (this LinkedList < T > source) {
    if (source == null)
        throw new ArgumentNullException ("source");
    var current = source.First;
    if (current == null)
        return source;
    while (current != null && current.Next != null) {
        var next = current.Next;
        var temp = current.Value;
        source.Remove(current);
        source.Remove(current.Next);
        source.AddAfter(current, next);
        current = new LinkedListNode<T>(temp);
        source.AddBefore(next, current);
        current = current.Next;
    }
    return source;
}


