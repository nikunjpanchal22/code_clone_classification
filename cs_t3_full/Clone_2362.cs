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
    for(long l = 0; l < 7500000; l++)
    {
        dict.Add(l, (uint) l);
    }
    Test data = new Test { Data = dict };
    Stream fs = new FileStream("data.dat", FileMode.Create);
    DataContractSerializer dcs = new DataContractSerializer(typeof(Test));
    dcs.WriteObject(fs, data);
    dict.Clear();
    fs.Close();
    using (var stream = File.OpenRead("data.dat"))
    {
        DataContractSerializer formatter = new DataContractSerializer(typeof(Test));
        Serializer.Merge<Test>(stream, data);
    }
}


