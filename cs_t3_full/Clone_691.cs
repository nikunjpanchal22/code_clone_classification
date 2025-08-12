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


 public static void Main () {
            try
        {
            Console.WriteLine("Before throwing");
        }
        catch (Exception ex)
        {
            Console.WriteLine(ex.Message);
        }
        finally
        {
            Console.WriteLine("In finally");
            throw new Exception("Exception!");
            Console.ReadLine();
        }
}


