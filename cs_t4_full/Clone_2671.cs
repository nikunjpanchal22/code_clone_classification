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

    var numbers = Enumerable.Range(0, 7500000);
    var dico = numbers.ToDictionary(num => (long)num, num => (uint)num);
    var data = new Test {Data = dico};

    using(var fileStream = new FileStream("data.dat", FileMode.Create))
        Serializer.Serialize(fileStream, data);

    dico.Clear();

    using(var fileStream = new FileStream("data.dat", FileMode.Open))
        Serializer.Merge(fileStream, data);
}


