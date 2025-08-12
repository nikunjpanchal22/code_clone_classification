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
    string searchValue = "";
    switch(userInputControl){
        case TextBox tb:
        searchValue = tb.Text;
        break;
        case ComboBox cb:
        searchValue = cb.Text;
        break;
    }
    if (string.IsNullOrEmpty(searchValue)) return null;
    string paramName = "@" + fieldName;
    command.Parameters.AddWithValue(paramName, exactMatch ? searchValue : "%" + searchValue + "%");
    return fieldName + (exactMatch ? " = " : " LIKE ") + paramName;
}


