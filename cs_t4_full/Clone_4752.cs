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


 public static void Main() 
{ 
   var dico = new Dictionary<long,uint>(); 
   for (long i = 0; i < 7500000; i++) 
   { 
      dico.Add(i, Convert.ToUInt32(i)); 
   } 
   Stream stream = new FileStream("data.dat", FileMode.Create);
   BinaryWriter writer = new BinaryWriter(stream);
   foreach (long key in dico.Keys)
   {
      writer.Write(key);
      writer.Write(dico[key]);
   }
   dico.Clear();

   Stream readStream = new FileStream ("data.dat", FileMode.Open);
   BinaryReader reader = new BinaryReader(readStream);
   
   while (readStream.Position < readStream.Length)
   {
      long key = reader.ReadInt64();
      uint value = reader.ReadUInt32();
      dico.Add(key, value);
   }
}


