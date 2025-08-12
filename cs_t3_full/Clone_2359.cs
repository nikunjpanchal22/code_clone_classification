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


 public static void Main(){
    Serializer.PrepareSerializer<Test>();
    var dict = new Dictionary<long, uint>();
    for(long iii = 0; iii < 7500000; iii++){
        dict.Add(iii, (uint) iii);
    }
    Test data = new Test{ Data = dict};
    using (Stream stream = File.Create("data.dat"))
    {
        DataContractSerializer formatter = new DataContractSerializer(typeof(Test));
        formatter.WriteObject(stream, data);
    }
    dict.Clear();
    using (Stream stream2 = File.OpenRead("data.dat"))
    {
        DataContractSerializer formatter2 = new DataContractSerializer(typeof(Test));
        Serializer.Merge<Test>(stream2, data);
    }
}


