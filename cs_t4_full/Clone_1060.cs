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

    using (DbConnection connection = new SqlConnection("connection string"))
    {
        try
        {
            connection.Open();
            DataTable dt = SharedDataAccess.GetCities(state);

            foreach (DataRow row in dt.Rows)
            {
                cities.Add(row[0].ToString());
            }
        }
        catch
        {
            // log and/or handle exception
        }
        finally
        {
            if (connection != null)
            {
                connection.Close();
            }
        }

        return cities;
    }
}


