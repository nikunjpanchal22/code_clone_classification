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
        if (next.Next == null) {
            next.Next = current;
            current.Next = null;
            current.Previous = next;
        }
        else {
            current.Next = next.Next;
            current.Previous = next;
            next.Next = current;
            next.Previous = current.Previous;
            current = current.Previous;
        }
        current = current.Next;
    }
    return source;
}


