static void Main () {
    using (MemoryStream ms = new MemoryStream ())
    {
        WriteNext (ms, 123);
        WriteNext (ms, new Person {Name = "Fred"});
        WriteNext (ms, "abc");
        ms.Position = 0;
        while (ReadNext (ms)) {
        }
    }
}


 static void Main()
{
    using (MemoryStream ms = new MemoryStream())
    {
        using (BinaryWriter bw = new BinaryWriter(ms))
        {
            bw.Write((Int32)123);
            WritePerson(bw, new Person {Name = "Fred"});
            bw.Write("abc");
            bw.Flush();
            ms.Position = 0;
            while (ReadNext(ms)) {
            }
        }
    } 
}


