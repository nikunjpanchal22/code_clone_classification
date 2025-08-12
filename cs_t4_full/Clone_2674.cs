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
    var dico = Enumerable.Range(0, 7500000).ToDictionary(i => (long)i, i => (uint)i);

    var data = new Test {Data = dico};
    var json = JsonConvert.SerializeObject(data);
    File.WriteAllText("data.dat", json);

    data.Data.Clear();
    json = File.ReadAllText("data.dat");
    data = JsonConvert.DeserializeObject<Test>(json);
}


