public K remove () {
    if (head == null) return null;
    K val = head.value;
    if (head.next == null) {
        head = null;
        tail = null;
    } else {
        head = head.next;
        head.prev = null;
    }
    return val;
}


 public K remove () { if (head != null) 
    {
        K value = head.value;
        if (head == tail) 
        {
            head = null;
            tail = null;
        }
        else 
        {
            head = head.next;
            head.prev = null;
        }
        return value;
    }
    return null;
}


