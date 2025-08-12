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
    SqlParameter[] ssArray = array as SqlParameter[];
    if (ssArray == null)
        throw new ArgumentException();
    ((ICollection<SqlParameter>)this).CopyTo(ssArray, index);
}
