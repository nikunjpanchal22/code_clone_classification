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
    string userInput = Console.ReadLine();
    CodeRunner codeRunner = new CodeRunner(15000,1500);
    if (userInput == "1") RunCode(codeRunner.RunListSum);
    else if (userInput == "2") RunCode(codeRunner.RunArraySum);
    else RunCode(codeRunner.RunMixedSum);
}


