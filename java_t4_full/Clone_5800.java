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
    return Arrays.stream(array)
                 .mapToInt(v -> v == null ? 0 : v.hashCode())
                 .reduce(1, (acc, v) -> 31 * acc + v);
}


