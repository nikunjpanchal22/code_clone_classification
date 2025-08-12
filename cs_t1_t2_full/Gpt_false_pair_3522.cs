static void Main () {
    using (MemoryStream ms = new MemoryStream ())
    {
        WriteNext (ms, 123);
        WriteNext (ms, new Person {Name = "Fred"});
        WriteNext (ms, "abc");
        ms.Position = 0;
        while (ReadNext (ms)) {
        }
    }}


#====================
#gpt output=============

// Type 3 Variant
static void Main () {
    using (MemoryStream ms = new MemoryStream ())
    {
        WriteNext (ms, 123);
        Person person = new Person {Name = "Fred"};
        WriteNext (ms, person);
        WriteNext (ms, "abc");
        ms.Position = 0;
        while (ReadNext (ms)) {
        }
    }}

// Type 4 Variant
static void Main () {
    MemoryStream ms = new MemoryStream ();
    try {
        WriteNext (ms, 123);
        WriteNext (ms, new Person {Name = "Fred"});
        WriteNext (ms, "abc");
        ms.Position = 0;
        while (ReadNext (ms)) {
        }
    } finally {
        ms.Close();
    }
}


static void Main () {
    using (MemoryStream ms = new MemoryStream ())
    {
        WriteNext (ms, 123);
        Person person = new Person {Name = "Fred"};
        WriteNext (ms, person);
        WriteNext (ms, "abc");
        ms.Position = 0;
        while (ReadNext (ms)) {
        }
    }}

// Type 4 Variant
static void Main () {
    MemoryStream ms = new MemoryStream ();
    try {
        WriteNext (ms, 123);
        WriteNext (ms, new Person {Name = "Fred"});
        WriteNext (ms, "abc");
        ms.Position = 0;
        while (ReadNext (ms)) {
        }
    } finally {
        ms.Close();
    }
}
