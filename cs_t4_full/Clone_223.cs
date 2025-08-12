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
    Console.WriteLine ("Enter number(s): ");
    List <double> values = new List <double> ();
    while (values.Count < 3) {
       values.Add (double.Parse (Console.ReadLine ()));
    }
    average (values.ToArray ());
    Console.ReadKey ();
}


