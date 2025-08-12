public static List < string > LoadCitiesByState (string state) {
    List < string > cities = new List < string > ();
    try {
        DataTable dt = SharedDataAccess.GetCities (state);
    }
    catch {
    }
    foreach (DataRow row in dt.Rows) {
        cities.Add (row [0].ToString ());
    }
    return cities;
}


 public static List<string> LoadCitiesByState(string state)
{
    List<string> cities = new List<string>();

    using (SqlConnection sqlConnection = new SqlConnection("connection string"))
    {
        SqlCommand sqlCommand = new SqlCommand()
        {
            Connection = sqlConnection,
            CommandType = CommandType.StoredProcedure,
            CommandText = "GetCitiesByState"
        };

        try
        {
            sqlConnection.Open();
            var reader = sqlCommand.ExecuteReader();
            DataTable dt = new DataTable();
            dt.Load(reader);

            foreach (DataRow row in dt.Rows)
            {
                cities.Add(row[0].ToString());
            }
        }
        finally
        {
            if(sqlConnection.State == ConnectionState.Open)
            {
                sqlConnection.Close();
            }
        }
    }
    return cities;
}


