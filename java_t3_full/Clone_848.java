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

	ListNode first = this, second = first.next;
	ListNode head = this.next;

	do{
	    ListNode temp = second.next;
	    second.next = first;
	    first.next = temp;

	    if(temp == null){
		break;
	    }
	    first = temp;
	    second = first.next;

	} while (second != null);

	return head; 
}


