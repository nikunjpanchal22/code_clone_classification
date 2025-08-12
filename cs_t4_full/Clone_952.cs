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
    var fiboNumbers = GetEvenFibonacciSeries();
    for (int i = 0; i < fiboNumbers.Length; i++)
    {
        if(sum + fiboNumbers[i] > 4000000) break;
        sum +=fiboNumbers[i];
    }
    Console.WriteLine(sum);
}


