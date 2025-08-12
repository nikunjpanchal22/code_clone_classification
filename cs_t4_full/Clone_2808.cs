static void Main (string [] args) {
    var input = Console.ReadLine ();
    var test = new ListArrayLoop (10000, 1000);
    switch (input) {
        case "1" :
            Test (test.ListSum);
            break;
        case "2" :
            Test (test.ArraySum);
            break;
        case "3" :
            test.ArraySum ();
            Test (test.ListSum);
            break;
        default :
            test.ListSum ();
            Test (test.ArraySum);
            break;
    }
}



static void Main(string[] args)
{
    var prompt = Console.ReadLine();
    var executor = new CodeImplementation(20000, 2000);
    if (prompt == "1") Execute(executor.ListSum);
    else if (prompt == "2") Execute(executor.ArraySum);
    else Execute(executor.MixedSum);
}


