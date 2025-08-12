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
    if (object.ReferenceEquals(x, y)) 
        return 0; 
  
    if (x == null || y == null) 
        return x == null ? 1 : -1; 
  
    return x.LevelID.CompareTo(y.LevelID); 
} 


