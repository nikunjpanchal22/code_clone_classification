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
    StringBuilder bytesData = new StringBuilder(); 
    int[] bits = new int[32]; 
    int pos = 31; 
    while (number > 0) 
    { 
        bits[pos--] = number % 2; 
        number /= 2; 
    } 
    int counter = 0; 
    while (counter < 4) 
    { 
        int temp = 0; 
        int numBit = counter * 8; 
        for (int i = 0; i < 8; i++) 
        { 
            temp += bits[numBit + i] * (int)Math.Pow(2, i); 
        } 
        bytesData.Append(temp + "\\"); 
        counter++; 
    } 
    Console.WriteLine(bytesData.ToString()); 
    Console.WriteLine(number); 
    Console.ReadKey(); 
}


