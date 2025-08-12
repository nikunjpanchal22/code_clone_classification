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
        OracleConnection conn = SharedDataAccess.Connect();
        string queryString = "SELECT CityName FROM cities WHERE state = @state";
        OracleCommand cmd = new OracleCommand(queryString, conn);
        cmd.Parameters.AddWithValue("@state", state);
        OracleDataAdapter adapter = new OracleDataAdapter(cmd);
        DataTable dt = new DataTable();
        cmd.Fill(dt);
        foreach(DataRow row in dt.Rows)
        {
            cities.Add(row[0].ToString());
        }
        conn.Close();
        return cities;
    }

  public static List<string> LoadCitiesByState(string state)
    {
        List<string> cities = new List<string>();
        FirebirdConnection conn = SharedDataAccess.Connect();
        string queryString = "SELECT CityName FROM cities WHERE state = @state";
        FirebirdCommand cmd = new FirebirdCommand(queryString, conn);
        cmd.Parameters.AddWithValue("@state", state);
        FirebirdDataAdapter adapter = new FirebirdDataAdapter(cmd);
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
    MongoClient client = SharedDataAccess.Connect();
    var database = client.GetDatabase("my_database");
    var collection = database.GetCollection<BsonDocument>("cities");
    using (var cursor = await collection.FindAsync(new BsonDocument("state", state)))
    {
        while (await cursor.MoveNextAsync())
        {
            var batch = cursor.Current;
            foreach (var document in batch)
            {
                cities.Add(document["CityName"].ToString());
            }
        }
    }
    client.Dispose();
    return cities;
}


