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
        throw new ArgumentNullException ("array");
    PlcParameter [] ppArray = array as PlcParameter [];
    if (ppArray == null)
        throw new ArgumentException ("Array should be of PlcParameter type");
    int itemIndex = 0;
    int arrayIndex = index;
    while (itemIndex < this.Count)
    {
        ppArray[arrayIndex] = this.ElementAt(itemIndex++) as PlcParameter;
        arrayIndex++;
    }
}


