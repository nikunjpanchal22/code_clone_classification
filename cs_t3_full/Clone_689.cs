public static void Main () {
    try {
        Console.WriteLine ("Before throwing");
        throw new Exception ("Exception!");
    }
    finally {
        Console.WriteLine ("In finally");
        Console.ReadLine ();
    }
}


 public static void Main(string[] args)
        {
            try
            {
                Console.WriteLine("Before throwing");
                throw new Exception("Exception!");
            }
            catch (Exception ex)
            {
                Console.WriteLine($"Exception: {ex.Message}");
            }
            finally
            {
                Console.WriteLine("In finally");
                Console.ReadLine();
            }
}


