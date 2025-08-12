public string Export () {
    StringBuilder sb = new StringBuilder ();
    foreach (string field in fields)
        sb.Append (field).Append (delim);
    sb.AppendLine ();
    foreach (Dictionary < string, object > row in rows) {
        foreach (string field in fields)
            sb.Append (MakeValueCsvFriendly (row [field])).Append (delim);
        sb.AppendLine ();
    }
    return sb.ToString ();
}


 public string Export(){
   StringBuilder sb = new StringBuilder();
    foreach(string field in fields){
        sb.AppendFormat("{0}{1}", field, delim);
    }
    sb.AppendLine();
    foreach(Dictionary<string, object> row in rows) {
        foreach(string field in fields) 
            sb.AppendFormat("{0}{1}", MakeValueCsvFriendly(row[field]), delim);
    
        sb.AppendLine();
    }

    return sb.ToString();
}  

 public String Export(){
    StringBuilder sb = new StringBuilder();

    // Append all the fields 
    foreach(string field in fields){
        sb.Append(field).Append(delim);
    }
    sb.AppendLine();

    // Append all the rows
    foreach(Dictionary<string, object> row in rows){
        string[] arm = new string[fields.Length];
        for(int i=0;i<fields.Length;i++){
            arm[i] = MakeValueCsvFriendly(row[fields[i]]);
        }
        sb.Append((String.Join(delim, arm))).Append(delim).AppendLine();
    }
    return sb.ToString();
}


