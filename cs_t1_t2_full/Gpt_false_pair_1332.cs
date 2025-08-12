static void Main (string [] args) {
    ConnectionStringSettings csv = ConfigurationManager.ConnectionStrings ["csv"];
    List stats = new List ();
    using (OleDbConnection cn = new OleDbConnection (csv.ConnectionString))
    {
        cn.Open ();
        using (OleDbCommand cmd = cn.CreateCommand ())
        {
            cmd.CommandText = "SELECT * FROM [Stats.csv]";
            cmd.CommandType = CommandType.Text;
            using (OleDbDataReader reader = cmd.ExecuteReader (CommandBehavior.CloseConnection))
            {
                int fieldSport = reader.GetOrdinal ("sport");
                int fieldDate = reader.GetOrdinal ("date");
                int fieldTeamOne = reader.GetOrdinal ("teamone");
                int fieldTeamTwo = reader.GetOrdinal ("teamtwo");
                int fieldScore = reader.GetOrdinal ("score");
                foreach (DbDataRecord record in reader) {
                    stats.Add (new Stat {Sport = record.GetString (fieldSport), Date = record.GetDateTime (fieldDate), TeamOne = record.GetString (fieldTeamOne), TeamTwo = record.GetString (fieldTeamTwo), Score = record.GetInt32 (fieldScore)});
                }
            }}} foreach (Stat stat in stats) {
        Console.WriteLine ("Sport: {0}", stat.Sport);
    }
}


 static void Main (string [] args) {
    ConnectionStringSettings csv = ConfigurationManager.ConnectionStrings ["csv"];
    List<object> stats = new List<object> ();
    using (OdbcConnection cn = new OdbcConnection (csv.ConnectionString))
    {
        cn.Open ();
        using (OdbcCommand cmd = cn.CreateCommand ())
        {
            cmd.CommandText = "SELECT * FROM [Stats.csv]";
            cmd.CommandType = CommandType.Text;
            using (OdbcDataReader reader = cmd.ExecuteReader (CommandBehavior.CloseConnection))
            {
                int fieldSport = reader.GetOrdinal ("sport");
                int fieldDate = reader.GetOrdinal ("date");
                int fieldTeamOne = reader.GetOrdinal ("teamone");
                int fieldTeamTwo = reader.GetOrdinal ("teamtwo");
                int fieldScore = reader.GetOrdinal ("score");
                foreach (DbDataRecord record in reader) {
                    stats.Add (new Stat {Sport = record.GetString (fieldSport), Date = record.GetDateTime (fieldDate), TeamOne = record.GetString (fieldTeamOne), TeamTwo = record.GetString (fieldTeamTwo), Score = record.GetInt32 (fieldScore)});
                }
            }}} foreach (Stat stat in stats) {
        UILabel.Text = stat.Sport;
    }
}
