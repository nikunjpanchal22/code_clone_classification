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
    Console.WriteLine("Enter the string"); 
    string x = Console.ReadLine(); 
    Console.WriteLine("enter the string to be searched"); 
    string searchText = Console.ReadLine(); 
    string[] myarr = new string[30]; 
    myarr = x.Split(' '); 

    int i; 
    int pos = 0; 

    for (i = 0; i < myarr.Length; i++) 
    { 
        if (myarr[i].Contains(searchText)) 
        { 
            pos = i + 1; 
            break; 
        } 
    } 

    if (pos > 0) 
    { 
        Console.WriteLine("The string found at position:" + pos); 
    } 

    Console.ReadLine(); 
}


