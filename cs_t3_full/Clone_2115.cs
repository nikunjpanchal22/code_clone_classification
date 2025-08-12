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
    string selection = Console.ReadLine();
    FunctionExecute functionExecute = new FunctionExecute(55000, 5500);
    switch(selection)
    {
        case "1": Test(functionExecute.ExecuteListSum); break;
        case "2": Test(functionExecute.ExecuteArraySum); break;
        default: Test(functionExecute.ExecuteBothSum); break;
    }
}


