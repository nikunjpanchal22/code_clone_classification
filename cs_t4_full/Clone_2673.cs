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





public static void Main () {
    Serializer.PrepareSerializer < Test > ();
    var dict = new Dictionary<long, uint>(7500000);

    for (long i = 0; i < 7500000; i++)
        dict.Add(i, (uint)i);

    var data = new Test {Data = dict};
    Serializer.Serialize(File.Open("data.dat", FileMode.Create), data);

    dict.Clear();
    Serializer.Merge<Test>(File.OpenRead("data.dat"), data);
}


