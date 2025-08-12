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
        var previous = current.Previous;
        current.Next = current.Previous;
        current.Previous = next;
        if (previous != null) {
            previous.Next = next;
        }
        if (next != null) {
           next.Previous = previous;
        }
        current = current.Next.Next;
    }
    return source;
}


