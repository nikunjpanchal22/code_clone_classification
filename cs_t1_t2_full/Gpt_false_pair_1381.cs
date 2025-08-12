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
    using (StreamReader source = new StreamReader(args[0], Encoding.UTF8))
    using (StreamWriter output = new StreamWriter(args[1], false, Encoding.Unicode))
    {
        string line;
        while ((line = source.ReadLine()) != null)
        {
            output.WriteLine(line);
        }
    }
}
