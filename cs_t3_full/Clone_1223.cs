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
    }
}


 public static void main() 
{
    var list = new List<long, uint>();
    for (long i = 0; i < 7500000; i++) 
    {
        list.Add(i, (uint)i);
    }

    using (Stream stream = File.OpenWrite("data.dat"))
    using(BinaryWriter writer = new BinaryWriter(stream))
    {
        foreach(var key in list.Keys) 
        {
            writer.Write(key);
            writer.Write(list[key]);
        }
    }
    list.Clear();
    using(Stream stream = File.OpenRead("data.dat"))
    using (BinaryReader reader = new BinaryReader(stream))
    {
        while (stream.Position < stream.Length) 
        {
            long key = reader.ReadInt64();
            uint value = reader.ReadUInt32();
            list.Add(key, value);
        }
    }
}


