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
    // create a string builder and list
    StringBuilder sb = new StringBuilder();
    List<string> contents = new List<string>();

    // cast expando as a dictionary
    IDictionary<string, object> dictExpando = expando as IDictionary<string, object>;

    // add opening bracket
    sb.Append("{");

    // iterate through each key and value
    foreach (KeyValuePair<string, object> kvp in dictExpando)
    {
        // add a serialized string of key and value to the list 
        contents.Add(string.Format("{0}: {1}", kvp.Key, JsonConvert.SerializeObject(kvp.Value)));
    }

    // join the contents together
    string strContents = string.Join(",", contents);

    // add the contents to the string builder
    sb.Append(strContents);

     // add closing bracket
    sb.Append("}");

    // return the result 
    return sb.ToString();
} 


