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
    for (int i = 0; i < deserealizedArray.Count; i++) 
    {
        Console.WriteLine(deserealizedArray[i]);
    }
    Console.WriteLine("---");
    siteList.Add("Test 1");
    siteList.Add("Test 2");
    int listCount = siteList.Count;
    for (int i = 0; i < listCount; i++) 
    {
        Console.WriteLine(siteList[i]);
    }
    SerializeArray(siteList);
    if (siteList.Contains("Test 2"))
    {
        Console.WriteLine("Test 2 exists!");
        Console.Read();
    }
}


