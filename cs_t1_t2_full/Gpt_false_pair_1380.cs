static void Main (string [] args) {
    using (StreamReader sr = new StreamReader (args [0], Encoding.UTF8))
    using (StreamWriter sw = new StreamWriter (args [1], false, Encoding.Unicode))
    {
        string line;
        while ((line = sr.ReadLine ()) != null) {
            sw.WriteLine (line);
        }
    }}


 static void Main(string[] args)
{
    using (StreamReader reader = new StreamReader(args[0], Encoding.UTF8))
    using (StreamWriter writer = new StreamWriter(args[1], false, Encoding.Unicode))
    {
        string line;
        while ((line = reader.ReadLine()) != null)
        {
            writer.WriteLine(line);
        }
    }
}
