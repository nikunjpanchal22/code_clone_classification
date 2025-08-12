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
    var dataContractSerializer = new DataContractSerializer ();
    var dico = new Dictionary < long, uint > ();
    for (long i = 0; i < 7500000; i ++){
        dico.Add (i, (uint) i);
    }
    var data = new Test {Data = dico}; 
    using (var stream = File.OpenWrite ("data.dat")){
        dataContractSerializer.WriteObject (stream, data);
    }
    dico.Clear ();
    using (var reader = File.OpenText ("data.dat")){
        data = (Test) dataContractSerializer.ReadObject (reader);
    }
}
