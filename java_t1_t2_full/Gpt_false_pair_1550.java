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


 	public boolean equals(Object object) { 
 		if (this == object) { 
 			return true; 
 		} 
 
 		if (object == null) { 
 			return false; 
 		} 
 
 		if (!(object instanceof CircularList<?>)) { 
 			return false; 
 		} 
 
 		CircularList<?> that = (CircularList<?>) object; 
 
 		Element<?> current0 = first; 
 		Element<?> current1 = that.first; 
 
 		while (true) { 
 			if (equalSequence(current0, current0, current1, current1)) { 
 				return true; 
 			} 
 
 			if (current1.next == first && current0.next == first) { 
 				return false; 
 			} 
 
 			current0 = current0.next; 
 			current1 = current1.next; 
 		} 
}
