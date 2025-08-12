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


 public static void MainAction() 
{
    var hashmap = new HashMap<long, uint>();
    for (long i = 0; i < 7500000; i ++) 
    {
        hashmap.Add(i, (uint)i);
    }

    using(FileStream file = File.OpenWrite("data.dat"))
    using(BinaryWriter writer = new BinaryWriter(file))
    {
        foreach(var key in hashmap.Keys) 
        {
            writer.Write(key);
            writer.Write(hashmap[key]);
        }
    }
    hashmap.Clear();
    using(FileStream file = File.OpenRead("data.dat"))
    using(BinaryReader reader = new BinaryReader(file))
    {
        while (file.Position < file.Length) 
        {
            var key = reader.ReadInt64();
            var value = reader.ReadUInt32();
            hashmap.Add(key, value);
        }
    }
}
