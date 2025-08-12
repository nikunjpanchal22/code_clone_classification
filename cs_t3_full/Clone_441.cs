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
    Program.ChangeValue (1);
    Console.WriteLine (method.GetCustomAttributes (false).OfType < TestAttribute > ().First ().SomeValue);
    Program.ChangeValue (2);
    Console.WriteLine (method.GetCustomAttributes (false).OfType < TestAttribute > ().First ().SomeValue);
    Program.ChangeValue (3);
    Console.WriteLine (type.GetCustomAttributes (false).OfType < TestAttribute > ().First ().SomeValue);
    Program.ChangeValue (4);
    Console.WriteLine (type.GetCustomAttributes (false).OfType < TestAttribute > ().First ().SomeValue);
    Console.ReadLine ();
}


