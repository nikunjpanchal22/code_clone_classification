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
    
    PlcParam [] ppArray = array as PlcParam[];
    if (ppArray == null) 
        throw new ArgumentException();
    
    PlcParam [] newPpArray = (PlcParam[]) ppArray.Clone();
    
    ((ICollection<PlcParam>)this).CopyTo(newPpArray, index);
}
