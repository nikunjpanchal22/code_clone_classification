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
    return IntStream.range(0, array.length).map(i -> Objects.hashCode(array[i])).reduce(1, (a, b) -> 31 * a + b);
}


