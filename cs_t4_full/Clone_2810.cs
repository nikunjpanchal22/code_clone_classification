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
    var num = Console.ReadLine();
    var exe = new MyLoop(5000, 500);
    if (num == "1") Execute(exe.SumOfList);
    else if (num == "2") Execute(exe.SumOfArray);
    else Execute(exe.SumOfBoth);
}


