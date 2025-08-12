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



public bool Equals (Shape s) {
   Array.Sort(this.coordinate);
   Array.Sort(s.coordinate);
   return this.coordinate.SequenceEqual(s.coordinate);
}


