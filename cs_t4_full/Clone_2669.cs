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
    Func<Dictionary<long, uint>> construct = () =>
    {
        var dico = new Dictionary<long, uint>();
        for(long i = 0; i < 7500000; i++) dico[i] = (uint)i;
        return dico;
    };
    
    var data = new Test {Data = construct()};

    Serializer.PrepareSerializer<Test>();
    Serializer.Serialize(new StreamWriter("data.dat").BaseStream, data);

    data.Data.Clear();

    data = Serializer.Merge<Test>(new StreamReader("data.dat").BaseStream);
}


