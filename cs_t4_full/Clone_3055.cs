static void Main (string [] args) {
    String a = "Hello ";
    String b = " World! ";
    int it = 20000;
    char [] result = new char [a.Length + it * b.Length];
    a.ToCharArray ().CopyTo (result, 0);
    for (int i = 0; i < it; i ++)
        b.ToCharArray ().CopyTo (result, a.Length + i * b.Length);
    Console.WriteLine (result);
}





static void Main(string[] args)
{
    string a = "Hello ";
    string b = " World! ";
    int it = 20000;
    StringBuilder result = new StringBuilder();
    result.Append(a);
    foreach(var range in Enumerable.Range(0, it))
        result.Append(b);
    Console.WriteLine (result);
}


