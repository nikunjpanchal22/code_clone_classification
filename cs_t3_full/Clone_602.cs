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


 public static string Flatten (this ExpandoObject expando)
{
    // Initialize the stringbuilder
    StringBuilder sb = new StringBuilder();

    // Convert expando object to dictionary
    var d = expando as IDictionary<string, object>;

    // Append opening bracket
    sb.Append("{");

    // Iterate through the expando object
    foreach (KeyValuePair<string, object> kvp in d)
    {
        // Add serialized values to the stringbuilder
        sb.Append(string.Format("{0}: {1}", kvp.Key, JsonConvert.SerializeObject(kvp.Value)));

        // Add a comma for next entry
        sb.Append(",");
    }
    
    // remove the last comma
    sb.Length--;

    // append the closing bracket
    sb.Append("}");

    // return the result
    return sb.ToString();
}


