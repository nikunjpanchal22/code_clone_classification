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
    // create the stringbuilder
    StringBuilder sb = new StringBuilder();

    // cast the expandoobject to a dictionary
    IDictionary<string, object> dictExpando = expando as IDictionary<string, object>;

    // append the opening bracket
    sb.Append("{");

    // iterate through each element
    foreach (KeyValuePair<string, object> kvp in dictExpando)
    {
        // add the key and serialized value to the stringbuilder
        sb.Append(string.Format("{0}: {1}", kvp.Key, JsonConvert.SerializeObject(kvp.Value)));

        // add a comma for next element
        sb.Append(",");
    }

    // remove the last comma
    sb.Length--;

    // append the closing bracket
    sb.Append("}");

    // return the result 
    return sb.ToString();
}


