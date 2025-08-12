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
    StreamWriter sw = new StreamWriter("data.dat");
    JavaScriptSerializer js = new JavaScriptSerializer();
    string obj = js.Serialize(data);
    sw.Write(obj);
    sw.Close();
    dict.Clear();
    StreamReader sr = new StreamReader("data.dat");
    JavaScriptSerializer formatter = new JavaScriptSerializer();
    Serializer.Merge<Test>(sr, formatter.Deserialize<Test>(sr.ReadToEnd()));
    sr.Close();
}


