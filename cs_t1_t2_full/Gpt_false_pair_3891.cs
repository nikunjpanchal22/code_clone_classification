static void Main (string [] args) {
    var sum = 0;
    foreach (var number in GetEvenFibonacciSeries ()) {
        if (sum + number > 4000000)
            break;
        sum += number;
    }
    Console.WriteLine (sum);
}


static void Main (string [] args) {
    int sum = 0;
    foreach (var i in GetEvenFibonacciSeries ()) {
        if (sum + i > 4000000)
            break;
        sum += i;
    }
    Console.WriteLine (sum);
}
