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
    // Initialize the string builder
    StringBuilder sb = new StringBuilder();

    // Convert expando object to dictionary
    var d = expando as IDictionary<string, object>;

    // Add opening bracket to the string builder
    sb.Append("{");

    // Iterate through each element
    foreach (KeyValuePair<string, object> kvp in d)
    {
        // Add key and serialized value to the string builder
        sb.Append(string.Format("{0}: {1}", kvp.Key, JsonConvert.SerializeObject(kvp.Value)));

        // Append a comma for next entry
        sb.Append(",");
    }

    // Remove the last comma
    sb.Length--;

    // Append closing bracket to the string builder
    sb.Append("}");

    // Return the result
    return sb.ToString();
}


