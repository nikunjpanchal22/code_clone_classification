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
    int deserealizedArrayLength = deserealizedArray.Count;
    for (int i = 0; i < deserealizedArrayLength; i++) 
    {
        object item = deserealizedArray[i];
        Console.WriteLine(item);
    }
    Console.WriteLine("---");
    siteList.Add("Test 1");
    siteList.Add("Test 2");
    int listCount = siteList.Count;

    for (int i = 0; i < listCount; i++) 
    {
        object item = siteList[i];
        Console.WriteLine(item);
    }
    SerializeArray(siteList);
    if (siteList.Contains("Test 2")) 
    {
        Console.WriteLine("Test 2 exists!");
        Console.Read();
    }
}


