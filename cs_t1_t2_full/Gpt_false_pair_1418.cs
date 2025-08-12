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
    var table_attrs = tableType.GetCustomAttributes (typeof (DescriptionAttribute), false);
    if (table_attrs != null && table_attrs.Length > 0)
        SetTableDescription (tableName, ((DescriptionAttribute) table_attrs [0]).Description);
    foreach (var prop in tableType.GetProperties (System.Reflection.BindingFlags.Public | System.Reflection.BindingFlags.Instance)) {
        if (prop.PropertyType.IsClass && prop.PropertyType != typeof (string))
            continue;
        var attrs = prop.GetCustomAttributes (typeof (DescriptionAttribute), false);
        if (attrs != null && attrs.Length > 0)
            SetColumnDescription (tableName, prop.Name, ((DescriptionAttribute) attrs [0]).Description);
    }
}


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
    object[] descriptionAttributes = tableType.GetCustomAttributes(typeof(DescriptionAttribute), false);
    if (descriptionAttributes.Length > 0) {
        var descriptionAttribute = (DescriptionAttribute)descriptionAttributes[0];
        SetTableDescription(tableName, descriptionAttribute.Description);
    }
    foreach (var prop in tableType.GetProperties (System.Reflection.BindingFlags.Public | System.Reflection.BindingFlags.Instance)) {
        if (prop.PropertyType.IsClass && prop.PropertyType != typeof (string))
            continue;
        var attrs = prop.GetCustomAttributes (typeof (DescriptionAttribute), false);
        if (attrs != null && attrs.Length > 0)
            SetColumnDescription (tableName, prop.Name, ((DescriptionAttribute) attrs [0]).Description);
    }
}
