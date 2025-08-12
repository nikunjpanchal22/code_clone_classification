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
    UpdateValue(1);
    Console.WriteLine (method.GetCustomAttributes (false).OfType < TestAttribute > ().First ().SomeValue);
    UpdateValue(2);
    Console.WriteLine (method.GetCustomAttributes (false).OfType < TestAttribute > ().First ().SomeValue);
    UpdateValue(3);
    Console.WriteLine (type.GetCustomAttributes (false).OfType < TestAttribute > ().First ().SomeValue);
    UpdateValue(4);
    Console.WriteLine (type.GetCustomAttributes (false).OfType < TestAttribute > ().First ().SomeValue);
    Console.ReadLine ();
}


