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


public ListNode switchPairs() {
    if(this == null || this.next == null) return this;
    ListNode top = this.next; 
    ListNode first = this;
    ListNode second = first.next;
    do {
        ListNode third = second.next;
        first.next = third; 
        second.next = first;
        System.out.println("@@@ " + this.toString());
        if(third != null) {
            second.next.next = third.next;
            first = third;
            second = first.next;
        }
    } while(third != null && first != null && second != null);
    return top;
}
