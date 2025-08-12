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
    int num1 = 1234;
    int num2 = 4321;
    Console.WriteLine ("Before: num1 {0} and num2 {1}", num1, num2);
    num2 = num2 - num1;
    num1 = num1 + num2;
    num2 = num1 - num2;
    Console.WriteLine ("After: num1 {0} and num2 {1}", num1, num2);
}
