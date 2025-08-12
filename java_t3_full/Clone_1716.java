public int hashCode () {
    int hashCode = 1;
    Iterator i = iterator ();
    while (i.hasNext ()) {
        Object obj = i.next ();
        hashCode = 31 * hashCode + (obj == null ? 0 : obj.hashCode ());
    }
    return hashCode;
}


 public int hashCode () {int hashCode = 0;
    Iterator i = iterator ();
    while (i.hasNext ()) {
        Object obj = i.next ();
        int m = obj == null ? 0 : obj.hashCode ();
        hashCode = (hashCode * 33) + m;
    }
    return hashCode;
}


