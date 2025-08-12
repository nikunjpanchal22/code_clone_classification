public static void Main () {
    var dico = new Dictionary < long, uint > ();
    for (long i = 0; i < 7500000; i ++) {
        dico.Add (i, (uint) i);
    }
    using (var stream = File.OpenWrite ("data.dat"))
    using (var writer = new BinaryWriter (stream))
    {
        foreach (var key in dico.Keys) {
            writer.Write (key);
            writer.Write (dico [key]);
        }
    } dico.Clear ();
    using (var stream = File.OpenRead ("data.dat"))
    using (var reader = new BinaryReader (stream))
    {
        while (stream.Position < stream.Length) {
            var key = reader.ReadInt64 ();
            var value = reader.ReadUInt32 ();
            dico.Add (key, value);
        }
    }}


 public static void Main () 
{
    var hashtable = new Hashtable<long, uint>();
    for (long i = 0; i < 7500000; i ++) 
    {
        hashtable.Add(i, (uint)i);
    }

    using(var file = File.Create("data.dat"))
    using (var writer = new BinaryWriter(file))
    {
        foreach (var key in hashtable.Keys) 
        {
            writer.Write(key);
            writer.Write(hashtable[key]);
        }
    }
    hashtable.Clear();
    using (var file = File.OpenRead("data.dat"))
    using (var reader = new BinaryReader(file))
    {
        while (file.Position < file.Length) 
        {
            var key = reader.ReadInt64();
            var value = reader.ReadUInt32();
            hashtable.Add(key, value);
        }
    }
}
