[Test] public static void Main (string [] args) {
    var method = typeof (Program).GetMethod ("Main");
    var type = typeof (Program);
    SomeValue = 1;
    Console.WriteLine (method.GetCustomAttributes (false).OfType < TestAttribute > ().First ().SomeValue);
    SomeValue = 2;
    Console.WriteLine (method.GetCustomAttributes (false).OfType < TestAttribute > ().First ().SomeValue);
    SomeValue = 3;
    Console.WriteLine (type.GetCustomAttributes (false).OfType < TestAttribute > ().First ().SomeValue);
    SomeValue = 4;
    Console.WriteLine (type.GetCustomAttributes (false).OfType < TestAttribute > ().First ().SomeValue);
    Console.ReadLine ();
}


 
[Test] public static void Main (string [] args) {
    var method = typeof (Program).GetMethod ("Main");
    var type = typeof (Program);
    int myValue = 1;
    method.GetCustomAttributes (false).OfType < TestAttribute > ().First ().SomeValue = myValue;
    Console.WriteLine (method.GetCustomAttributes (false).OfType < TestAttribute > ().First ().SomeValue);
    myValue = 2;
    method.GetCustomAttributes (false).OfType < TestAttribute > ().First ().SomeValue = myValue;
    Console.WriteLine (method.GetCustomAttributes (false).OfType < TestAttribute > ().First ().SomeValue);
    myValue = 3;
    type.GetCustomAttributes (false).OfType < TestAttribute > ().First ().SomeValue = myValue;
    Console.WriteLine (type.GetCustomAttributes (false).OfType < TestAttribute > ().First ().SomeValue);
    myValue = 4;
    type.GetCustomAttributes (false).OfType < TestAttribute > ().First ().SomeValue = myValue;
    Console.WriteLine (type.GetCustomAttributes (false).OfType < TestAttribute > ().First ().SomeValue);
    Console.ReadLine ();
}


