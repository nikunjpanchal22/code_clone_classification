static void Main (string [] args) {
    Random rand = new Random ();
    int number = rand.Next (1, 1000);
    byte [] intBytes = BitConverter.GetBytes (number);
    string answer = "";
    for (int i = 0; i < intBytes.Length; i ++) {
        answer += intBytes [i] + @"\";
    }
    Console.WriteLine (answer);
    Console.WriteLine (number);
    Console.ReadKey ();
}


//Variant 1
static void Main (string [] args) {
    Random rand = new Random ();
    int number = rand.Next (1, 1000);
    int [] intVals = BitConverter.GetInt32 (number);
    string answer = "";
    for (int i = 0; i < intVals.Length; i ++) {
        answer += intVals [i] + @"\";
    }
    Console.WriteLine (answer);
    Console.WriteLine (number);
    Console.ReadKey ();
}
