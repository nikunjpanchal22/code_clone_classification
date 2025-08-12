public ListNode switchPairs () {
    if (this == null || this.next == null) return this;
    ListNode top = this.next;
    ListNode first = this;
    ListNode second = first.next;
    do {
        ListNode third = second.next;
        second.next = first;
        first.next = third;
        first = third;
        System.out.println ("@@@ " + this.toString ());
        if (first != null) {
            second.next.next = first.next;
            second = first.next;
        }
    } while (first != null && second != null);
    return top;
}


 public ListNode switchPairs () {
	if (this == null || this.next == null) 
	    return this;
	ListNode current = this; 
	ListNode top = this.next; 

	while(current != null && current.next != null) { 
	    ListNode temp = current.next; 
	    current.next = temp.next; 
	    temp.next = current; 
	    current = current.next; 
	    System.out.println("@@@ " + this.toString());

	} 
	return top;
}


