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
    int index = 0; 
    int pos = -1; 
    int len = searchText.Length; 

    while (x.IndexOf(searchText, pos + 1) > -1) 
    { 
        // pos = x.IndexOf(searchText, index); 
        for (int i = 0; i < len; i++) 
        { 
            if (x[index++] != searchText[i]) 
                break; 
            else
            { 
                if (i == len - 1) 
                    pos = index - len; 
            } 
        } 
    } 

    if (pos > -1) 
    { 
        Console.WriteLine("The string found at position:" + (pos + 1)); 
    } 

    Console.ReadLine(); 
} 


