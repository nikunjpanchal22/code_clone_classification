static IEnumerable < double > TopNSorted (this IEnumerable < double > source, int n) {
    List < double > top = new List < double > (n + 1);
    using (var e = source.GetEnumerator ())
    {
        for (int i = 0; i < n; i ++) {
            if (e.MoveNext ())
                top.Add (e.Current);
            else
                throw new InvalidOperationException ("Not enough elements");
        }
        top.Sort ();
        while (e.MoveNext ()) {
            double c = e.Current;
            int index = top.BinarySearch (c);
            if (index < 0)
                index = ~ index;
            if (index < n) {
                top.Insert (index, c);
                top.RemoveAt (n);
            }
        }
    } return top;
}


 static IEnumerable<double> TopNSorted(this IEnumerable<double> source, int n)
{
    List<double> top = new List<double>(n + 1);
    using (var e = source.GetEnumerator())
    {
        while (e.MoveNext())
        {
            double c = e.Current;
            if (top.Count < n)
            {
                top.Add(c);
                top.Sort();
            }
            else
            {
                if (top[n - 1] < c)
                {
                    top.RemoveAt(n - 1);
                    top.Add(c);
                    top.Sort(0, top.Count, null);
                }
            }
        }
    }
    return top;
}


