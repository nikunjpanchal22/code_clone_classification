private void SetTableDescriptions (Type tableType) {
    string fullTableName = context.GetTableName (tableType);
    Regex regex = new Regex (@"(\[\w+\]\.)?\[(?<table>.*)\]");
    Match match = regex.Match (fullTableName);
    string tableName;
    if (match.Success)
        tableName = match.Groups ["table"].Value;
    else
        tableName = fullTableName;
    var tableAttrs = tableType.GetCustomAttributes (typeof (TableAttribute), false);
    if (tableAttrs.Length > 0)
        tableName = ((TableAttribute) tableAttrs [0]).Name;
    foreach (var prop in tableType.GetProperties (System.Reflection.BindingFlags.Public | System.Reflection.BindingFlags.Instance)) {
        if (prop.PropertyType.IsClass && prop.PropertyType != typeof (string))
            continue;
        var attrs = prop.GetCustomAttributes (typeof (DisplayAttribute), false);
        if (attrs.Length > 0)
            SetColumnDescription (tableName, prop.Name, ((DisplayAttribute) attrs [0]).Name);
    }
}


private void SetTableDescriptions (Type tableType) {
    string fullTableName = context.GetTableName (tableType);

    string pattern = @"(\[\w+\]\.)?\[(?<table>.*)\]";
    Regex regex = new Regex (pattern);
    Match match = regex.Match (fullTableName);

    string tableName;

    if (match.Success)
        tableName = match.Groups ["table"].Value;
    else
        tableName = fullTableName;
    
    var tableAttrs = tableType.GetCustomAttributes (typeof (TableAttribute), false);
    
    if (tableAttrs.Length > 0)
        tableName = ((TableAttribute) tableAttrs [0]).Name;
    
    foreach (var prop in tableType.GetProperties (System.Reflection.BindingFlags.Public | System.Reflection.BindingFlags.Instance)) {
        if (prop.PropertyType.IsClass && prop.PropertyType != typeof (string))
            continue;
        
        var attrs = prop.GetCustomAttributes (typeof (DisplayAttribute), false);
        
        if (attrs.Length > 0)
            SetColumnDescription (tableName, prop.Name, ((DisplayAttribute) attrs [0]).Name);
    }
}
