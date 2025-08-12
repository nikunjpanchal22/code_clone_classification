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


 static void Main(string[] args) 
{ 
    int number = 0; 
    Random rand = new Random(); 
    number = rand.Next(1, 1000); 
    string answer = string.Empty; 
    byte[] intBytes = BitConverter.GetBytes(number); 
    if (BitConverter.IsLittleEndian) 
        Array.Reverse(intBytes); 
    foreach (byte intByte in intBytes) 
        answer += intByte + @"\"; 
    Console.WriteLine(answer); 
    Console.WriteLine(number); 
    Console.ReadKey(); 
} 


