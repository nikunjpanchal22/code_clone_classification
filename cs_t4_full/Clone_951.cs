static void Main (string [] args) {
    var sum = 0;
    foreach (var number in GetEvenFibonacciSeries ()) {
        if (sum + number > 4000000)
            break;
        sum += number;
    }
    Console.WriteLine (sum);
}


 static void Main(string[] args) {
    int sum = 0;
    var numbers = GetFibonacciSeries();
    for(int i = 0; i< numbers.Length; i++)
    {
        if(sum + numbers[i] > 4000000) break;
        sum += numbers[i];
    }
    Console.WriteLine(sum);
}


