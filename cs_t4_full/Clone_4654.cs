public bool Equals (int [] x, int [] y) {
    if (Object.ReferenceEquals (x, y))
        return true;
    if (Object.ReferenceEquals (x, null) || Object.ReferenceEquals (y, null))
        return false;
    if (x.Length != y.Length)
        return false;
    for (int i = 0; i < x.Length; i ++) {
        if (x [i] != y [i])
            return false;
    }
    return true;
}


 public bool Equals(int[]x, int[]y) 
{ 
    if (x == null && y == null) 
        return true; 
    else if (x == null || y == null || x.Length != y.Length) 
        return false; 
       
    int elementsEqual = 0; 
   
    for (int i = 0; i < x.Length; i++) 
    { 
        if (x[i] == y[i]) 
            elementsEqual++; 
    } 
   
    if (elementsEqual == y.Length) 
        return true; 
    else 
        return false; 
}


