void ICollection.CopyTo (Array array, int index) {
    if (array == null)
        throw new ArgumentNullException ("array");
    PlcParameter [] ppArray = array as PlcParameter [];
    if (ppArray == null)
        throw new ArgumentException ();
    ((ICollection < PlcParameter >) this).CopyTo (ppArray, index);
}





void ICollection.CopyTo (Array array, int index) {
		    CheckArrayIsNull(array);
		    PlcParameter [] ppArray = array as PlcParameter [];
		    CheckCopyToArray(ppArray, index);
		}

		void CheckArrayIsNull(Array array){
		    if (array == null)
			throw new ArgumentNullException ("array");
		}

		void CheckCopyToArray(PlcParameter [] ppArray, int index){
		    if (ppArray == null)
			throw new ArgumentException ();
		    else
			((ICollection < PlcParameter >) this).CopyTo (ppArray, index);
}


