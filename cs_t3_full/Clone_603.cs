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
    // Initialize the stringbuilder
    StringBuilder sb = new StringBuilder();

    // Convert expando object to dictionary
    IDictionary<string, object> dictExpando = expando as IDictionary<string, object>;

    // Add opening bracket
    sb.Append("{");

    // Iterate through each element
    foreach (KeyValuePair<string, object> kvp in dictExpando)
    {
        // Append key and serialized value to the stringbuilder
        sb.Append(string.Format("{0}: {1}", kvp.Key, JsonConvert.SerializeObject(kvp.Value)));

        // Append a comma for next entry
        sb.Append(",");
    }

    // Remove the last comma
    sb.Length--;

    // Append the closing bracket
    sb.Append("}");

    // Return the result
    return sb.ToString();
}


