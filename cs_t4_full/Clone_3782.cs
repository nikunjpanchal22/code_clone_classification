static void Main (string [] args) {
    var l = new List < List < double > > () {new List < Double > () {0, 16.0000, 15.0000, 0, 2.7217, 3.7217}, new List < Double > () {0, 0, 15.0000, 15.0000, 5.6904, 5.6904}};
    int i = 1;
    var result = from sublist in l
        select new {min = sublist.Min (), max = sublist.Max (), index = i ++};
    foreach (var r in result)
        Console.WriteLine (String.Format ("Index: {0} Min: {1} Max: {2}", r.index, r.min, r.max));
    Console.ReadKey ();
}





static void Main(string[] args)
{
    List<List<double>> lists = new List<List<double>>
    {
        new List<double> {0, 16.0000, 15.0000, 0, 2.7217, 3.7217},
        new List<double> {0, 0, 15.0000, 15.0000, 5.6904, 5.6904}
    };

    lists.Select((item, index) => new {item, index})
        .ToList()
        .ForEach(x => Console.WriteLine($"Index: {x.index + 1} Min: {x.item.Min()} Max: {x.item.Max()}"));

    Console.ReadKey();
}


