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

		    var currentNode = source.First;
		    while (currentNode?.Next != null)
		    {
			Swap(currentNode, currentNode.Next);
			currentNode = currentNode.Next?.Next;
		    }
		    return source;
		}
		private static void Swap<T>(LinkedListNode<T> node1, LinkedListNode<T> node2)
		{
		    var temp = node1.Value;
		    node1.Value = node2.Value;
		    node2.Value = temp;
}


