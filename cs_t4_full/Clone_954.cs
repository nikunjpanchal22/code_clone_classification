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
    IEnumerator<int> nums = GetFibonacciSeries().GetEnumerator();
    while(nums.MoveNext())
    {
        if (sum + nums.Current > 4000000) break;
        sum += nums.Current;
    }
    Console.WriteLine(sum);
}


