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
    List < string > cities = new List<string>();
    DataTable dt = null;
    try 
    {
        dt = SharedDataAccess.GetCities (state);
    }
    catch
    {
        // log/handle errors
    }
    foreach (DataRow row in dt.Rows)
    {
        cities.Add(row[0].ToString());
    }
    return cities;
}
