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
    using (StreamReader read = new StreamReader(args[0], Encoding.UTF8))
    using (StreamWriter write = new StreamWriter(args[1], false, Encoding.Unicode))
    {
        string line;
        while ((line = read.ReadLine()) != null)
        {
            write.WriteLine(line);
        }
    }
}
