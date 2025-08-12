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


 public static async Task<List<string>> LoadCitiesByStateAsync(string state)
{
    List<string> cities = new List<string>();

    using (SqlConnection connection = new SqlConnection("connection string"))
    {
        await connection.OpenAsync();
        var command = new SqlCommand("SELECT name FROM City WHERE state = @stateName", connection);
        command.Parameters.Add("@stateName", SqlDbType.VarChar).Value = state;
        try
        {
            using (var reader = await command.ExecuteReaderAsync())
            {
                DataTable dt = new DataTable();
                dt.Load(reader);
                foreach (DataRow row in dt.Rows)
                {
                    cities.Add(row[0].ToString());
                }
            }
        }
        finally
        {
            connection.Close();
        }
    }

    return cities;
}


