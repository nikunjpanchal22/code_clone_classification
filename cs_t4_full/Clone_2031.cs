public bool Equals (Shape s) {
    int count = 0;
    int [] temp1 = new int [this.coordinate.Length];
    foreach (int x in this.coordinate)
        temp1 [count ++] = x;
    count = 0;
    int [] temp2 = new int [s.coordinate.Length];
    foreach (int x in s.coordinate)
        temp2 [count ++] = x;
    return temp1.SequenceEqual (temp2);
}


 public bool Equals (Shape s) 
{
   for (int i = 0; i < this.coordinate.Length; i++) 
    {
        if (this.coordinate[i] != s.coordinate[i]) 
            return false;
    }
    if (this.coordinate.Length == s.coordinate.Length)
        return true;
    else
        return false;
}


