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
    string input = Console.ReadLine();
    LoopExec loopExec = new LoopExec(25000, 2500);
    switch(input)
    {
        case "1": RunMethod(loopExec.RunListSum); break;
        case "2": RunMethod(loopExec.RunArraySum); break;
        default: RunMethod(loopExec.RunBothSum); break;
    }
}


