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
    int number = 0; 
    StringBuilder bytesData = new StringBuilder(); 
    for (int i = 0; i <= 1000; i++) 
    { 
        number = i; 
        byte[] intBytes = new byte[sizeof(int)]; 
        Buffer.BlockCopy(BitConverter.GetBytes(number), 0, 
                                    intBytes, 0, sizeof(int)); 
        foreach (byte byteData in intBytes) 
            bytesData.Append(byteData + "\\"); 
    } 
    Console.WriteLine(bytesData.ToString()); 
    Console.WriteLine(number); 
    Console.ReadKey(); 
} 


