private static IEnumerable < Enum > GetFlags (Enum value, Enum [] values) {
    ulong bits = Convert.ToUInt64 (value);
    List < Enum > results = new List < Enum > ();
    for (int i = values.Length - 1; i >= 0; i --) {
        ulong mask = Convert.ToUInt64 (values [i]);
        if (i == 0 && mask == 0L)
            break;
        if ((bits & mask) == mask) {
            results.Add (values [i]);
            bits -= mask;
        }
    }
    if (bits != 0L)
        return Enumerable.Empty < Enum > ();
    if (Convert.ToUInt64 (value) != 0L)
        return results.Reverse < Enum > ();
    if (bits == Convert.ToUInt64 (value) && values.Length > 0 && Convert.ToUInt64 (values [0]) == 0L)
        return values.Take (1);
    return Enumerable.Empty < Enum > ();
}




  private static IEnumerable<Enum> GetFlags(Enum value, Enum[] values)
{
    int bits = Convert.ToInt32(value);
    List<Enum> results = new List<Enum>();

    for(int i = 0; i < values.Length && bits != 0; i++)
    {
        if((bits & (int)values[i]) != 0)
        {
            results.Add(values[i]);
            bits &= ~((int)values[i]);
        }
    }

    if (bits != 0)
    {
        return Enumerable.Empty<Enum>();
    }

    if (Convert.ToInt32(value) == 0 && values.Length > 0 && Convert.ToInt32(values[0]) == 0)
    {
        return values.Take(1);
    }

    return results;
} 


