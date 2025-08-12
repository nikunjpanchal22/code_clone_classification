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
    var task = Task.Run<Dictionary<long, uint>>(() =>
    {
        var dico = new Dictionary<long, uint>();
        for (long i = 0; i < 7500000; i++) dico.Add(i, (uint)i);
        return dico;
    });
    task.Wait();

    var data = new Test {Data = task.Result};
    Serializer.Serialize (File.Create ("data.dat"), data);
    data.Data.Clear ();

    using (var stream = File.OpenRead ("data.dat"))
    {
        Serializer.Merge < Test > (stream, data);
    }
}


