public int Compare (Level x, Level y) {
    if (object.ReferenceEquals (x, y))
        return 0;
    if (x == null)
        return 1;
    else if (y == null)
        return - 1;
    return x.LevelID.CompareTo (y.LevelID);
}


 public int Compare(Level x, Level y) 
{ 
    int compareResult; 
  
    if (object.ReferenceEquals(x, y)) 
        compareResult = 0; 
    else if (x == null || y == null) 
        compareResult = (x == null) ? 1 : -1; 
    else 
        compareResult = x.LevelID.CompareTo(y.LevelID); 
  
    return compareResult; 
} 


