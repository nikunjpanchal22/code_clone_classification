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
    int x = 1234;
    int y = 4321;
    Console.WriteLine ("Before: x {0} and y {1}", x, y);
    y = y - x;
    x = x + y;
    y = x - y;
    Console.WriteLine ("After: x {0} and y {1}", x, y);
}
