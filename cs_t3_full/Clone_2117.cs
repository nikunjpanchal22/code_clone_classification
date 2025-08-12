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
    var userChoice = Console.ReadLine();
    var calculator = new Calculator(50000, 5000);
    switch(userChoice)
    {
        case "1": TestExec(calculator.ComputeListSum); break;
        case "2": TestExec(calculator.ComputeArraySum); break;
        default: TestExec(calculator.ComputeBothSum); break;
    }
}


