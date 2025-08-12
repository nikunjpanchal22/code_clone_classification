static void Main (String [] args) {
    checked {
        Int32 original = Int32.MaxValue;
        Int16 [] result = GetShorts (original);
        Console.WriteLine ("Original int: {0:x}", original);
        Console.WriteLine ("Senior Int16: {0:x}", result [1]);
        Console.WriteLine ("Junior Int16: {0:x}", result [0]);
        Console.ReadKey ();
    }
}


 
static void Main (String [] args) {
    checked {
        Int32 original = Int32.MaxValue;
        UInt16 [] result = GetShorts (original);
        Console.WriteLine ("Original int: {0:x}", original);
        Console.WriteLine ("Senior Int16: {0:x}", result [1]);
        Console.WriteLine ("Junior Int16: {0:x}", result [0]);
        Console.ReadKey ();
    }
}
