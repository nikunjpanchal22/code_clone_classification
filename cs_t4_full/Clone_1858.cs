static int Main (string [] args) {
    try {
        int testcase = (Int32.Parse (args [0]));
        RunTest (testcase);
    }
    catch (Exception x) {
        Console.WriteLine ("test failed: " + x.Message);
        return 1;
    }
    Console.WriteLine ("test passed.");
    return 0;
}


 static int Main(string[] args)
{
    try
    {
        int testcase;
        if(Int32.TryParse(args[0], out testcase))
        {
            RunTest(testcase);
            Console.WriteLine("test passed.");
            return 0;
        }
        else 
        {
            throw new Exception();
        }
    }
    catch(Exception x)
    {
        Console.WriteLine("test failed:" + x.Message);
        return 1;
    }

}


