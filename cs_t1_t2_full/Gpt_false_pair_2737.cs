static void Main (string [] args) {
    Console.WriteLine ("Enter the string");
    string x = Console.ReadLine ();
    Console.WriteLine ("enter the string to be searched");
    string SearchText = Console.ReadLine ();
    string [] myarr = new string [30];
    myarr = x.Split (' ');
    int i = 0;
    foreach (string s in myarr) {
        i = i + 1;
        if (s == SearchText) {
            Console.WriteLine ("The string found at position:" + i);
        }
    }
    Console.ReadLine ();
}


static void Main (string [] args) {
    Console.WriteLine ("Enter the string");
    string x = Console.ReadLine ();
    Console.WriteLine ("enter the string to be searched");
    string SearchText = Console.ReadLine ();
    string [] myarr = new string [30];
    myarr = x.Split (' ');
    int index = 0;
    foreach (string s in myarr) {
        index++;
        if (s == SearchText) {
            Console.WriteLine ("The string found at position:" + index);
        }
    }
    Console.ReadLine ();
}
