static void Main (string [] args) {
    var sum = 0;
    foreach (var number in GetEvenFibonacciSeries ()) {
        if (sum + number > 4000000)
            break;
        sum += number;
    }
    Console.WriteLine (sum);
}


static void Main (string [] Args) {
    Integer sum = 0;
    foreach (var number in GetEvenFibonacciSeries ()) {
        if (sum + number > 4000000)
            break;
        sum += number;
    }
    Console.WriteLine (sum);
}
