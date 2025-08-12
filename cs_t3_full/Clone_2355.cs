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
    for(long i = 0; i < 7500000; i++){
        dict.Add(i, (uint) i);
    }
    Test data = new Test{Data = dict};
    using (Stream stream = File.Create("data.dat"))
    {
        BinaryFormatter formatter = new BinaryFormatter();
        formatter.Serialize(stream, data);
    }
    dict.Clear();
    Stream stream2 = File.OpenRead("data.dat");
    BinaryFormatter formatter2 = new BinaryFormatter();
    Serializer.Merge<Test>(stream2, data);
    stream2.Close();
}


