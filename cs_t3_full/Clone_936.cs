static void Main (string [] args) {
    using (StreamReader sr = new StreamReader (args [0], Encoding.UTF8))
    using (StreamWriter sw = new StreamWriter (args [1], false, Encoding.Unicode))
    {
        string line;
        while ((line = sr.ReadLine ()) != null) {
            sw.WriteLine (line);
        }
    }
}


 static void Main(string[] args)
{
    using (var streamReader = new StreamReader(args[0], Encoding.UTF8))
    using (var streamWriter = new StreamWriter(args[1], false, Encoding.Unicode))
    {
        string line;
        while ((line = streamReader.ReadLine()) != null)
        {
            streamWriter.WriteLine(line);
        }
    }
}


