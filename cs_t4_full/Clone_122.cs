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


 static void Main() {
    using (MemoryStream ms = new MemoryStream())
    {
        ms.WriteInt32(123);
        WritePerson(ms, new Person {Name = "Fred"});
        ms.WriteString("abc");
        ms.Position = 0;
        ReadAll(ms);
    }
}

