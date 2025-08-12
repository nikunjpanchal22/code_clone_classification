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
    string choice = Console.ReadLine();
    MainCode mainCode = new MainCode(30000, 3000);
    if (choice == "1") Test(mainCode.SumList);
    else if (choice == "2") Test(mainCode.SumArray);
    else Test(mainCode.SumBoth);
}


