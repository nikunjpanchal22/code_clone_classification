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
    for(long l = 0; l < 7500000; l++){
        dict.Add(l, (uint) l);
    }
    Test data = new Test{Data = dict};
    using (TextWriter tw = new StreamWriter("data.dat"))
    {
        JavaScriptSerializer js = new JavaScriptSerializer();
        js.Serialize(data, tw);
    }
    dict.Clear();
    TextReader reader = new StreamReader("data.dat");
    JavaScriptSerializer jss = new JavaScriptSerializer();
    Serializer.Merge<Test>(reader, jss.Deserialize<Test>(reader.ReadToEnd()));
    reader.Close();

}


