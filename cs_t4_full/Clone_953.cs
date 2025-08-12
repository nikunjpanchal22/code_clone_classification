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
    List<int> numbers = GetFibonacciSeries().ToList();
    for(int i = 0; i< numbers.Count; i++)
    {
        if(sum + numbers[i] > 4000000) break;
        sum += numbers[i];
    }
    Console.WriteLine(sum);
}


