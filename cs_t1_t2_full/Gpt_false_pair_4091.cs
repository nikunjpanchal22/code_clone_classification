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



static void Main(string[] args)
{
    ConnectionStringSettings csv = ConfigurationManager.ConnectionStrings["csv"];
    List<Stat> stats = new List<Stat>();

    using (OleDbConnection cn = new OleDbConnection(csv.ConnectionString))
    {
        cn.Open();
        using (OleDbCommand cmd = cn.CreateCommand())
        {
            cmd.CommandText = "SELECT * FROM [Stats.csv]";
            cmd.CommandType = CommandType.Text;
            using (OleDbDataReader reader = cmd.ExecuteReader(CommandBehavior.CloseConnection))
            {
                int fieldSport = reader.GetOrdinal("sport");
                int fieldDate = reader.GetOrdinal("date");
                int fieldTeamOne = reader.GetOrdinal("teamone");
                int fieldTeamTwo = reader.GetOrdinal("teamtwo");
                int fieldScore = reader.GetOrdinal("score");

                while (reader.Read())
                {
                    stats.Add(new Stat
                    {
                        Sport = reader.GetString(fieldSport),
                        Date = reader.GetDateTime(fieldDate),
                        TeamOne = reader.GetString(fieldTeamOne),
                        TeamTwo = reader.GetString(fieldTeamTwo),
                        Score = reader.GetInt32(fieldScore)
                    });
                }
            }
        }
    }

    foreach (Stat stat in stats)
    {
        Console.WriteLine("Sport: {0}", stat.Sport);
    }
}
