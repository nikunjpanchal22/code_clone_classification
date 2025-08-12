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
        MySqlConnection conn = SharedDataAccess.Connect();
        string queryString = "SELECT * FROM cities WHERE state = @state";
        MySqlCommand cmd = new MySqlCommand(queryString, conn);
        cmd.Parameters.AddWithValue("@state", state);
        MySqlDataReader reader = cmd.ExecuteReader();
        while(reader.Read())
        {
            cities.Add(reader["CityName"].ToString());
        }
        conn.Close();
        return cities;
    }

  public static List<string> LoadCitiesByState(string state)
    {
        List<string> cities = new List<string>();
        OleDbConnection conn = SharedDataAccess.Connect();
        string queryString = "SELECT * FROM cities WHERE state = @state";
        OleDbCommand cmd = new OleDbCommand(queryString, conn);
        cmd.Parameters.AddWithValue("@state", state);
        OleDbDataAdapter adapter = new OleDbDataAdapter(cmd);
        DataTable dt = new DataTable();
        cmd.Fill(dt);
        foreach(DataRow row in dt.Rows)
        {
            cities.Add(row[0].ToString());
        }
        conn.Close();
        return cities;
    }

  public static List < string > LoadCitiesByState (string state) {
    List < string > cities = new List < string > ();
    NpgsqlConnection conn = SharedDataAccess.Connect();
    string queryString = "SELECT * FROM cities WHERE state = @state";
    NpgsqlCommand cmd = new NpgsqlCommand(queryString, conn);
    cmd.Parameters.AddWithValue("@state", state);
    NpgsqlDataReader reader = cmd.ExecuteReader();
    while(reader.Read())
    {
        cities.Add(reader["CityName"].ToString());
    }
    conn.Close();
    return cities;
}


