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
    string myWord = ""; 
    int pos = -1; 
    int index = 0; 

    while (myWord != searchText && index < x.Length) 
    { 
        pos = index; 
        while ((x[index] != ' ' || x[index] != '\n') && index < x.Length) 
        { 
            myWord += x[index]; 
            index++; 
        } 
        myWord = ""; 
        index++; 
    } 

    if (pos > -1) 
    { 
        Console.WriteLine("The string found at position:" + (pos + 1)); 
    } 

    Console.ReadLine(); 
}


