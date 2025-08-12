static void Main (string [] args) {
    ArrayList siteList = new ArrayList ();
    ArrayList deserealizedArray = DeserializeArray ();
    foreach (var item in deserealizedArray) {
        Console.WriteLine (item);
    }
    Console.WriteLine ("---");
    siteList.Add ("Test 1");
    siteList.Add ("Test 2");
    foreach (var item in siteList) {
        Console.WriteLine (item);
    }
    SerializeArray (siteList);
    if (siteList.Contains ("Test 2")) {
        Console.WriteLine ("Test 2 exists!");
        Console.Read ();
    }
}


  static void Main(string[] args)
{
    ArrayList siteList = new ArrayList();
    ArrayList deserealizedArray = DeserializeArray();
    foreach (var item in deserealizedArray) 
    {
        Console.WriteLine("{0}", item);
    }
    Console.WriteLine("---");
    siteList.Add("Test 1");
    siteList.Add("Test 2");
    IEnumerator listEnumerator = siteList.GetEnumerator();
    while(listEnumerator.MoveNext())
    {
        Console.WriteLine("{0}", listEnumerator.Current.ToString());
    }
    SerializeArray(siteList);
    if (siteList.Contains("Test 2")) 
    {
        Console.WriteLine("Test 2 exists!");
        Console.Read();
    }
}


