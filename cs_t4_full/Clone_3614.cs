private string CreateSqlFilter (string fieldName, Control userInputControl, SqlCommand command, bool exactMatch) {
    string searchValue = null;
    if (userInputControl is TextBox)
        searchValue = ((TextBox) userInputControl).Text;
    if (userInputControl is ComboBox)
        searchValue = ((ComboBox) userInputControl).Text;
    if (String.IsNullOrWhiteSpace (searchValue))
        return null;
    if (exactMatch) {
        command.Parameters.Add (new SqlParameter ("@" + fieldName, searchValue));
        return fieldName + " = @" + fieldName;
    } else {
        command.Parameters.Add (new SqlParameter ("@" + fieldName, "%" + searchValue + "%"));
        return fieldName + " LIKE @" + fieldName;
    }
}



 

private string CreateSqlFilter (string fieldName, Control userInputControl, SqlCommand command, bool exactMatch) {
    string searchValue = userInputControl.GetType() == typeof(TextBox) ? ((TextBox) userInputControl).Text : ((ComboBox) userInputControl).Text;
    if (string.IsNullOrEmpty(searchValue)) return null;
    command.Parameters.Add(new SqlParameter("@" + fieldName, exactMatch ? searchValue : "%" + searchValue + "%"));
    return fieldName + (exactMatch ? " = " : " LIKE ") + "@" + fieldName;
}


