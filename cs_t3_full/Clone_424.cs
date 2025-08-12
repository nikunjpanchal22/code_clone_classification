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
    int deserealizedCount = deserealizedArray.Count;
    for (int i = 0; i < deserealizedCount; i++) 
    {
        object item = deserealizedArray[i];
        string value = item.ToString();
        Console.WriteLine(value);
    }
    Console.WriteLine("---");
    siteList.Add("Test 1");
    siteList.Add("Test 2");
    IEnumerable listEnumerable = siteList;
    foreach (string item in listEnumerable) 
    {
        Console.WriteLine(item);
    }
    SerializeArray(siteList);
    if (siteList.Contains("Test 2")) 
    {
        Console.WriteLine("Test 2 exists!");
        Console.Read();
    }
}


