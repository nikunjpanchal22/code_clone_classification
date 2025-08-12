public static void Main () {
    int a = 1234;
    int b = 4321;
    Console.WriteLine ("Before: a {0} and b {1}", a, b);
    b = b - a;
    a = a + b;
    b = a - b;
    Console.WriteLine ("After: a {0} and b {1}", a, b);
}


 public static void Main () {
         int a = 1234;
         int b = 4321;
         Console.WriteLine ("Before: a {0} and b {1}", a, b);
         b = b - a;
         a = a ^ b;
         b = a ^ b;
         a = a ^ b;
         Console.WriteLine ("After: a {0} and b {1}", a, b);
}


