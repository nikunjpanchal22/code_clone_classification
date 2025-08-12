void Main () {
    Foo < int > fooObject = new Foo < int > ();
    fooObject.Items = new List < int > {1, 2, 3};
    object obj = (object) fooObject;
    PropertyInfo propInfo = obj.GetType ().GetProperty ("Items");
    object itemValue = propInfo.GetValue (obj, null);
    Console.WriteLine (itemValue);
    IList values = (IList) itemValue;
    foreach (var val in values)
        Console.WriteLine (val);
}


  void Main () {
    Foo < int > fooObject = new Foo < int > ();
    Dictionary<int, int> dictionayList = new Dictionary<int, int>();
    //add elements in dictionary
    dictionaryList.Add(1, 1); 
    dictionaryList.Add(2, 2);
    dictionaryList.Add(3, 3);
    object obj = (object) fooObject;
    Type type = obj.GetType ();
    PropertyInfo [] propInfo = type.GetProperties();
    foreach( PropertyInfo item in propInfo )
    {
        if (item.Name == "Items")
        {
            item.SetValue(obj, dictionaryList, null);
        }
    }
    Console.WriteLine (itemValue);
    IList values = (IList) itemValue;
    foreach (var val in values)
        Console.WriteLine (val);
}


