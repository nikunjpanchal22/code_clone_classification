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
    ulong bits = Convert.ToUInt64(value);
    List<Enum> results = new List<Enum>();

    while (bits != 0 && values.Length > 0)
    {
        uint highestValue = 0;
        int index = 0;
        int count = 0;

        // Find the highest value that is less than or equal to "bits"
        foreach (var item in values)
        {
            uint val = Convert.ToUInt32(item);
            if (val <= bits && val > highestValue)
            {
                highestValue = val;
                index = count;
            }
            count++;
        }

        // Watch for edge case where highest value is 0 and the array
        // only has 1 item
        if (values.Length == 1 && values[0] == 0)
            highestValue = 0;

        // Add highest value to results and subtract from "bits"
        if (highestValue > 0)
        {
            results.Add(values[index]);
            bits -= highestValue;
        }
    }

    if (bits != 0)
    {
        return Enumerable.Empty<Enum>();
    }

    if (Convert.ToUInt64(value) == 0 && values.Length > 0 && Convert.ToUInt64(values[0]) == 0)
    {
        return values.Take(1);
    }
    return results;
}


