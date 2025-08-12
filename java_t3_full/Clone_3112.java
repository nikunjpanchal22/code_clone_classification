public int hashCode () {
    int hashCode = 1;
    Iterator i = iterator ();
    while (i.hasNext ()) {
        Object obj = i.next ();
        hashCode = 31 * hashCode + (obj == null ? 0 : obj.hashCode ());
    }
    return hashCode;
}



 

public int hashCode() {
    int hashCode = 1; 
    for(Object o: list.toArray()){
        hashCode = 31 * hashCode + (o == null ? 0 : o.hashCode());
    }
    return hashCode;
}


