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


 static void Main (string [] args) {
    Random rand = new Random ();
    int number = rand.Next (1, 1000);
    byte [] intBytes = BitConverter.GetBytes (number);
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < intBytes.Length; i++)
    {
        sb.Append(intBytes[i]);
        sb.Append('\\');
    }
    string answer = sb.ToString().TrimEnd('\\');
    Console.WriteLine (answer);
    Console.WriteLine (number);
    Console.ReadKey ();
}


