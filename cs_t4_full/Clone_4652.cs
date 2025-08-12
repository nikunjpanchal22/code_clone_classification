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


  public static List < string > LoadCitiesByState (string state) {
    List < string > cities = new List < string > ();
    SqlConnection conn = SharedDataAccess.Connect();
    string queryString = "SELECT * FROM cities WHERE state = '"+state+"'";
    SqlCommand cmd = new SqlCommand(queryString, conn);
    SqlDataReader reader = cmd.ExecuteReader();
    while(reader.Read())
    {
        cities.Add((string)reader["CityName"]);
    }
    conn.Close();
    return cities;
}


