void ICollection.CopyTo (Array array, int index) {
    if (array == null)
        throw new ArgumentNullException ("array");
    PlcParameter [] ppArray = array as PlcParameter [];
    if (ppArray == null)
        throw new ArgumentException ();
    ((ICollection < PlcParameter >) this).CopyTo (ppArray, index);
}


 void ICollection.CopyTo (Array array, int index) {
    if (array == null)
        throw new ArgumentNullException("array");
    PlcParameter[] ppArray = array as PlcParameter[];
    if (ppArray == null)
        throw new ArgumentException("Argument is not of type PlcParameter.");
    int j = 0;
    for (int i = index; i < array.Length; i ++) {
        ppArray[i] = this[j];
        j++;
    }
}


