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


public static string Flatten(this ExpandoObject expando) {
    // create stringbuilder
    StringBuilder sb = new StringBuilder();

    // convert expando to dictionary
    var d = expando as IDictionary<string, object>;

    // add opening bracket
    sb.Append("{");

    // iterate through each key value pair
    foreach (KeyValuePair<string, object> kvp in d)
    {
        // add key and serialized value to stringbuilder
        sb.Append(string.Format("{0}: {1}", kvp.Key, JsonConvert.SerializeObject(kvp.Value)));

        // add a comma for next entry 
        sb.Append(",");
    }

    // remove the last comma
    sb.Length--;

    // add closing bracket
    sb.Append("}");

    // return the result
    return sb.ToString();
}


