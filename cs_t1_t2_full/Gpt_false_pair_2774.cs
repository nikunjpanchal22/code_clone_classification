public override object ReadJson (JsonReader reader, Type objectType, object existingValue, JsonSerializer serializer) {
    var obj = JToken.ReadFrom (reader);
    if (objectType == typeof (Dictionary < string, TValue >)) {
        var comparer = obj.Value < string > ("Comparer");
        Dictionary < string, TValue > result;
        if (comparer == "OrdinalIgnoreCase") {
            result = new Dictionary < string, TValue > (StringComparer.OrdinalIgnoreCase);
        } else {
            result = new Dictionary < string, TValue > ();
        }
        obj ["Comparer"].Parent.Remove ();
        serializer.Populate (obj.CreateReader (), result);
        return result;
    }
    return obj.ToObject (objectType);
}


public override object ReadJson (JsonReader reader, Type objectType, object existingValue, JsonSerializer serializer) {
    var obj = JToken.ReadFrom (reader);
    if (objectType == typeof (Dictionary < string, TValue >)) {
        var comparer = obj.Value < string > ("Comparer");
        Dictionary < string, TValue > result;
        if (comparer == "OrdinalIgnoreCase") {
            result = new Dictionary < string, TValue > (StringComparer.OrdinalIgnoreCase);
        } else {
            result = new Dictionary < string, TValue > (StringComparer.Ordinal);
        }
        obj ["Comparer"].Parent.Remove ();
        serializer.Populate (obj.CreateReader (), result);
        return result;
    }
    return obj.ToObject (objectType);
}
