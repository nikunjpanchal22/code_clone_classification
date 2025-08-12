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
   StringBuilder sb = new StringBuilder();
   List<string> listOfContents = new List<string>();

   // convert expando object to dictionary 
   IDictionary<string, object> dictExpando = expando as IDictionary<string, object>;
   
   // add opening bracket 
   sb.Append("{");

   // iterate through each key value pair
   foreach (KeyValuePair<string, object> kvp in dictExpando)
   {
       // add the key and serialized value to the list
       listOfContents.Add(string.Format("{0}: {1}", kvp.Key, JsonConvert.SerializeObject(kvp.Value)));
   }

   // join all the list elements to a single string
   string strContents = string.Join(",", listOfContents.ToArray());
   
   // append the string to stringbuilder
   sb.Append(strContents);

   // add closing bracket
   sb.Append("}");

   // return the result
   return sb.ToString();
}


