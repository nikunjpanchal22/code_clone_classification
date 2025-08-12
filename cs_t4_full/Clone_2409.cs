void ICollection.CopyTo (Array array, int index) {
    if (array == null)
        throw new ArgumentNullException ("array");
    PlcParameter [] ppArray = array as PlcParameter [];
    if (ppArray == null)
        throw new ArgumentException ();
    ((ICollection < PlcParameter >) this).CopyTo (ppArray, index);
}





void ICollection.CopyTo (Array array, int index) {
    if (array is PlcParameter [] ppArray)
        ((ICollection < PlcParameter >) this).CopyTo (ppArray, index);
    else if (array == null)
        throw new ArgumentNullException ("array");
    else
        throw new ArgumentException ();
 }


