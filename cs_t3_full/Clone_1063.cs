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


 static void Main (string [] args) {
    String a = "Hello ";
    String b = " World! ";
    int it = 20000;
    char[] result = new char[a.Length + it * b.Length];
    Buffer.BlockCopy(a.ToCharArray(), 0, result, 0, a.Length * 2);
    int offset = a.Length;
    for (int i = 0; i < it; i++) {
        Buffer.BlockCopy(b.ToCharArray(), 0, result, offset * 2, b.Length * 2);
        offset += b.Length;
    }
    Console.WriteLine(result);
} 


