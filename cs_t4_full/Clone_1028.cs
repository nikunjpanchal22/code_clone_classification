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
    a.CopyTo(0, result, 0, a.Length);
    int offset = a.Length;
    for (int i = 0; i < it; i++) {
        for (int j = 0; j < b.Length; j++)
            result[offset + j] = b[j];
        offset += b.Length;
    }
    Console.WriteLine(new string(result));
}


