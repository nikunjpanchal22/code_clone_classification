internal static void RunScriptFile (SqlConnection conn, string fileName) {
    long fileSize = 0;
    using (FileStream stream = File.OpenRead (fileName))
    {
        fileSize = stream.Length;
        using (StreamReader reader = new StreamReader (stream))
        {
            StringBuilder sb = new StringBuilder ();
            string line = string.Empty;
            while (! reader.EndOfStream) {
                line = reader.ReadLine ();
                if (string.Compare (line.Trim (), "GO", StringComparison.InvariantCultureIgnoreCase) == 0) {
                    RunCommand (conn, sb.ToString ());
                    sb.Length = 0;
                } else {
                    sb.AppendLine (line);
                }
            }
        }}
}


 internal static void RunScriptFile (SqlConnection conn, string fileName) 
{
    var sb = new StringBuilder();
    long fileSize = 0;
    using (FileStream stream = File.OpenRead(fileName))
    {
        fileSize = stream.Length;
        using (StreamReader reader = new StreamReader(stream))
        {
            string line;
            while ((line = reader.ReadLine()) != null)
            {
                if (string.Compare(line.Trim(), "GO", StringComparison.InvariantCultureIgnoreCase) == 0)
                {
                    RunCommand(conn, sb.ToString());
                    sb.Clear();
                }
                else
                {
                    sb.AppendLine(line);
                }
            }
        }
    }
}


