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
    float [] counts = new float [3];
    for (int i = 0; i < counts.Length; i ++) {
        counts [i] = Convert.ToSingle (Console.ReadLine ());
    }
    average (counts);
    Console.ReadKey ();
}
