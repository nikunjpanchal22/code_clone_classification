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
    for(long j = 0; j < 7500000; j++){
        dict.Add(j, (uint) j);
    }
    Test data = new Test{Data = dict};
    Stream fs = new FileStream("data.dat", FileMode.Create);
    BinaryFormatter bf = new BinaryFormatter();
    bf.Serialize(fs, data);
    fs.Close();
    dict.Clear();
    using (var stream = File.OpenRead("data.dat"))
    { 
        BinaryFormatter formatter = new BinaryFormatter();
        Serializer.Merge<Test>(stream, data);
    }

}


