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
    else if (x == null || y == null) 
        return false; 
    else if (x.Length != y.Length) 
        return false; 
    else 
    { 
        bool allEqual = true; 
        for (int i = 0; i < x.Length; i++) 
        { 
            if (x[i] != y[i]) 
            { 
                allEqual = false; 
                break; 
            } 
        } 
        return allEqual; 
    } 
}


