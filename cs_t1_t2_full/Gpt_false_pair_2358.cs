public static string Debugify (this DbParameterCollection parameters) {
    List < string > ParameterValuesList = new List < string > ();
    foreach (DbParameter Parameter in parameters) {
        string ParameterName, ParameterValue;
        ParameterName = Parameter.ParameterName;
        if (Parameter.Direction == ParameterDirection.ReturnValue)
            continue;
        if (Parameter.Value == null || Parameter.Value.Equals (DBNull.Value))
            ParameterValue = "NULL";
        else {
            switch (Parameter.DbType) {
                case DbType.String : case DbType.Date : case DbType.DateTime : case DbType.Guid : case DbType.Xml :
                    ParameterValue = "'" + Parameter.Value.ToString ().Replace (Environment.NewLine, "").Left (80, "...") + "'";
                    break;
                default :
                    ParameterValue = Parameter.Value.ToString ();
                    break;
            }
            if (Parameter.Direction != ParameterDirection.Input)
                ParameterValue += " " + Parameter.Direction.ToString ();
        }
        ParameterValuesList.Add (string.Format ("{0}={1}", ParameterName, ParameterValue));
    }
    return string.Join (", ", ParameterValuesList.ToArray ());
}


 public static string Debugify (this DbParameterCollection parameters) {
    StringBuilder parameterValues = new StringBuilder();

    foreach (DbParameter Parameter in parameters) {
        if (Parameter.Direction == ParameterDirection.ReturnValue)
            continue;

        string paramName = Parameter.ParameterName;
        string paramValue;

        if (Parameter.Value == null || Parameter.Value.Equals (DBNull.Value))
            paramValue = "NULL";
        else {
            switch (Parameter.DbType) {
                case DbType.String : case DbType.Date : case DbType.DateTime : case DbType.Guid : case DbType.Xml :
                    paramValue = "'" + Parameter.Value.ToString ().Replace (Environment.NewLine, "").Left (80, "...") + "'";
                    break;
                default :
                    paramValue = Parameter.Value.ToString ();
                    break;
            }
            if (Parameter.Direction != ParameterDirection.Input)
                paramValue += " " + Parameter.Direction.ToString ();
        }

        parameterValues.AppendFormat("{0}={1}, ", paramName, paramValue);
    }
    return parameterValues.ToString().TrimEnd(',', ' ');
}
