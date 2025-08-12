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
    string searchValue = null;
    if (userInputControl is TextBox)
        searchValue = ((TextBox) userInputControl).Text;
    if (userInputControl is ComboBox)
        searchValue = ((ComboBox) userInputControl).Text;
    if (String.IsNullOrWhiteSpace (searchValue))
        return null;
    if (exactMatch) {
        command.Parameters.Add (new SqlParameter ("@Input_" + fieldName, searchValue));
        return fieldName + " = @Input_" + fieldName;
    } else {
        command.Parameters.Add (new SqlParameter ("@Input_" + fieldName, "%" + searchValue + "%"));
        return fieldName + " LIKE @Input_" + fieldName;
    }
}
