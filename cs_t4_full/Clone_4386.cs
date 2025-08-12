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
    sb.Append("{");

    var enumerable = expando as IDictionary<string, object>;
    int counter = 0;
    foreach (var pair in enumerable)
    {
        string val = JsonConvert.SerializeObject(pair.Value).ToString();
        if (counter < enumerable.Count() - 1)
            sb.Append($"{pair.Key}: {val},");
        else
            sb.Append($"{pair.Key}: {val}");
        counter++;
    }
    sb.Append("}");

    return sb.ToString();
}


