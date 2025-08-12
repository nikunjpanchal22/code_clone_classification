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
    var option = Console.ReadLine();
    var logic = new LoopLogic(10000, 1000);
    if (option == "1") Execute(logic.GetSumFromList());
    else if (option == "2") Execute(logic.GetSumFromArray());
    else Execute(logic.GetSumFromBoth());
}


