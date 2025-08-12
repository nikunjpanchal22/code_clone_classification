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
    int [] numbers = new int [3];
    for (int i = 0; i < numbers.Length; i ++) {
        numbers [i] = Convert.ToInt32 (Console.ReadLine ());
    }
    average (numbers);
    Console.ReadKey ();
}
