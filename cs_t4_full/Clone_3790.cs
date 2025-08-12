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





static void Main(string[] args)
{
    Console.Write("Enter the string: ");
    string[] words = Console.ReadLine().Split(' ');
    Console.Write("Enter the string to be searched: ");
    string search = Console.ReadLine();
    int pos = Array.IndexOf(words, search) + 1;
    if (pos > 0) Console.WriteLine($"The string found at position: {pos}");
}


