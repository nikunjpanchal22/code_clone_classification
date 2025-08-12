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
    if (index < 0 || index >= ppArray.Length)
        throw new IndexOutOfRangeException("Index is out of range");
    List<PlcParameter> list = new List<PlcParameter>(this.Length);
    int j = 0;
    for (int i = index; i < ppArray.Length; i++)
    {
        list.Add(this[j]);
        j++;
    }
    list.CopyTo(ppArray, 0);
}


