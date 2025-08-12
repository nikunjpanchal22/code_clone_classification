public boolean equals (Object object) {
    if (this == object) {
        return true;
    }
    if (object == null) {
        return false;
    }
    if (! (object instanceof CircularList < ? >)) {
        return false;
    }
    CircularList < ? > that = (CircularList < ? >) object;
    Element < ? > first0 = first;
    Element < ? > current0 = first0;
    Element < ? > first1 = that.first;
    Element < ? > current1 = first1;
    while (true) {
        if (equalSequence (current0, current0, current1, current1)) {
            return true;
        }
        current1 = current1.next;
        if (current1 == first1) {
            return false;
        }
    }
}



 

public boolean equals(Object obj) {
    if (this == obj)
        return true;
    if (obj == null || getClass() != obj.getClass())
        return false;

    CircularList<?> that = (CircularList<?>) obj;
    if (!Objects.equals(first, that.first))
        return false;

    return true;
}


