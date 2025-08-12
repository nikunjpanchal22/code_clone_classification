public static string Flatten (this ExpandoObject expando) {
    StringBuilder sb = new StringBuilder ();
    List < string > contents = new List < string > ();
    var d = expando as IDictionary < string, object >;
    sb.Append ("{");
    foreach (KeyValuePair < string, object > kvp in d) {
        contents.Add (String.Format ("{0}: {1}", kvp.Key, JsonConvert.SerializeObject (kvp.Value)));
    }
    sb.Append (String.Join (",", contents.ToArray ()));
    sb.Append ("}");
    return sb.ToString ();
}


 public static string Flatten(this ExpandoObject expando)
{
    StringBuilder sb = new StringBuilder();
    List <string> contents = new List<string>();
    foreach (var item in expando)
    {
        var entry = (DictionaryEntry)item;
        sb.Append(JsonConvert.SerializeObject(entry.Key));
        sb.Append(":");
        sb.Append(JsonConvert.SerializeObject(entry.Value));
        contents.Add(sb.ToString());
        sb.Clear();
    }
    return string.Format("{{{0}}}", string.Join(",", contents.ToArray()));
}


