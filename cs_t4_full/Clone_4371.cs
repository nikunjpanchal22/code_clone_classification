public static void Main () {
    Serializer.PrepareSerializer < Test > ();
    var dico = new Dictionary < long, uint > ();
    for (long i = 0; i < 7500000; i ++) {
        dico.Add (i, (uint) i);
    }
    var data = new Test {Data = dico};
    using (var stream = File.OpenWrite ("data.dat"))
    {
        Serializer.Serialize (stream, data);
    } dico.Clear ();
    using (var stream = File.OpenRead ("data.dat"))
    {
        Serializer.Merge < Test > (stream, data);
    }}


 public static void Main()
{
    Serializer.PrepareSerializer<Test>();
    var dict = new Dictionary<long, uint>();
    for(long b = 0; b < 7500000; b++)
    {
        dict.Add(b, (uint) b);
    }
    Test data = new Test { Data = dict };
    FileStream fs = File.OpenWrite("data.dat");
    XmlWriter xwriter = XmlWriter.Create(fs, new XmlWriterSettings { Indent = true });
    XmlSerializer xs = new XmlSerializer(typeof(Test));
    xs.Serialize(xwriter, data);
    fs.Close();
    dict.Clear();
    FileStream stream = File.OpenRead("data.dat");
    XmlReader xreader = XmlReader.Create(stream);
    XmlSerializer formatter = new XmlSerializer(typeof(Test));
    Serializer.Merge<Test>(xreader, data);
    xreader.Close();
    stream.Close();
}


