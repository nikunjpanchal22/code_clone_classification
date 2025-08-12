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
    PlcParameter [] ppArray = array.ConvertAll(x => (PlcParameter) x).ToArray();
    if (ppArray == null)
        throw new ArgumentException ("Array should be of PlcParameter type");
    Array.Copy(this.ToArray(),ppArray,this.Count);
}


