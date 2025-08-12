static void Main (string [] args) {
    var l = new List < List < double > > () {new List < Double > () {0, 16.0000, 15.0000, 0, 2.7217, 3.7217}, new List < Double > () {0, 0, 15.0000, 15.0000, 5.6904, 5.6904}};
    int i = 1;
    var result = from sublist in l
        select new {min = sublist.Min (), max = sublist.Max (), index = i ++};
    foreach (var r in result)
        Console.WriteLine (String.Format ("Index: {0} Min: {1} Max: {2}", r.index, r.min, r.max));
    Console.ReadKey ();
}


static void Main (string [] args) {
    var l = new List < List < double > > () {new List < Double > () {0, 16.0000, 15.0000, 0, 2.7217, 3.7217}, new List < Double > () {0, 0, 15.0000, 15.0000, 5.6904, 5.6904}};
    int j = 1;
    var output = from sl in l
        select new {minimum = sl.Min (), maximum = sl.Max (), indice = j ++};
    foreach (var r in output)
        Console.WriteLine (String.Format ("Index: {0} Min: {1} Max: {2}", r.indice, r.minimum, r.maximum));
    Console.ReadKey ();
}
