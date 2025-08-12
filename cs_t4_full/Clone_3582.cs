static void Main (string [] args) {
    List < string > list = new List < string > ();
    list.Add ("Bill cat had");
    list.Add ("Bill had a cat");
    list.Add ("Bill had cat");
    list.Add ("Cat had Bill");
    Regex rex = new Regex (@"((Bill)).*((had)).*((cat))");
    foreach (string str in list) {
        if (rex.IsMatch (str)) {
            Console.WriteLine (str);
        }
    }
    Console.ReadLine ();
}





static void Main(string[] args) {
    List<string> list = new List<string> { "Bill cat had", "Bill had a cat", "Bill had cat", "Cat had Bill" };
    Regex rex = new Regex (@"((Bill)).*((had)).*((cat))");
    list.Where(str => rex.IsMatch(str)).ToList().ForEach(Console.WriteLine);
    Console.ReadLine();
}


