static void Main (string [] args) {
    Console.WriteLine ("Enter number(s): ");
    double [] values = new double [3];
    for (int i = 0; i < values.Length; i ++) {
        values [i] = Convert.ToDouble (Console.ReadLine ());
    }
    average (values);
    Console.ReadKey ();
}


 static void Main (string [] args) {
        Console.WriteLine ("Entrar número(s): ");
        double [] valores = new double [3];
        for (int i = 0; i < valores.Length; i ++) {
        valores [i] = Convert.ToDouble (Console.ReadLine ());
        }
        calcularMediaAritmetica (valores);
        Console.ReadKey ();
}
