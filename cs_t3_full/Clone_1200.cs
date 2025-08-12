public static int Count < TSource > (this IEnumerable < TSource > source) {
    checked {
        if (source == null) {
            throw Error.ArgumentNull ("source");
        }
        ICollection < TSource > collection = source as ICollection < TSource >;
        if (collection != null) {
            return collection.Count;
        }
        ICollection collection2 = source as ICollection;
        if (collection2 != null) {
            return collection2.Count;
        }
        int num = 0;
        using (IEnumerator < TSource > enumerator = source.GetEnumerator ())
        {
            while (enumerator.MoveNext ()) {
                num ++;
            }
        } return num;
    }
}


 public static int Count<TSource>(IEnumerable<TSource> source)
    {
        if(source == null) throw new System.ArgumentNullException("source");

        ICollection<TSource> collection = source as ICollection<TSource>;
        if(collection != null) {
            return collection.Count;
        }

        ICollection collection2 = source as ICollection;
        if (collection2 != null) {
            return collection2.Count;
        }
        
        int count = 0;
        IEnumerator<TSource> sourceEnumn = source.GetEnumerator();

        while(sourceEnumn.MoveNext())
        {
            checked { count++; }
        }
        return count;
}


